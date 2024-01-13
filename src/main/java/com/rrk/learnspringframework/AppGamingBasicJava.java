package com.rrk.learnspringframework;

import com.rrk.learnspringframework.game.GameRunner;
import com.rrk.learnspringframework.game.MarioGame;
import com.rrk.learnspringframework.game.PacManGame;
import com.rrk.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
	
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		var game = new PacManGame();
		
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
	}

}
