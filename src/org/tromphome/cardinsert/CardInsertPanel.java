package org.tromphome.cardinsert;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.tromphome.MainDatabase.Card;
import org.tromphome.MainDatabase.CardType;
import org.tromphome.MainDatabase.Hero;
import org.tromphome.MainDatabase.Rarity;
import org.tromphome.MainDatabase.Writer;

public class CardInsertPanel extends JPanel{	
	
	/*
	 * SPELL,BASIC,4,MAGE,"Fireball","Deal 6 damage.","Fireball.png"
SPELL,BASIC,2,MAGE,"Frostbolt","Deal 3 damage to a character and Freeze it.","Frostbolt.png"
SPELL,BASIC,1,MAGE,"Mirror Image", "Summon two 0/2 minions with Taunt","Mirror_Image.png"
	 */
	
	JComboBox cardType; 
	JComboBox rarity;
	
	JTextField name;
	JTextField lore;
	JTextField manaCost;
	
	//https://docs.oracle.com/javase/tutorial/uiswing/components/filechooser.html
	
	JComboBox hero;

	JButton button;
	JButton bFile;

	File file;
	
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
		
		bFile = new JButton();
		bFile.setText("Open File...");
		bFile.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
		        JFileChooser fileChooser = new JFileChooser("F:\\eclipse\\Projects\\HearthstoneDatabase\\Cards");
		        int returnValue = fileChooser.showOpenDialog(null);
		        if (returnValue == JFileChooser.APPROVE_OPTION) {
		          File selectedFile = fileChooser.getSelectedFile();
		          file = new File(selectedFile.getName());
		        }
		      }
		    });
		
		
		name = new JTextField(10);		
		name.setText("Name");
		
		lore = new JTextField(10);		
		lore.setText("Lore");
		
		manaCost = new JTextField(10);
		manaCost.setText("1");
		
		this.add(name);
		this.add(lore);
		this.add(manaCost);
		
		this.add(bFile);
		
		this.add(cardType);
		this.add(rarity);
		this.add(hero);
		
		this.add(button);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				createCard();
			}
			
		});
		
		
	}
	
	
	@Override
	public void paintComponent(Graphics g){	
		
		
	}
	
	public void createCard(){
		for(Card card : Card.cards){
			if(card.getName().equals(name.getText())){
				System.out.println("ERROR: Card allready created");
				return;
			}
				
		}
		System.out.println(manaCost.getText());
		
		CardType type = CardType.getCard(cardType.getSelectedItem().toString());
		Rarity rarity = Rarity.getRarity(this.rarity.getSelectedItem().toString());
		int manaCost = Integer.valueOf(this.manaCost.getText());
		Hero hero = Hero.getHero(this.hero.getSelectedItem().toString());
		String name = this.name.getText();
		String lore = this.lore.getText();
		
		Card card = new Card(type, rarity, manaCost,hero,name ,lore, file);
		Writer.addCard(card);
		
	}
	
	
}
