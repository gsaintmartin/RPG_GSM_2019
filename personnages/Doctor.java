package personnages;

public class Doctor {
	
	
	
	public static void giveHealth(Characters player) {

		
		
		int currentHealth = player.getCurrentHP();
		
		double bonusHealth =  player.getMaxHP() * 0.25;
		
		double newHealth = currentHealth + bonusHealth;
		
		
		
	
		
	
		if(player.getCurrentHP() <= (player.getMaxHP() * 0.75)) {
			
			//MERCI JU) {
		
		player.setCurrentHP((int) newHealth);
		
		} else {
			
			player.setCurrentHP(player.getMaxHP());
		}
		
		
		System.out.println("LE MEDECIN VOUS REDONNE 25% DE VOS POINTS DE VIE" );
		System.out.println("**************************");
		System.out.println("******** +" + bonusHealth + "PTS DE VIE********");
		System.out.println("**************************" +"\n");
		
		player.displayStatus();
		
		//// A rajouter : limite de points de vie
		
		}			
	}


