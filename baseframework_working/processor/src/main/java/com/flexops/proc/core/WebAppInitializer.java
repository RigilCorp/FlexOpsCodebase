package com.flexops.proc.core;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.flexops.proc.core.config.PropertyConfig;
import com.flexops.proc.core.config.RootContextConfig;



public class WebAppInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getrootconfig...");
		Class<?> [] configClasses = new Class<?>[] {PropertyConfig.class};
		configClasses[0] = PropertyConfig.class; 
		
		return new Class<?>[] {
			PropertyConfig.class,
			RootContextConfig.class
		};
	}
	


	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebMvcConfigurer.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
