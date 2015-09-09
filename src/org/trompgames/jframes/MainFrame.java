package org.trompgames.jframes;

import javax.swing.JFrame;

import org.tromphome.cardinsert.CardInsertPanel;

public class MainFrame extends JFrame{

	public MainFrame(){
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.add(new MainPanel());
		//this.add(new CardInsertPanel());
		
		this.pack();
		this.setSize(this.getWidth()+70, this.getHeight());
		this.setVisible(true);
		//this.setResizable(false);
	}
	
	
}
