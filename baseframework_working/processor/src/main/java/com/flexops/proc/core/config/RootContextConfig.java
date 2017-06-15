package com.flexops.proc.core.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//import com.flexops.proc.jms.MessageReceiver;
//import com.rigil.core.adapter.config.ActiveMQConfig;
 
@Configuration
@ComponentScan(basePackages = "com.flexops.proc.core")
//@ComponentScan({"com.flexops.proc.core"})
@EntityScan({"com.flexops.proc.core.entity","com.flexops.proc.core.repository"})
//@Import({MessagingConfiguration.class, MessagingListenerConfiguration.class, MessageReceiver.class})


//@Import({ActiveMQConfig.class})
public class RootContextConfig {
 
    //Put Other Application configuration here.
}
