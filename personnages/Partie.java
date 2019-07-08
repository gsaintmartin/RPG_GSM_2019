package personnages;

public class Partie {

	protected static int nbTour = 1;

	public static void launchGame(Characters player) {

		for (int i = 1; i < 16; i++) {
			System.out.println("*************** TOUR N° : " + nbTour + " ***************" + "\n");
			player.checkLevelUp(player);
			RandomEvent.getRandomEvent(player);

			nbTour++;

		}

		System.out.println("**********TU AS SURVECU AUX 15 TOURS **********");
		System.out.println("**********BRAVO " + PlayerPseudo.playerPseudo + " TU AS GAGNE **********");

	}

}
