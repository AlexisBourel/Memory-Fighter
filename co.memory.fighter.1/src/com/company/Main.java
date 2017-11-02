package com.company;

import co.memory.fighter.Enemy1;
import co.memory.fighter.Personnage;
import co.memory.fighter.Player;


public class Main {

    public static void main(String[] args) {


        Player player1 = new Player(Player.nomer(),20);
        player1.presentation();
        Enemy1 enemy1 = new Enemy1("John Doe",20);
        enemy1.presentation();
        player1.coups();
        enemy1.coupEnemy();
        player1.parade();









    }


}
