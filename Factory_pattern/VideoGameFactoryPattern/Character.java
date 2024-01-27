package project.com;

import java.util.List;

public class Character {
    String Name;
    Appearance Appearance;
    List<Ability> Abilities;
    List<Equipment> Equipment;
    Attribute Attributes;

    public Character(String name, Appearance appearance, List<Ability> abilities, List<Equipment> equipment, Attribute attribute) {
        this.Name = name;
        this.Appearance = appearance;
        this.Abilities = abilities;
        this.Equipment = equipment;
        this.Attributes = attribute;
    }
    public String showAppearance(){
        return this.Appearance.getDescription();
    }
}
