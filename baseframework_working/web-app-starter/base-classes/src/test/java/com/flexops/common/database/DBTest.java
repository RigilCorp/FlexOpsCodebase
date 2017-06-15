/*package com.flexops.common.database;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.PlatformTransactionManager;

import com.flexops.common.config.ApplicationTests;
import com.flexops.common.config.BaseDBConfig;
import com.flexops.common.config.BaseSingleDataSourceConfig;
import com.flexops.common.config.DatabaseTestConfig;

@Configuration
@ContextConfiguration(classes = {
        BaseSingleDataSourceConfig.class,
        DatabaseTestConfig.class,
        BaseDBConfig.class
})
public class DBTest extends ApplicationTests {

    @Autowired
    private EntityManager em;

    @Autowired
    private PlatformTransactionManager tm;

    @Test
    public void testEntityManagerIsNotNull() {
        Assert.assertNotNull(em);
    }

    @Test
    public void testTransactionManagerIsNotNull() {
        Assert.assertNotNull(tm);
    }
}
*/