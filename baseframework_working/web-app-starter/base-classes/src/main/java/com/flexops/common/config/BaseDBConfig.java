package com.flexops.common.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class BaseDBConfig {

    private static final Logger LOG = LoggerFactory.getLogger(BaseDBConfig.class);

	@Value("${datasource.formatsql}")
	private boolean formatsql;

	@Value("${datasource.showsql}")
	private boolean showsql;

	@Value("${datasource.generateDDL}")
	private boolean generateDDL;

	@Value("${datasource.databaseType}")
	private String databaseType;

	@Value("${entity.packages.regex}")
	private String entityPackagesRegexCsv;

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource datasource) {
        String[] entityPackagesRegexes = entityPackagesRegexCsv.split(","); 
	    LOG.debug("creating Entity Manager, and scanning the following package(s) for entities: [" + entityPackagesRegexCsv + "]");
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(datasource);
		emf.setPackagesToScan(entityPackagesRegexes);
		AbstractJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

		vendorAdapter.setShowSql(showsql);
		vendorAdapter.setGenerateDdl(generateDDL);
		vendorAdapter.setDatabase(Database.valueOf(databaseType));
		emf.setJpaVendorAdapter(vendorAdapter);
		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.format_sql", formatsql);
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
