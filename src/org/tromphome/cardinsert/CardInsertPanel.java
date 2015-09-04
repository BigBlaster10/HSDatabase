package org.tromphome.cardinsert;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardInsertPanel extends JPanel{	
	
	
	
	JComboBox cardType; 
	JComboBox rarity;
	JTextField name;
	JTextField lore;
	JComboBox hero;

	
	String[] cardTypes = {"Weapon", "Spell", "Minion"};
	String[] rarities = {"Basic", "Common", "Rare", "Epic"};
	String[] heros = {"Mage", "Hunter", "Warrior", "Shaman", "Druid", "Paladin", "Priest", "Rogue", "Warlock", "Neutral"};

	public CardInsertPanel(){
		
		this.setLayout(new GridLayout(5, 5, 10, 10));	
		
		cardType = new JComboBox(cardTypes);
		rarity = new JComboBox(rarities);
		hero = new JComboBox(heros);	

		
		name = new JTextField(10);		
		name.setText("Name");
		
		lore = new JTextField(10);		
		lore.setText("Lore");
		
		
		
		this.add(name);
		this.add(lore);

		this.add(cardType);
		this.add(rarity);
		this.add(hero);
		
		
	}
	
	
	@Override
	public void paintComponent(Graphics g){	
		
		
	}
	
	
	
	
}
