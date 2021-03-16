package animals.feline;

public class Tiger extends Feline {
    private final String furColor;


    public Tiger(String furColor, String sound, String size) {
        super(sound,size);
        this.furColor = furColor;
    }

//    public void makeSound() {
//        System.out.println("Feline sound: " + sound + "\n");
//    }

    public void printFurColor(){
        System.out.printf("Fur Color: %s\n", this.furColor);
    }

    public void walkAround(){
        System.out.println("Walk around the jungle");
    }

//    public void printSize(){
//        System.out.println("Feline Size " + size);
//    }

    public void printDetails (){
        makeSound();
        printFurColor();
        printSize();
        walkAround();
    }
}
