package org.trompgames.jframes;

import javax.swing.JFrame;

import org.tromphome.cardinsert.CardInsertPanel;

public class MainFrame extends JFrame{

	public static JFrame frame;
	
	
	public MainFrame(){
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		MasterPanel panel = new MasterPanel();
		this.add(panel);
		panel.setPanel(new CreateDeck());
		//this.add(new CardInsertPanel());
		
		this.pack();
		//this.setSize(this.getWidth()+70, this.getHeight());
		this.setSize(820, 500);
		this.setVisible(true);
		//this.setResizable(false);
		this.frame = this;
	}
	
	public static JFrame getFrame(){
		return frame;
	}
	
	
	
	
}
