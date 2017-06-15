package com.flexops.common.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;

@Aspect
public class AspectLogger {
	
	Logger logger = LoggerFactory.getLogger(AspectLogger.class);
	public static int numberOfException = 0;
	
	@Pointcut("execution(* * (..))")
	public void any(){
	}
	
	@BeforeTransaction()
	public void logBeforeTransaction(JoinPoint jp){
		logger.debug("A new transaction is started");
	}
	
	@AfterTransaction()
	public void logAfterTransaction(JoinPoint jp){
		logger.debug("A transaction is ended");
	}

	@AfterThrowing(pointcut="any()", throwing="ex")
	public void logException(JoinPoint jp, Exception ex){
		logger.error("Exception caught in AspectLogger", ex);
	}
}
