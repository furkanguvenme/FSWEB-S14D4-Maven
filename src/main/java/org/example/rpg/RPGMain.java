package org.example.rpg;

public class RPGMain {
    public static void main(String[] args) {
        Monster troll = new Troll("Batu", 1000, 50.9);
        troll.attack();
        System.out.println(troll.attack());
//        troll.getHealty();
    }
}
