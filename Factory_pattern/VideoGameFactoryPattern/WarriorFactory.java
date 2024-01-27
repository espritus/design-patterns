package project.com;
import java.util.*;

public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        Appearance appearance = new Appearance("Warrior appearance");
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Attack"));
        abilities.add(new Ability("Shield Block"));
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Equipment("Saber"));
        equipment.add(new Equipment("Shield"));
        Attribute attribute = new Attribute(10, 6, 5);
        return new Character(name,appearance,abilities,equipment,attribute);
    }
}
class MageFactory extends CharacterFactory{
    @Override
    public Character createCharacter(String name) {
        Appearance appearance = new Appearance( "Mage appearance");
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Frost"));
        abilities.add(new Ability("Heal"));
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Equipment("ice"));
        Attribute attribute = new Attribute(7, 10, 5);
        return new Character(name,appearance,abilities,equipment,attribute);

    }
}
class ArcherFactory extends CharacterFactory{
    @Override
    public Character createCharacter(String name) {
        Appearance appearance = new Appearance( "Archer appearance");
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new Ability("Arrow Shot"));
        abilities.add(new Ability("multilateral"));
        List<Equipment> equipment = new ArrayList<>();
        equipment.add(new Equipment("Bow"));
        Attribute attribute = new Attribute(5, 10, 8);
        return new Character(name, appearance, abilities, equipment, attribute);

    }
}