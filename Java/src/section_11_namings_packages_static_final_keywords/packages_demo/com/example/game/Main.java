package section_11_namings_packages_static_final_keywords.packages_demo.com.example.game;

import section_9_inner_and_abstract_classes_interfaces.interface_challenge.ISaveable;
import section_9_inner_and_abstract_classes_interfaces.interface_challenge.Monster;
import section_9_inner_and_abstract_classes_interfaces.interface_challenge.Player;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        section_9_inner_and_abstract_classes_interfaces.interface_challenge.Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim);

        section_9_inner_and_abstract_classes_interfaces.interface_challenge.ISaveable werewolf = new section_9_inner_and_abstract_classes_interfaces.interface_challenge.Monster("Werewolf", 20, 40);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        saveObject(werewolf);
    }

    public static void saveObject(section_9_inner_and_abstract_classes_interfaces.interface_challenge.ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to a storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

    private static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n + " +
                "1 to enter a string\n" +
                "0 to quit");
        while(!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
