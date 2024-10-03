package javaRPGGame.dev.game.units;

import javaRPGGame.dev.game.buyables.equipment;

public class unit {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int power;
    protected int armor;
    protected int dodge;
    protected int gold;
    protected equipment[] inventory = {};

    public unit(String name, int health, int maxHealth, int power, int armor, int dodge, int gold){
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.power = power;
        this.armor = armor;
        this.dodge = dodge;
        this.gold = gold;
    }

    public attack(unit){

    }
}