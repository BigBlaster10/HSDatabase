package org.tromphome.MainDatabase;

public enum Rarity {

	BASIC,
	COMMON,
	RARE,
	EPIC,
	LEGENDARY;
	
	
	public static Rarity getRarity(String s){
		for(Rarity rarity : Rarity.values()){
			if(rarity.toString().equals(s)) return rarity;
		}
		return null;
	}
	
}
