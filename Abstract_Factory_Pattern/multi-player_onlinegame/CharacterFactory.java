package project.com;

public abstract class CharacterFactory {
    public abstract ConcreteCharacter createCharacter(String name);
    public abstract Weapon createWeapon();
}
class WarriorSwordFactory extends CharacterFactory{

    @Override
    public ConcreteCharacter createCharacter(String name) {
        Weapon weapon = createWeapon();
        return new ConcreteCharacter(name,"Warrior with Sword",weapon,100,50);
    }

    @Override
    public Weapon createWeapon() {
        return new Weapon("Sword", 9, 10, 10);
    }
}

class MageStaffFactory extends CharacterFactory{

    @Override
    public ConcreteCharacter createCharacter(String name) {
        Weapon weapon = createWeapon();
        return new ConcreteCharacter(name, "Mage", weapon, 50, 100);
    }

    @Override
    public Weapon createWeapon() {
        return new Weapon("Staff", 5, 10, 10);
    }
}
class ArcherBowFactory extends CharacterFactory {

    @Override
    public ConcreteCharacter createCharacter(String name) {
        Weapon weapon = createWeapon();
        return new ConcreteCharacter(name, "Archer", weapon, 75, 75);
    }

    @Override
    public Weapon createWeapon() {
        return new Weapon("Bow", 8, 8, 20);
    }
    }

