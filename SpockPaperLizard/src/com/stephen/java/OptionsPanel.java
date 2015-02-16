package com.stephen.java;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Random;

public class OptionsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private RockPaperScissors rps;
	JButton rock;
	JButton paper;
	JButton scissors;
	JButton spock;
	JButton lizard;
	JButton bestOfThree;
	JButton bestOfFive;
	JButton bestOfSeven;
	JButton RPS;
	JButton RPSLS;
	boolean best3 = true;
	boolean best5;
	boolean best7;
	RPSPanel rPanel;
	Random random;
	int index;
	Image[] images = new Image[5];
	int you;
	int hal;
	

	public OptionsPanel(final RockPaperScissors rps, final RPSPanel rPanel){
		
		this.rps = rps; 
		this.rPanel = rPanel;
		try {
			images[0] = ImageIO.read(getClass().getResource("Rock.jpg"));
			images[1] = ImageIO.read(getClass().getResource("Paper.jpg"));
			images[2] = ImageIO.read(getClass().getResource("Scissors.jpg"));
			images[3] = ImageIO.read(getClass().getResource("spock.jpg"));
			images[4] = ImageIO.read(getClass().getResource("lizard.jpg"));
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		setBounds(new Rectangle(0, 0, 500, 100));
		setOpaque(true);
		setBackground(UIManager.getColor("Button.shadow"));
		setLayout(new GridLayout(2,3));
		
		rock = new JButton("ROCK");
		rock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RockPaperScissors.bestOf++;

					buttonColors('r');
					rPanel.lp.setText("");
					rPanel.rp.setText("");

					Image img = ImageIO.read(getClass().getResource("Rock.jpg"));
					rPanel.lp.setIcon(new ImageIcon(img));
					random = new Random();
					index = random.nextInt(images.length);
					calculateScore(0, index);
//					you = Integer.parseInt(RPSFrame.top.youScore.getText());
//					hal = Integer.parseInt(RPSFrame.top.halScore.getText());
					rPanel.rp.setIcon(new ImageIcon(images[index]));
					if(Integer.parseInt(RPSFrame.top.youScore.getText()) > RockPaperScissors.maxBestOf/2 
							|| Integer.parseInt(RPSFrame.top.halScore.getText()) > RockPaperScissors.maxBestOf/2 ){
						rps.endGame();
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		this.add(rock);
		
		paper = new JButton("PAPER");
		paper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RockPaperScissors.bestOf++;

					buttonColors('p');
					rPanel.lp.setText("");
					rPanel.rp.setText("");

					Image img = ImageIO.read(getClass().getResource("Paper.jpg"));
					rPanel.lp.setIcon(new ImageIcon(img));
					random = new Random();
					index = random.nextInt(images.length);
					calculateScore(1, index);

					rPanel.rp.setIcon(new ImageIcon(images[index]));
					if(Integer.parseInt(RPSFrame.top.youScore.getText()) > RockPaperScissors.maxBestOf/2 
							|| Integer.parseInt(RPSFrame.top.halScore.getText()) > RockPaperScissors.maxBestOf/2 ){
						rps.endGame();
					}
					} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		this.add(paper);
		
		scissors = new JButton("SCISSORS");
		scissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RockPaperScissors.bestOf++;

					buttonColors('s');
					rPanel.lp.setText("");
					rPanel.rp.setText("");

					Image img = ImageIO.read(getClass().getResource("Scissors.jpg"));
					rPanel.lp.setIcon(new ImageIcon(img));
					random = new Random();
					index = random.nextInt(images.length);
					calculateScore(2, index);

					rPanel.rp.setIcon(new ImageIcon(images[index]));
					if(Integer.parseInt(RPSFrame.top.youScore.getText()) > RockPaperScissors.maxBestOf/2 
							|| Integer.parseInt(RPSFrame.top.halScore.getText()) > RockPaperScissors.maxBestOf/2 ){
						rps.endGame();
					}
					} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		this.add(scissors);
		
		spock = new JButton("SPOCK");
		spock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RockPaperScissors.bestOf++;

					buttonColors('v');//for Vulcan
					rPanel.lp.setText("");
					rPanel.rp.setText("");

					Image img = ImageIO.read(getClass().getResource("spock.jpg"));
					rPanel.lp.setIcon(new ImageIcon(img));
					random = new Random();
					index = random.nextInt(images.length);
					calculateScore(3, index);

					rPanel.rp.setIcon(new ImageIcon(images[index]));
					if(Integer.parseInt(RPSFrame.top.youScore.getText()) > RockPaperScissors.maxBestOf/2 
							|| Integer.parseInt(RPSFrame.top.halScore.getText()) > RockPaperScissors.maxBestOf/2 ){
						rps.endGame();
					}
					} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		this.add(spock);
		
		lizard = new JButton("LIZARD");
		lizard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RockPaperScissors.bestOf++;

					buttonColors('l');
					rPanel.lp.setText("");
					rPanel.rp.setText("");

					Image img = ImageIO.read(getClass().getResource("lizard.jpg"));
					rPanel.lp.setIcon(new ImageIcon(img));
					random = new Random();
					index = random.nextInt(images.length);
					calculateScore(4, index);

					rPanel.rp.setIcon(new ImageIcon(images[index]));
					if(Integer.parseInt(RPSFrame.top.youScore.getText()) > RockPaperScissors.maxBestOf/2 
							|| Integer.parseInt(RPSFrame.top.halScore.getText()) > RockPaperScissors.maxBestOf/2 ){
						rps.endGame();
					}
					} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		this.add(lizard);
		
		bestOfThree = new JButton("Best of 3");
		bestOfThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				best3 = true;
				best5 = false;
				best7 = false;
				buttonColors(3);
				RockPaperScissors.maxBestOf = 3;
			}
		});
		this.add(bestOfThree);
		
		bestOfFive = new JButton("Best of 5");
		bestOfFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				best3 = false;
				best5 = true;
				best7 = false;
				buttonColors(5);
				RockPaperScissors.maxBestOf = 5;
			}
		});
		this.add(bestOfFive);
		
		bestOfSeven = new JButton("Best of 7");
		bestOfSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				best3 = false;
				best5 = false;
				best7 = true;
				buttonColors(7);
				RockPaperScissors.maxBestOf = 7;
			}
		});
		this.add(bestOfSeven);
		
		RPS = new JButton("RPS");
		RPS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonColors(7);
			}
		});
		this.add(RPS);
		
		RPSLS = new JButton("RPSLS");
		RPSLS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonColors(7);
			}
		});
		this.add(RPSLS);
	}

	public void buttonColors(int i){
		switch(i){
		case 3: {
			bestOfThree.setBackground(new Color(135,206,235, 240));
			bestOfFive.setBackground(null);
			bestOfSeven.setBackground(null);
			break;
		}
		case 5:{
			bestOfFive.setBackground(new Color(135,206,235, 240));
			bestOfThree.setBackground(null);
			bestOfSeven.setBackground(null);
			break;
		}
		case 7:{
			bestOfSeven.setBackground(new Color(135,206,235, 240));
			bestOfThree.setBackground(null);
			bestOfFive.setBackground(null);
			break;
		}
		case 'r':{
			rock.setBackground(new Color(176,196,222, 240));
			paper.setBackground(null);
			scissors.setBackground(null);
			break;
		}
		case 'p':{
			paper.setBackground(new Color(176,196,222, 240));
			rock.setBackground(null);
			scissors.setBackground(null);
			break;
		}
		case 's':{
			scissors.setBackground(new Color(176,196,222, 240));
			rock.setBackground(null);
			paper.setBackground(null);
			break;
		}
		default:{
			rock.setBackground(null);
			paper.setBackground(null);
			scissors.setBackground(null);
			bestOfThree.setBackground(null);
			bestOfFive.setBackground(null);
			bestOfSeven.setBackground(null);
			break;
		}
		}
	}
	
public void calculateScore(int youScore, int index){
		
		switch(youScore){
		case 0:{//rock
			if(index == 0){
			}
			if(index == 1){
				setHalScore();

			}
			if(index == 2){
				setYouScore();
			}
			if(index == 3){
				setHalScore();

			}
			if(index == 4){
				setYouScore();
			}
			break;
		}
		case 1:{//paper
			if(index == 0){
				setYouScore();
			}
			if(index == 1){
			}
			if(index == 2){
				setHalScore();

			}
			if(index == 3){
				setYouScore();
			}
			if(index == 4){
				setHalScore();

			}
			break;
		}
		case 2:{//scissors
			if(index == 0){
				setHalScore();
			}
			if(index == 1){
				setYouScore();
			}
			if(index == 2){
				
			}
			if(index == 3){
				setHalScore();

			}
			if(index == 4){
				setYouScore();
			}
			break;
		}
		case 3:{//spock
			if(index == 0){
				setYouScore();
			}
			if(index == 1){
				setHalScore();

			}
			if(index == 2){
				setYouScore();
			}
			if(index == 3){
				
			}
			if(index == 4){
				setHalScore();

			}
			break;
		}
		case 4:{//lizard
			if(index == 0){
				setHalScore();
			}
			if(index == 1){
				setYouScore();
			}
			if(index == 2){
				setHalScore();

			}
			if(index == 3){
				setYouScore();
			}
			if(index == 4){
				
			}
			break;
		}
		}
	}
public void setYouScore(){
	RPSFrame.top.youScore.setText("" + (Integer.parseInt(RPSFrame.top.youScore.getText()) + 1));

}
public void setHalScore(){
	RPSFrame.top.halScore.setText("" + (Integer.parseInt(RPSFrame.top.halScore.getText()) + 1));


}

}
