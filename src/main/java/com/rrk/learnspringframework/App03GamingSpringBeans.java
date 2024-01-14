package com.rrk.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rrk.learnspringframework.game.GameRunner;


public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class)) {
			
			context.getBean(GameRunner.class).run();
		}
		
	}
	
}
