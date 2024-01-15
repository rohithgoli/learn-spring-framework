package com.rrk.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


// YourBusinessClass
// Dependency1
// Dependency2
// AIM: To observe how to inject Dependency1, Dependency2
//		into YourBusinessClass through 
//			Constructor-based Injection
//			Setter-based Injection
//			Field Injection


@Component
class YourBusinessClass {
	
	@Autowired
	Dependency1 dependency1;
	
	@Autowired
	Dependency2 dependency2;	

	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}
}


@Component
class Dependency1 {
	
}


@Component
class Dependency2 {
	
}


@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(DepInjectionLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
//			System.out.println(context.getBean(YourBusinessClass.class));
		}
		
	}
	
}
