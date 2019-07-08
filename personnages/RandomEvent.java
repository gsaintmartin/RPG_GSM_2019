package personnages;

public class RandomEvent {

	public static void getRandomEvent(Characters player) {

		int event = RandomInt.getRandomInt(0, 100);
		// int event = 92;

		if (event <= 70) {

			System.out.println("----------- NEW FIGHT -----------");
			player.displayStatus();
			Fight.getFight(player);

		}

		else if (event > 70 & event <= 90) {

			Coach.giveBonus(player);
			player.displayStatus();

		}

		else {

			Doctor.giveHealth(player);
			player.displayStatus();
		}

	}

}
