package animals;

import animals.canine.Dog;
import animals.canine.Wolf;
import animals.feline.Cat;
import animals.feline.Feline;
import animals.feline.Tiger;

import java.util.Scanner;

public class AnimalTools {
    public static void getFelineDetails(){
        Animal animal;

        Scanner sc = new Scanner(System.in);

        System.out.println("feline or canine");

        String input = sc.nextLine().toLowerCase();


        if (input.equals("feline")){
            System.out.println("input tiger or cat");
            String input1 = sc.nextLine().toLowerCase();
            if (input1.equals("tiger")){
                animal = new Tiger("Orange","Roar","Large");
            }else {
                animal = new Cat("Gray","Meoww","Small");
            }
        }else {
            System.out.println("dog tiger or wolf");
            String input2 = sc.nextLine().toLowerCase();
            if (input2.equals("dog")){
                animal = new Dog("Bork Bork!", "Canis Lupus Familiarus", "Large", "Great Pyrenees/Lab", "Herding");
            }else {
                animal = new Wolf("Howwwwwwwl!", "Canis Lupus Occidentalis", "Medium", "Northwester Wolf", false, "North America");            }
        }


        animal.printDetails();
    }




}
