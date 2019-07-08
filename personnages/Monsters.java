package personnages;

public abstract class Monsters extends Characters {

	static Monsters currentMonster;
	
	public Monsters(String type, int currentHP, int maxHP, int xpPoints, int thresholdLevelup, int currentLevel,
			int strength, int agility, int intelligence, boolean alive) {
		super(type, currentHP, maxHP, currentLevel, xpPoints, thresholdLevelup, strength, agility, intelligence, alive);
		

	}
	
	

	public static Monsters getRandomMonster(Characters player) {
		
		
		int highLevel = player.getCurrentLevel() + 2;
		
		int randomLevel = RandomInt.getRandomInt(player.getCurrentLevel(), highLevel);
		
		

		int randomMonstersInt = RandomInt.getRandomInt(1, 3);

		if (randomMonstersInt == 1) {

			Orc currentMonster = new Orc(randomLevel);
			return currentMonster;
		}

		if (randomMonstersInt == 2) {

			Gobelin currentMonster = new Gobelin(randomLevel);
			return currentMonster;
		}
		if (randomMonstersInt == 3) {

			Zorgien currentMonster = new Zorgien(randomLevel);
			return currentMonster;
		}
		 return null;

	}

}
