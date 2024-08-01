package org.example.rpg;

public abstract class Monster implements Bleedable,Poisonable{
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public double attack(){
        return getDamage() + bleed() + poison();
    }

//    public void getHealty(){
//        System.out.println(name+ " hasar aldı. " +"Yeni canı "+ (hitPoints-attack()) + ".");
//    }
}
