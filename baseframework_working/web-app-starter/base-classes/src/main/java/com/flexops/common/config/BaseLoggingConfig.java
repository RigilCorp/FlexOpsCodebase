package com.flexops.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.flexops.common.logging.AspectLogger;

@Configuration
@EnableAspectJAutoProxy
public class BaseLoggingConfig {

	@Bean
	public AspectLogger aspectLogger(){
		AspectLogger aspectLogger = new AspectLogger();
		
		return aspectLogger;
	}

}
