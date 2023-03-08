package com.example.test;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		System.out.println("success\n");
		Test test1 = new Test();
		AspectJProxyFactory aspectJProxyFactory = new AspectJProxyFactory();
		aspectJProxyFactory.setTarget(test1);
		aspectJProxyFactory.addAspect(AOPTest.class);
		Test proxy = aspectJProxyFactory.getProxy();
		proxy.test();
		System.out.println("end");
		System.out.println("modify");
		System.out.println("mm");
	}

}
