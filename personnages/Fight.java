package personnages;

import java.util.Scanner;

public class Fight {
	static int hit = 0;

	public static void getFight(Characters player) {

		Monsters monster = Monsters.getRandomMonster(player);

		System.out.println("Il y a un ennemi, comment voulez vous procéder?" + "\n");
		System.out.println("1. Attaquer avec votre épée (attaque physique)" + "\n");
		System.out.println("2. Attaquer avec un sort (attaque magique)" + "\n");
		System.out.println("3. Fuir " + "\n");
		System.out.println("4. CHEAT REFILL DOCTOR " + "\n");

		Scanner sc = new Scanner(System.in);

		int choix = sc.nextInt();

		while (monster.isAlive() || player.isAlive()) {

			if (monster.getCurrentHP() <= 0) {

				System.out.println("********** YOU KILLED THE MONSTER IN " + hit + " ATTEMPS **********" + "\n");

				monster.setAlive(false);

				player.setXpPoints(player.getXpPoints() + 7);
				
				hit = 0;
				break;

			}

			if (player.getCurrentHP() <= 0) {

				player.setAlive(false);

				System.out.println("********** YOU ARE DEAD **********" + "\n");
				System.out.println("************ GAME OVER ***********" + "\n");

				System.exit(1);
			}

			if (choix == 1) {

				physicAttack(player, monster);
				monster.displayStatus();

				randomMonsterAttack(monster, player);

				player.checkLevelUp(player);
				player.displayStatus();

			}

			if (choix == 2) {

				magicAttack(player, monster);
				monster.displayStatus();

				randomMonsterAttack(monster, player);

				player.checkLevelUp(player);
				player.displayStatus();

			}

			if (choix == 3) {

				System.out.println("********** TU AS FUI COMME UN LACHE **********");
				System.out.println("******************** COWARD ******************" + "\n");

				break;
			}

			if (choix == 4) {

				Doctor.giveHealth(player);

				System.out.println("********** CHEATER **********");
				System.out.println("******************** COWARD ******************" + "\n");
				break;
			} // sc.close();

		}
	}

	public static void physicAttack(Characters attack, Characters defense) {

		int dice = RandomInt.getRandomInt(0, 12);

		double level = attack.getCurrentLevel() - defense.getCurrentLevel();

		double agility = attack.getAgility() - defense.getAgility();

		double attackRealisation = 0.7 + (level * 0.1) + (agility * 0.05) + Math.random();

		System.out.println("realisation : " + attackRealisation);

		if (attackRealisation >= 1.0) {

			defense.setCurrentHP(defense.getCurrentHP() - (attack.getStrength() + dice));

			System.out.println("Attaque physique de " + attack.getType() + " : " + attack.getStrength()
					+ " + bonus aléatoire de " + dice);

			hit++;
			System.out.println("Nombre de coups : " + hit);
		} else {

			System.out.println("L'attaque physique de " + attack.getType() + " a échoué.");
		}

	}

	public static void magicAttack(Characters attack, Characters defense) {

		int dice = RandomInt.getRandomInt(0, 12);

		double level = attack.getCurrentLevel() - defense.getCurrentLevel();

		double agility = attack.getAgility() - defense.getAgility();

		double attackRealisation = 0.9 + (level * 0.1) + (agility * 0.05) + Math.random();

		System.out.println("realisation : " + attackRealisation);

		if (attackRealisation >= 1.0) {

			defense.setCurrentHP(defense.getCurrentHP() - (attack.getIntelligence() + dice));

			System.out.println("Attaque magique de " + attack.getType() + " : " + attack.getIntelligence()
					+ " + bonus aléatoire de " + dice);

			hit++;
			System.out.println("Nombre de coups : " + hit);

		} else {

			System.out.println("L'attaque magique de " + attack.getType() + " a échoué.");
		}

	}

	public static void randomMonsterAttack(Characters attack, Characters defense) {

		int randomMonstersAttack = RandomInt.getRandomInt(1, 2); // Permet de randomiser l'attaque du monstre (physique
																	// ou magique)

		if (randomMonstersAttack == 1) {

			int dice = RandomInt.getRandomInt(0, 12);

			double level = attack.getCurrentLevel() - defense.getCurrentLevel();

			double agility = attack.getAgility() - defense.getAgility();

			double attackRealisation = 0.7 + (level * 0.1) + (agility * 0.05) + Math.random(); // Détermine la chance
																								// pour un monstre de
																								// réussir une attaque
																								// magique

			System.out.println(attackRealisation);

			if (attackRealisation >= 1.0) {

				defense.setCurrentHP(defense.getCurrentHP() - (attack.getIntelligence() + dice));

				System.out.println("Attaque magique de " + attack.getType() + " : " + attack.getIntelligence()
						+ " + bonus aléatoire de " + dice);

				hit++;
				System.out.println("Nombre de coups : " + hit);

			} else {

				System.out.println("L'attaque magique de " + attack.getType() + " a échoué.");
			}
		}

		if (randomMonstersAttack == 2) {
			int dice = RandomInt.getRandomInt(0, 12);

			double level = attack.getCurrentLevel() - defense.getCurrentLevel();

			double agility = attack.getAgility() - defense.getAgility();

			double attackRealisation = 0.5 + (level * 0.1) + (agility * 0.05) + Math.random(); // Détermine la chance
																								// pour un monstre de
																								// réussir une attaque
																								// physique

			System.out.println(level);
			System.out.println(agility);

			System.out.println(attackRealisation);

			if (attackRealisation >= 1.0) {

				defense.setCurrentHP(defense.getCurrentHP() - (attack.getStrength() + dice));

				System.out.println("Attaque physique de " + attack.getType() + " : " + attack.getStrength()
						+ " + bonus aléatoire de " + dice);

				hit++;
				System.out.println("Nombre de coups : " + hit);
			} else {

				System.out.println("L'attaque physique de " + attack.getType() + " a échoué.");
			}
		}
	}

}
