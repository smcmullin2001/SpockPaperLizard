package com.stephen.java;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class RPSPanel extends JPanel {

	private RockPaperScissors rps;
	LeftPanel lp;
	LeftPanel rp;
	
	
	public RPSPanel(RockPaperScissors rps) {
		setOpaque(true);
		this.rps = rps;
		this.setBounds(0,400,100,500);
		setBackground(Color.BLACK);
		this.setLayout(new GridLayout(1,2));
		
		lp = new LeftPanel();
		lp.setHorizontalAlignment(SwingConstants.RIGHT);
		lp.setBounds(0,0,250,400);
		lp.setText("Are You ");
		this.add(lp);
		
		rp = new LeftPanel();
		rp.setHorizontalAlignment(SwingConstants.LEFT);
		rp.setBounds(0,250,250,400);
		rp.setText("Ready?");
		this.add(rp);
	}

}
