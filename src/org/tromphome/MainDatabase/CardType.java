package org.tromphome.MainDatabase;

public enum CardType {

	WEAPON,
	SPELL,
	MINION;
	
	
	public static CardType getCard(String s){
		for(CardType type : CardType.values()){
			if(type.toString().equals(s)) return type;
		}
		return null;
	}
	
	
}
