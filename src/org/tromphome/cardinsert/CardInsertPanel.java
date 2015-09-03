package org.tromphome.cardinsert;

import java.awt.Graphics;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import org.tromphome.MainDatabase.CardType;

public class CardInsertPanel extends JPanel{	
	
	
	
	JComboBox cardType; 
	String[] cardTypes = {"Weapon", "Spell", "Minion"};
	String[] rarities = {"Basic", "Common", "Rare", "Epic"};
	
	public CardInsertPanel(){
		cardType = new JComboBox(cardTypes);
		cardType.setLocation(0, 0);
		this.add(cardType);
		
		
	}
	
	
	@Override
	public void paintComponent(Graphics g){	
		
		
	}
	
	
	
	
}
