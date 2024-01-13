package com.rrk.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Eliminates verbosity in creating Java Beans
// Public accessor methods, constructor, equals, hashcode & toString are automatically created
// Released in JDK 16
record Person(String name, int age) {};

record Address(String line1, String city, int pincode) {};

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
	public Person person() {
		var person = new Person("Laxman", 15);
		return person;
	}
	
	@Bean
	public Address address() {
		return new Address("Ram mandir", "Ayodhya", 400342);
	}
}
