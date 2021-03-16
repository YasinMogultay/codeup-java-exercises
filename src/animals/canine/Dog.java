package animals.canine;

import animals.canine.Canine;

public class Dog extends Canine {
    private final String furColor;
    public Dog(String sound, String size, String subSpecies, String commonName, String furColor) {
        super(sound,size,subSpecies,commonName);
        this.furColor = furColor;
    }
    public void printEmote(){
        System.out.println("Dog");
    }
    public void makeSound() {
        System.out.println(sound + "\n");
    }
    public void printDelimiter(){
        System.out.println("****************************");
    }
    public void printFurColor(){
        System.out.printf("Fur Color: %s\n", this.furColor);
    }
    public void printDetails(){
        makeSound();
        printDelimiter();
        printCommonName();
        printSize();
        printFurColor();
        printDelimiter();
    }
}