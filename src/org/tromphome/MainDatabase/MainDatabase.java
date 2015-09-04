package org.tromphome.MainDatabase;

import java.io.File;
import java.io.IOException;

import org.trompgames.jframes.MainFrame;

public class MainDatabase {
	
	
	public static void main(String[] args){
		
		try {
			Reader.loadCards(new File("cards.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new MainFrame();
		System.out.println(Card.cards.size());
	}
}
