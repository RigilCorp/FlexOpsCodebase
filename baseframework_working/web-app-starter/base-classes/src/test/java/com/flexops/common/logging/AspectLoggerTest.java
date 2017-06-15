package com.flexops.common.logging;

import javax.transaction.NotSupportedException;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.flexops.common.config.ApplicationTests;
import com.flexops.common.config.BaseLoggingConfig;

//TODO need to find a way to test the logging configuration
@ContextConfiguration(classes={BaseLoggingConfig.class})
public class AspectLoggerTest extends ApplicationTests{

	class Dummy{
		void dummyMethod() throws NotSupportedException{
			throw new NotSupportedException();
		}
	}
	
	
	@Test(expected=NotSupportedException.class)
	public void testExceptionHandling() throws Exception{
		Dummy dummy = new Dummy();
		dummy.dummyMethod();
	}
}
