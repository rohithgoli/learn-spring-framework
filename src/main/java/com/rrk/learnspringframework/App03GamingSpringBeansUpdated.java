package com.rrk.learnspringframework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rrk.learnspringframework.game.GameRunner;


@Configuration
@ComponentScan("com.rrk.learnspringframework.game")
public class App03GamingSpringBeansUpdated {
	
	public static void main(String[] args) {
		
		try(var context =
				new AnnotationConfigApplicationContext(
						App03GamingSpringBeansUpdated.class)) {
			
			context.getBean(GameRunner.class).run();
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}
		
	}
}
