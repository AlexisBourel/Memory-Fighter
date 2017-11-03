package co.memory.fighter;


public class Enemy extends Personnage{

	

    public Enemy(String nom, int pv) {
        super(nom, pv);
    }


    public int attaquer() {
        if(this.getPv() >= 10) {
            System.out.println(this.getNom() + " donne un high kick!");
            this.setTypeAttack(1);
        }
        if(this.getPv() < 10) {
            System.out.println(this.getNom() + " donne un low kick");
            this.setTypeAttack(3);
        }

        return this.getTypeAttack();
    }

   
    public int parer() {
        if(this.getPv() >= 10) {
            System.out.println(this.getNom() +" se met en garde haute");
            this.setTypeParrade(1);
        }
        if(this.getPv() < 10) {
            System.out.println(this.getNom() + " se met en garde basse");
            this.setTypeParrade(3);
        }

        return this.getTypeParrade();

    }
}
