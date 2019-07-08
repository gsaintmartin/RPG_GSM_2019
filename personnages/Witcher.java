package personnages;

public class Witcher extends Characters {

	public Witcher(String pseudo) {
		super("MAGE", 200, 200, 0, 10, 1, 6, 6, 10, true);

		System.out.println("Vous avez créé un " + getType() + " nommé " + pseudo);
		displayStatus();
	}
	
	public void displayStatus() {
		System.out.println("___________________________________");  
		System.out.println("          " + PlayerPseudo.getPlayerPseudo() + " -- " + getType() +"               ");
		System.out.println("------------ NIVEAU " + getCurrentLevel() + " ------------");
		System.out.println("___________________________________"  + "\n");
		System.out.println(" Force : " + getStrength() + "\n" + " Agilité : " + getAgility() + "\n" + " Intelligence : "
				+ getIntelligence() + "\n" + " Points de vie : " + getCurrentHP() +  " sur " + getMaxHP() + "\n" + " Points d'expérience : " + getXpPoints()
				+ " sur " + getThresholdLevelup() + " points ");
	System.out.println("___________________________________" + "\n");  
	}
	
	public void checkLevelUp(Characters player) {

		if (player.xpPoints >= player.thresholdLevelup || Coach.coaching == true ) {
			
			System.out.println("**************************");
			System.out.println("******** LEVEL-UP ********");
			System.out.println("**************************" +"\n");

			player.currentLevel++;
			
			player.strength += 2;
			
			player.agility += 1;
			
			player.intelligence += 4;
			
			double healthBonus = player.maxHP * 0.06; 
			
			player.maxHP += healthBonus ;
			
			player.currentHP = player.maxHP;

			
			double xpBonus = player.thresholdLevelup * 0.10;
			
			player.thresholdLevelup += xpBonus;
			
			player.xpPoints = 0;
			
			displayStatus();
			
			
			Coach.coaching = false;
			
		}
	}



	}


