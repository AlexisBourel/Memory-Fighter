package co.memory.fighter;

import java.util.Scanner;

public class Player extends Personnage {


	public Player(String nom, int pv) {
        super(nom, pv);
    }

    public static String nomer(){

        Scanner sc = new Scanner(System.in);
        System.out.println("saisissez votre nom: ");
        String st = sc.nextLine();
        while(!st.matches("[a-zA-Z]+") || st.equals("") ){
            System.out.println("nom invalide ressaisissez un nom : ");
            st = sc.nextLine();
        }
        return st;

    }

    public int attaquer(){

        Scanner sc = new Scanner(System.in);
        System.out.println("choisissez votre coup: \n -entrez: 1 pour un coup haut\n -entrez: 2 pour un coup moyen\n -entrez: 3 pour un coup bas ");
        int coup = sc.nextInt();
        sc.nextLine();
        if(coup == 1){
            System.out.println("vous donnez un high kick!");
            this.setTypeAttack(1);
        }
        if(coup == 2){
            System.out.println("vous donnez un coup de poing");
            this.setTypeAttack(2);
        }
        if(coup == 3){
            System.out.println("vous donnez un low kick!");
            this.setTypeAttack(3);
        }
        return this.getTypeAttack();

    }

    public int parer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("choisissez votre garde: \n -entrez: 1 pour une garde haute\n -entrez: 2 pour une garde  moyenne\n -entrez: 3 pour une garde basse ");
        int parade = sc.nextInt();
        sc.nextLine();
        if(parade == 1){
            System.out.println("vous etes en garde haute");
            this.setTypeParrade(1);
        }
        else if(parade == 2){
            System.out.println("vous etes en garde");
            this.setTypeParrade(1);
        }
        else{
            System.out.println("vous etes en garde basse");
            this.setTypeParrade(3);
        }
        return this.getTypeParrade();
    }


}
