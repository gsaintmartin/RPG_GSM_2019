package personnages;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {


		Boolean savedGame = null;

		System.out.println("Voulez vous reprendre une partie sauvegardée : ");

		System.out.println("1 : Oui");

		System.out.println("2 : Non");

		Scanner sc7 = new Scanner(System.in);

		int save = sc7.nextInt();

		if (save == 1) {

			savedGame = true;

		}

		if (save == 2) {

			savedGame = false;
		}

		if (!savedGame) {

			System.out.println("Choisissez un pseudo : ");

			Scanner sc = new Scanner(System.in);

			String pseudo = sc.next();

			PlayerPseudo.setPlayerPseudo(pseudo);

			System.out.println("Choisissez une classe : ");

			System.out.println("1 : Guerrier");

			System.out.println("2 : Mage");

			System.out.println("3 : Voleur" + "\n");

			Scanner sc1 = new Scanner(System.in);

			int heroeType = sc1.nextInt();

			if (heroeType == 1) {

				Warrior player = new Warrior(pseudo);
				Partie.launchGame(player);

			}

			if (heroeType == 2) {

				Witcher player = new Witcher(pseudo);
				Partie.launchGame(player);
			}

			if (heroeType == 3) {

				Thief player = new Thief(pseudo);
				Partie.launchGame(player);

			}
			sc.close();
			sc1.close();
			sc7.close();

		} else {

			// Characters savedPlayer;

			// Partie savedPartie;
			// Save.getSavedGame(Characters player, Partie game);

			System.out.println(" ------ Reprise de la dernière partie ----- ");
		}
	}

}
