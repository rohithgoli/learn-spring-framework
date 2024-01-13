package com.rrk.learnspringframework;

import com.rrk.learnspringframework.game.GameRunner;
import com.rrk.learnspringframework.game.MarioGame;
import com.rrk.learnspringframework.game.PacManGame;
import com.rrk.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
	
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		var game = new PacManGame();	// 1: Object Creation
		
		var gameRunner = new GameRunner(game);
			//2: Object Creation + Wiring of Dependencies
			// Game is a Dependency of GameRunner
		
		gameRunner.run();
	}

}
