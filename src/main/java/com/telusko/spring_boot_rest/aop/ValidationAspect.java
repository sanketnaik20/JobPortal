package com.telusko.spring_boot_rest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.hibernate.annotations.Comment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution(* com.telusko.spring_boot_rest.service.JobService.getJob(..)) && args(postId)")

    public Object validateAndUpdate(ProceedingJoinPoint jp, int postId) throws Throwable {

        if (postId < 0) {
            LOGGER.info("Post id is negatyive udatinf it");
            postId = -postId;
            LOGGER.info("new value is : " + postId);
        }
        Object obj = jp.proceed(new Object[]{postId});
        return obj;
    }

}