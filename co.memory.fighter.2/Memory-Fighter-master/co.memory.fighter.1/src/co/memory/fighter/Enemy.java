package co.memory.fighter;


import co.memory.interfaces.DonnerCoup;
import co.memory.interfaces.Parade;

public class Enemy extends Personnage implements DonnerCoup,Parade {


    public Enemy(String nom, int pv) {
        super(nom, pv);
    }


    @Override
    public int donnerCoup() {

        int coup = 0;
        if(Enemy.super.getPv() >= 10) {
            coup = 1;
            System.out.println(Enemy.super.getNom() + " donne un high kick!");
        }
        if(Enemy.super.getPv() < 10) {
            coup = 3;
            System.out.println(Enemy.super.getNom() + " donne un low kick");
        }

        return coup;
    }

    @Override
    public int parer() {
        int parade = 0;
        if(Enemy.super.getPv() >= 10) {
            parade = 1;
            System.out.println(Enemy.super.getNom() +" se met en garde haute");
        }
        if(Enemy.super.getPv() < 10) {
            parade = 3;
            System.out.println(Enemy.super.getNom() + " se met en garde basse");
        }

        return parade;

    }
}
