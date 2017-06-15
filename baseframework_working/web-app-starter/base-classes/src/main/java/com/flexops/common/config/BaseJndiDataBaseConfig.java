package com.flexops.common.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jndi.JndiTemplate;

@Configuration
@ImportResource(value = { "classpath:spring/common-context.xml" })
public class BaseJndiDataBaseConfig {

	@Value("${jndi.datasource}")
	private String jndiDSName;
	
	@Bean
	public DataSource dataSource() throws Exception{
		// configure and return the necessary JDBC DataSource
		JndiTemplate template = new JndiTemplate();
		Object obj =template.lookup("java:comp/env/"+jndiDSName);
		return (DataSource)obj;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}
