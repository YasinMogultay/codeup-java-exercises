package animals.feline;

import animals.Animal;

public abstract class Feline extends Animal {
    protected String sound;
    protected String size;

    public Feline(String sound, String size) {
        this.sound = sound;
        this.size = size;
    }

    public void makeSound() {
        System.out.println("Sound : " + sound + "\n");
    }

    public void printSize(){
        System.out.println("Feline Size: " + size);
    }

    public abstract void walkAround();

}
