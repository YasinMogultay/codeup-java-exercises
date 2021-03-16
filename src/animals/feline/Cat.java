package animals.feline;

public class Cat extends Feline {
    private final String furColor;

    public Cat(String furColor, String sound, String size) {
        super(sound,size);
        this.furColor = furColor;
    }

//    public void makeSound() {
//        System.out.println("Feline sound: " + sound + "\n");
//    }

    public void printFurColor(){
        System.out.printf("Fur Color: %s\n", this.furColor);
    }

//    public void printSize(){
//        System.out.println("Feline Size " + size);
//    }

    public void walkAround(){
        System.out.println("Walk around the house");
    }

    public void printDetails (){
        makeSound();
        printFurColor();
        printSize();
        walkAround();
    }
}
