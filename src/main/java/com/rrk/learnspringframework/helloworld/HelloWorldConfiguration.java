package com.rrk.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Eliminates verbosity in creating Java Beans
// Public accessor methods, constructor, equals, hashcode & toString are automatically created
// Released in JDK 16
record Person(String name, int age, Address address) {};

record Address(String line1, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Ram";
	}
	
	@Bean
	public int age() {
		return 16;
	}
	
	@Bean
	@Primary
	public Person person() {
		var person = new Person("Laxman", 15, new Address("Ram mandir", "Bhadrachalam"));
		return person;
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Ram mandir", "Ayodhya");
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); // using existing Bean name, age, address via Method Call
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {	// name, age, address2
		return new Person(name, age, address2);
	}
}
