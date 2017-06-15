package com.flexops.common.config;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
@Configuration
@EnableJpaRepositories(basePackages = "com.flexops.proc.core.repository", entityManagerFactoryRef = "entityManagerFactory", transactionManagerRef = "transactionManager")
@EnableTransactionManagement
public class BaseSingleDataSourceConfig {
//	@Value("${datasource.classname}")
//	private String databaseDriverClassName;
//
//	@Value("${datasource.url}")
//	private String datasourceUrl;	
//
//	@Value("${datasource.username}")
//	private String databaseUsername;
//
//	@Value("${datasource.password}")
//	private String databasePassword;
	
//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName(databaseDriverClassName);
//		dataSource.setUrl(datasourceUrl);
//		dataSource.setUsername(databaseUsername);
//		dataSource.setPassword(databasePassword);
//		return dataSource;
//	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("flexopsTraining");
		dataSource.setPassword("atoms");
		return dataSource;
	}

	
	@Bean 
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	
//	@Bean
//	public EntityManager entityManager() {
//	    return entityManagerFactory().getObject().createEntityManager();
//	}
//
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//	    LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//	    em.setDataSource(dataSource());
//	    em.setPackagesToScan("com.flexops.proc.core.entity");
//	    return em;
//	}
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource datasource) {
       // String[] entityPackagesRegexes = entityPackagesRegexCsv.split(","); 
	  //  LOG.debug("creating Entity Manager, and scanning the following package(s) for entities: [" + entityPackagesRegexCsv + "]");
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(datasource);
		emf.setPackagesToScan("com.flexops.proc.core.entity");
		AbstractJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

		vendorAdapter.setShowSql(true);
		vendorAdapter.setGenerateDdl(false);
		//vendorAdapter.setDatabase(Database.valueOf(databaseType));
		emf.setJpaVendorAdapter(vendorAdapter);
		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.format_sql", true);
		emf.setJpaProperties(jpaProperties);

		return emf;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {

		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);

		return transactionManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}
	
}
