package com.telusko.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //return type
    //fully qualfied class-name.method name
    // arguments
    @Before("execution(* com.telusko.spring_boot_rest.service.JobService.getJob(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method Called "+ jp.getSignature().getName());
    }

    @After("execution(* com.telusko.spring_boot_rest.service.JobService.getJob(..))")
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info("Method Executed "+ jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.telusko.spring_boot_rest.service.JobService.getJob(..))")
    public void logMethodExecutedDueToError(JoinPoint jp) {
        int a=10/0;
        LOGGER.info("Method Executed due to Execution "+ jp.getSignature().getName());
    }
}
