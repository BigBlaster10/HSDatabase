package org.tromphome.MainDatabase;

public enum Rarity {

	BASIC,
	COMMON,
	RARE,
	EPIC,
	LEGENDARY;
	
	
	public static Rarity getRarity(String s){
		for(Rarity rarity : Rarity.values()){
			if(rarity.toString().toLowerCase().equals(s.toLowerCase())) return rarity;
		}
		return null;
	}
	
}
