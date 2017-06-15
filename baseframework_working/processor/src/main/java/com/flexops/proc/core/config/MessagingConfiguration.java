//package com.flexops.proc.core.config;
//
//import java.util.Arrays;
//
//import org.apache.activemq.spring.ActiveMQConnectionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Conditional;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.jms.core.JmsTemplate;
//
//import com.rigil.core.adapter.config.ActiveMQConfig;
// 
//@Configuration
//
//public class MessagingConfiguration {
// 
//    private static final String DEFAULT_BROKER_URL = "tcp://localhost:61616";
//     
//    private static final String ORDER_QUEUE = "order-queue";
// 
//    /*@Autowired
//    private PropertyConfig connectionProps;*/
//    
//    @Autowired
//	private Environment env;
//    
//    /*@Autowired
//    private ActiveMQConfig mqConfig;*/
//    
//    @Autowired
//    ApplicationContext applicationContext;
//    
///*    @Bean
//    @Conditional(ConfigCondition.class)
//    public ActiveMQConnectionFactory connectionFactory(){
//    	System.out.println("jms.startup.enable:" + env.getProperty("jms.startup.enable"));
//    	System.out.println("connectionFactory...");
//        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
//        connectionFactory.setBrokerURL(DEFAULT_BROKER_URL);
//        connectionFactory.setTrustedPackages(Arrays.asList("com.flexops.proc"));
//        return connectionFactory;
//    }*/
//     
//    /*@Bean
//    @Conditional(ConfigCondition.class)
//    public JmsTemplate jmsTemplate(){
//    	System.out.println("jmsTemplate...");
//        JmsTemplate template = new JmsTemplate();
//        template.setConnectionFactory(mqConfig.connectionFactory());
//        template.setDefaultDestinationName(ORDER_QUEUE);
//        return template;
//    }*/
//    
//
//    
//    @Bean
//    public int printBeans() {
//    		System.out.println("****************************************");
//    	   String[] beans = applicationContext.getBeanDefinitionNames();
//           //Arrays.sort(beans);
//           for (String bean : beans) {
//               System.out.println(bean);
//           }
//           System.out.println("****************************************");
//           return 0;
//    }
//     
//}