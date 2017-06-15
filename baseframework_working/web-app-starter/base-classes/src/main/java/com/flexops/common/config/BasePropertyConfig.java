//package com.flexops.common.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.PropertySources;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//
//@Configuration
//@PropertySources({
//    @PropertySource(value = "classpath:com.flexops.proc.properties"),
//})
//public class BasePropertyConfig {
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//}