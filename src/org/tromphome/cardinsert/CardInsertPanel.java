package org.tromphome.cardinsert;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardInsertPanel extends JPanel{	
	
	
	
	JComboBox cardType; 
	JComboBox rarity;
	
	JTextField name;
	JTextField lore;
	
	//https://docs.oracle.com/javase/tutorial/uiswing/components/filechooser.html
	
	JComboBox hero;

	JButton button;
	JButton file;

	
	String[] cardTypes = {"Weapon", "Spell", "Minion"};
	String[] rarities = {"Basic", "Common", "Rare", "Epic"};
	String[] heros = {"Mage", "Hunter", "Warrior", "Shaman", "Druid", "Paladin", "Priest", "Rogue", "Warlock", "Neutral"};

	public CardInsertPanel(){
		
		this.setLayout(new GridLayout(9, 5, 20, 10));	
		
		cardType = new JComboBox(cardTypes);
		rarity = new JComboBox(rarities);
		hero = new JComboBox(heros);	

		button = new JButton();
		button.setText("Create");
		
		file = new JButton();
		file.setText("Open File...");
		
		name = new JTextField(10);		
		name.setText("Name");
		
		lore = new JTextField(10);		
		lore.setText("Lore");
		
		
		
		this.add(name);
		this.add(lore);

		this.add(file);
		
		this.add(cardType);
		this.add(rarity);
		this.add(hero);
		
		this.add(button);
		
	}
	
	
	@Override
	public void paintComponent(Graphics g){	
		
		
	}
	
	
	
	
}
