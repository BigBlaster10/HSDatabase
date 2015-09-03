package org.tromphome.MainDatabase;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Card {

	private File image;
	
	private CardType type;
	private Rarity rarity;
	private int manaCost;
	private Hero hero;
	private String name;
	private String lore;
	
	public static ArrayList<Card> cards = new ArrayList<Card>();
	
	private Card(CardType type, Rarity rarity, int manaCost, String name, String lore, File image){
		this.type = type;
		this.rarity = rarity;
		this.manaCost = manaCost;
		this.image = image;
		this.hero = Hero.NEUTRAL;
		this.name = name;
		this.lore = lore;
		cards.add(this);
	}	
	
	public Card(CardType type, Rarity rarity, int manaCost, Hero hero, String name, String lore,  File image){
		this.type = type;
		this.rarity = rarity;
		this.manaCost = manaCost;
		this.image = image;
		this.hero = hero;
		this.name = name;
		this.lore = lore;
		cards.add(this);

	}
	
	
	public BufferedImage getImage() {
		try {
			return ImageIO.read(new File("Cards\\" + this.image.toString()));
		} catch (IOException e) {
			//e.printStackTrace();
		}
	    System.out.println("ERROR: File not found");
		System.out.println("Cards\\" + this.image.toString());
		return null;
		
	}

	public CardType getType() {
		return type;
	}

	public Rarity getRarity() {
		return rarity;
	}

	public int getManaCost() {
		return manaCost;
	}
	
	public Hero getHero(){
		return hero;
	}

	public String getName(){
		return name;
	}
	
	public String getLore(){
		return lore;
	}
	
	
	
	
	
	
}
