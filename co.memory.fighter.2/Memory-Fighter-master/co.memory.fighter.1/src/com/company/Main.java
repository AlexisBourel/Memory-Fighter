package com.company;

import co.memory.fighter.Combat;
import co.memory.fighter.Enemy;
import co.memory.fighter.Player;


public class Main {

    public static void main(String[] args) {


        Player player1 = new Player(Player.nomer(),20);
        player1.SePresenter();
        Enemy enemy1 = new Enemy("John Doe",20);
        enemy1.SePresenter();

        Combat combat1 = new Combat(player1, enemy1);
        






    }


}
