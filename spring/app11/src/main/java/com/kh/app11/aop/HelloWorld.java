package com.kh.app11.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class HelloWorld {

//    @Around("execution(public * com.kh.app11.*.*Service.*(..))")
    public Object m01(ProceedingJoinPoint jp) throws Throwable {
        log.info("AOP 동작1");
        Object result = jp.proceed();
        log.info("AOP 동작2");
        return result;
    }

}
