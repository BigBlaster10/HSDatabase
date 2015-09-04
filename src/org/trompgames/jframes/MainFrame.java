package org.trompgames.jframes;

import javax.swing.JFrame;

import org.tromphome.cardinsert.CardInsertPanel;

public class MainFrame extends JFrame{

	public MainFrame(){
		this.setVisible(true);
		this.setSize(200, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//this.add(new MainPanel());
		this.add(new CardInsertPanel());
		
		//this.pack();
		this.setVisible(true);

	}
	
	
}
