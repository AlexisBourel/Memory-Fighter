package co.memory.fighter;


public class Enemy1 extends Personnage {


    public Enemy1(String nom, int pv) {
        super(nom, pv);
    }

    public int coupEnemy() {

        int cp = 0;
        if(Enemy1.super.getPv() >= 10) {
            cp = 1;
            System.out.println(Enemy1.super.getNom() + " donne un high kick!");
        }
        if(Enemy1.super.getPv() < 10) {
            cp = 3;
            System.out.println(Enemy1.super.getNom() + " donne un low kick");
        }

        return cp;
    }









}
