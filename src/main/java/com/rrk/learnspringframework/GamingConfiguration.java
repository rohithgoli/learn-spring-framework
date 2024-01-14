package com.rrk.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rrk.learnspringframework.game.GameRunner;
import com.rrk.learnspringframework.game.GamingConsole;
import com.rrk.learnspringframework.game.PacManGame;


@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		return new PacManGame();
	}
	
	@Bean
	public GameRunner gameRunner() {
		return new GameRunner(game());
	}
	
}
