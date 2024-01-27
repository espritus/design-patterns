package project.com;

public class CharacterCreator extends CharacterFactory {
    CharacterFactory cf;

    public static void main(String[] args){
        CharacterCreator creator = new CharacterCreator();

        CharacterFactory cf = new MageFactory();
        creator.setFactory(cf);
        Character MageOne = creator.createCharacter("abracadabra");
       // System.out.println(MageOne.showAppearance());

        CharacterFactory cf1 = new WarriorFactory();
        creator.setFactory(cf1);
        Character WarriorOne = creator.createCharacter("Warrior");
    }

    public void setFactory(CharacterFactory cf){
        this.cf = cf;
    }

    @Override
    public Character createCharacter(String name) {
        return cf.createCharacter(name);
    }
}
