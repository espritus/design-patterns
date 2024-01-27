package project.com;

public class Weapon {
    String type;
    int damage;
    int speed;
    int range;

    public Weapon(String type, int damage,int speed, int range){
        this.type = type;
        this.damage = damage;
        this.speed = speed;
        this.range = range;

    }

    public String getType() {
        return this.type;
    }
}
