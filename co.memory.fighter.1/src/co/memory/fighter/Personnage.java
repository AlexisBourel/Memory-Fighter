package co.memory.fighter;

import java.util.Scanner;

public class Personnage {

    private String nom;
    private int pv;




    public Personnage(String nom, int pv) {
        this.nom = nom;
        this.pv = pv;
    }

    public  void presentation(){
        System.out.println("je suis "+ this.getNom()+" j'ai: "+ this.getPv()+" pv");
    }





    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

}
