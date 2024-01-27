package project.com;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharacterCreator characterCreator = new CharacterCreator();

            System.out.print("Enter character name:");
            String name = scanner.nextLine();
            System.out.println("Enter character class (0-WarriorSword/1-MageStaff/2-ArcherBow):");
            int characterClass = scanner.nextInt();

            CharacterFactory factory = null;

            switch (characterClass) {
                case 0:
                    factory = new WarriorSwordFactory();
                    break;
                case 1:
                    factory = new MageStaffFactory();
                    break;
                case 2:
                    factory = new ArcherBowFactory();
                    break;
            }

            if (factory == null) {
                System.out.println("Invalid combination of character class and weapon type.");
            } else {
                characterCreator.setFactory(factory);
                Character character = characterCreator.createCharacter(name);
                System.out.println("Created character:");
                System.out.println("Name: " + character.getName());
                System.out.println("Class: " + character.getClass_());
                System.out.println("Weapon type: " + character.getWeapon().getType());
            }

        }
    }


