package co.memory.fighter;

public class Combat {

	public Combat(Player player, Enemy enemy) {
		while (player.getPv() > 0 && enemy.getPv() > 0) {
			System.out.println();
			round1(player, enemy);
			verifEtat(player, enemy);

			if (player.getPv() > 0 && enemy.getPv() > 0) {
				System.out.println();
				round2(enemy, player);
				verifEtat(player, enemy);
			}
		}
	}

	private void resultatRound(Player player, Enemy enemy) {
		System.out.println(player.toString());
		System.out.println(enemy.toString());
	}

	private void verifEtat(Player player, Enemy enemy) {
		if ((player.getPv() <= 0) || (enemy.getPv() <= 0)) {
			finCombat(player, enemy);
		}

	}

	private void round1(Player player, Enemy enemy) {
		System.out.println(player.getNom() + " attaque " + enemy.getNom());
		player.attaquer();
		enemy.parer();
		if (player.getTypeAttack() == (enemy.getTypeParrade())) {
			System.out.println("L'ennemi parre votre coup");
		} else {
			System.out.println("Vous touchez votre ennemi, il perd 5 PV");
			enemy.setPv(enemy.getPv() - 5);
		}
		resultatRound(player, enemy);
	}

	private void round2(Enemy enemy, Player player) {
		System.out.println(enemy.getNom() + " attaque " + player.getNom());
		player.parer();
		enemy.attaquer();
		if (player.getTypeParrade() == enemy.getTypeAttack()) {
			System.out.println("Vous parrez le coup de votre ennemi");
		} else {
			System.out.println("Vous etes touché, vous perdez 5 PV");
			player.setPv(player.getPv() - 5);
		}
		resultatRound(player, enemy);
	}

	private void finCombat(Player player, Enemy enemy) {
		System.out.println("Le combat est términé");
		if (player.getPv() > enemy.getPv()) {
			System.out.println("Victoire de " + player.getNom());
			menu();
		} else {
			System.out.println("GAME OVER");
			menu();
		}

	}

	private void menu() {

	}

}
