package com.flexops.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * The initial purpose of this class is to search for methods that are not to be used, since PMD
 * and Checkstyle do not seem to have <u><i>maven plugins</i></u> that can do this.
 * 
 * @author Hans CTR Loven, FAA SOAI Team (Lockheed Martin)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaViolationTest.class)
public class JavaViolationTest {

    private static final Logger LOG = LoggerFactory.getLogger(JavaViolationTest.class);
    private final List<String> violations = new ArrayList<String>();

    @Test
    public void testForInstancesOfDisallowedMethods() {
        File startingDir = new File("src/main/java");
        recursivelyProcessFromDir(startingDir);
        if (violations.size() > 0) {
            String failMessage = "";
            for (String v : violations) {
                failMessage += v;
            }
            LOG.error("\n" + failMessage);
            Assert.fail("Usage of System.out or System.err or (Exception).printStackTrace() - check log for details.");
        }
        Assert.assertTrue(true);
    }

    private void recursivelyProcessFromDir(File startingDir) {
        LOG.trace("PROCESSING DIR: " + startingDir);
        processJavaFileList(getCdJavaFiles(startingDir));
        for (File innerDir : getCdInnerDirs(startingDir)) {
            LOG.trace("--> found dir: " + innerDir + " within " + startingDir);
            recursivelyProcessFromDir(innerDir);
        }
    }

    private void processJavaFileList(List<File> fileList) {
        for (File javaFile : fileList) {
            LOG.trace("------> Now processing: " + javaFile.getName() + " ...");
            try {
                check(javaFile);
            } catch (IOException e) {
                Assert.fail(e.getMessage());
            }   
        }
    }

    private List<File> getCdJavaFiles(File dir) {
        LOG.trace("----> getting Java files from dir : " + dir);
        FileFilter javaFilter = new ReadableJavaFilter();
        List<File> cdJavaFiles = new ArrayList<File>();
        for (File f : dir.listFiles()) {
            if (javaFilter.accept(f)) cdJavaFiles.add(f);
        }

        return cdJavaFiles;
    }

    private List<File> getCdInnerDirs(File dir) {
        LOG.trace("----> getting inner dirs from dir : " + dir);
        FileFilter javaFilter = new ReadableDirFilter();
        List<File> cdInnerDirs = new ArrayList<File>();
        for (File f : dir.listFiles()) {
            if (javaFilter.accept(f)) cdInnerDirs.add(f);
        }

        return cdInnerDirs;
    }

    private class ReadableDirFilter implements FileFilter {
        public boolean accept(File file) {
            return (file.isDirectory() && file.canRead());
        }
    }

    private class ReadableJavaFilter implements FileFilter {
        public boolean accept(File file) {
            return (file.isFile() && file.canRead() && file.getName().endsWith(".java"));
        }
    }

    private void check(File javaFile) throws IOException {
        BufferedReader br;
        br = new BufferedReader(new FileReader(javaFile));
        String curLine;
        int lineNum = 0;
        while (null != (curLine = br.readLine())) {
            lineNum++;
            curLine = curLine.trim();
            if ((curLine.contains("System.out") ||
                 curLine.contains("System.err") ||
                 curLine.contains("printStackTrace()")) &&
                !(curLine.startsWith("//") ||
                 curLine.startsWith("/*") ||
                 curLine.startsWith("*"))) {
                violations.add("[" + javaFile.getPath() + ":" + lineNum + "] " + curLine + "\n");
            }
        }
        br.close();
    }

}
