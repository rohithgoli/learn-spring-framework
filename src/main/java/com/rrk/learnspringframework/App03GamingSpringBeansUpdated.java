package com.rrk.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rrk.learnspringframework.game.GameRunner;
import com.rrk.learnspringframework.game.GamingConsole;
import com.rrk.learnspringframework.game.PacManGame;

@Configuration
public class App03GamingSpringBeansUpdated {

	@Bean
	public GamingConsole game() {
		return new PacManGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
	
	public static void main(String[] args) {
		
		try(var context =
				new AnnotationConfigApplicationContext(
						App03GamingSpringBeansUpdated.class)) {
			
			context.getBean(GameRunner.class).run();
			
		}
		
	}
}
