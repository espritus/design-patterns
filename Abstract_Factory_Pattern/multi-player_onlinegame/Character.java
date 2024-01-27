package project.com;

public class Character {
    String name;
    String class_;
    Weapon weapon;
    int health;
    int mana;

    public Character(String name, String class_, Weapon weapon,int health, int mana){
        this.name = name;
        this.class_= class_;
        this.weapon = weapon;
        this.health = health;
        this.mana =  mana;

    }
    public String getClass_(){
        return this.class_;
    }
    public Weapon getWeapon(){
        return this.weapon;
    }
    public int getHealth(){
        return this.health;
    }
    public int getMana(){
        return this.mana;
    }

    public String getName() {
        return this.name;
    }
}
