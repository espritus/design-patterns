package project.com;

public class Attribute {
    private int durability;
    private int Dexterity ;//like balance
    private int strength;

    public Attribute(int durability, int Dexterity, int strength) {
        this.durability = durability;
        this.Dexterity = Dexterity;
        this.strength = strength;
    }

}
class Appearance {
    private String description;

    public Appearance( String description) {
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }

}

class Ability {
    private String name;

    public Ability(String name) {
        this.name = name;
    }

}

class Equipment {
    private String name;

    public Equipment(String name) {
        this.name = name;
    }

}
