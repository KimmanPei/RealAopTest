package com.example.test;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOPTest {
    @Pointcut("execution(* com.example.test.Test.*(..))")//(* com.st.dk.service.*.*(..))
    public static void aspect(){
         System.out.println("this is aop\n");
    }

    @Before(value="aspect()")
    public void beforePrint(){
        System.out.println("this is beforePrint");
    }
}
