package com.stephen.java;

import java.awt.Image;
import java.io.IOException;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class RockPaperScissors {

	static RPSFrame rFrame;
	static RPSPanel rPanel;
	static OptionsPanel op;
	static User user;
	static Computer hal;
	private RockPaperScissors rps;
	Image[] images = new Image[3];
	static Top top;
	static int bestOf;
	static int maxBestOf = 3;
	static GameOver gameOver;

	public static void main(String[] args){
		RockPaperScissors rps = new RockPaperScissors();
		top = new Top();
		rPanel = new RPSPanel(rps);
		op = new OptionsPanel(rps, rPanel);
		rFrame = new RPSFrame(rPanel, op);
		user = new User();
		hal = new Computer();
		gameOver = new GameOver(rps);

	}

	public RockPaperScissors(){

//		top = new Top();
//		rPanel = new RPSPanel(rps);
//		op = new OptionsPanel(rps, rPanel);
//		rFrame = new RPSFrame(rPanel, op);
//		user = new User();
//		hal = new Computer();
//		gameOver = new GameOver();
	}
	public void endGame(){
		if(Integer.parseInt(RPSFrame.top.youScore.getText()) > Integer.parseInt(RPSFrame.top.halScore.getText())){
			gameOver.winLose.setText("You Win!");
		}else{
			gameOver.winLose.setText("You Lose!");
		}
		rFrame.setContentPane(gameOver);

	}
	public void reset(){
		rFrame.setContentPane(rFrame.container);
		bestOf = 0;
		op.best3 = true;
		op.best5 = false;
		op.best7 = false;
		maxBestOf = 3;
		RPSFrame.top.halScore.setText("0");
		RPSFrame.top.youScore.setText("0");
		
		op.buttonColors(0);
		rPanel.lp.setIcon(null);
		rPanel.rp.setIcon(null);
		rPanel.lp.setText("Are You ");
		rPanel.rp.setText("Ready?");
	}




}
