/*package com.flexops.common.database;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;

import com.flexops.common.config.ApplicationTests;
import com.flexops.common.config.BaseSingleDataSourceConfig;

@ContextConfiguration(classes={BaseSingleDataSourceConfig.class})
public class DatabaseTest extends ApplicationTests{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	public void testDatabaseConfig(){
		Assert.assertNotNull(jdbcTemplate);
	}
}
*/