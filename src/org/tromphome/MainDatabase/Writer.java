package org.tromphome.MainDatabase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	
	public static void addCard(Card card){
		
		try {
			FileWriter writer = new FileWriter(new File("cards.txt"), true);
			
			writer.append(card.getType().toString() + ",");
			writer.append(card.getRarity().toString() + ",");
			writer.append("" + card.getManaCost() + ",");
			writer.append(card.getHero().toString() + ",");
			writer.append("\"" + card.getName() + "\"" + ",");
			writer.append("\"" + card.getLore() + "\"" + ",");
			writer.append("\"" + card.getFile().toString() + "\"");
			writer.append("\n");
			
			writer.flush();
		    writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
