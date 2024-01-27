package project.com;

public class CharacterCreator {
    private CharacterFactory cf;

   public void setFactory(CharacterFactory cf){
        this.cf = cf;
    }
    public Character createCharacter(String name){
     return cf.createCharacter(name);
    }

}
