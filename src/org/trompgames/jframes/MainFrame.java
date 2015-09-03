package org.trompgames.jframes;

import javax.swing.JFrame;

import org.tromphome.cardinsert.CardInsertPanel;

public class MainFrame extends JFrame{

	public MainFrame(){
		this.setVisible(true);
		this.setSize(800, 500);
		
		//this.add(new MainPanel());
		this.add(new CardInsertPanel());
	}
	
	
}
