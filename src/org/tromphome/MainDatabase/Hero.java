package org.tromphome.MainDatabase;

public enum Hero {

	MAGE,
	HUNTER,
	WARRIOR,
	SHAMAN,
	DRUID,
	PALADIN,
	PRIEST,
	ROGUE,
	WARLOCK,
	NEUTRAL;
	
	public static Hero getHero(String s){
		for(Hero hero : Hero.values()){
			if(hero.toString().equals(s)) return hero;
		}
		return null;
	}
	

	
}
