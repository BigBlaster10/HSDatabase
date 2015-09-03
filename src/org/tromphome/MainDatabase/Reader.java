package org.tromphome.MainDatabase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

	
	public static void loadCards(File file) throws IOException{
		FileReader fr = new FileReader(file);	
		BufferedReader reader = new BufferedReader(fr);		
		String line;
		while((line = reader.readLine()) != null){
			getCard(line);
		}	
	}
	
	
	public static void getCard(String string){
		if(string.equals("")) return;
		CardType type = null;
		Rarity rarity = null;
		int manaCost = -1;
		Hero hero = null;
		String name = null;
		String lore = null;
		File image = null;
		
		String s = "";
		for(int i = 0; i < string.length(); i++){
			boolean quote = false;
			if(string.charAt(i) == '"'){
				if(quote){
					quote = false;
				}else{
					quote = true;
				}
				continue;
			}
			if(string.charAt(i) == ',' && !quote){
				if(type == null){
					type = CardType.getCard(s);
				}else if(rarity == null){
					rarity = Rarity.getRarity(s);
				}else if(manaCost == -1){
					manaCost = Integer.valueOf(s);
				}else if(hero == null){
					hero = Hero.getHero(s);
				}else if(name == null){
					name = s;
				}else if(lore == null){
					lore = s;
				}
				s = "";
			}else{
				s += string.charAt(i);
			}
		}
		
		if(image == null){
			image = new File(s);
		}
		
		new Card(type, rarity, manaCost, hero, name, lore, image);
		
		
	}
	
	
	
	
	
	
	
}
