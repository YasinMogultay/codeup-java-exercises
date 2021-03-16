package animals.canine;

import animals.Animal;
import animals.Describable;

public abstract class Canine extends Animal {

    protected final String size;
    protected final String commonName;
    protected final String subspecies;
    protected final String sound;


    public Canine(String size, String commonName, String subspecies, String sound){
        this.size = size;
        this.commonName = commonName;
        this.subspecies = subspecies;
        this.sound = sound;
    }

    public abstract void printEmote();
    public void makeSound() {
        System.out.println(sound + "\n");
    }
    public void printDelimiter(){
        System.out.println("****************************");
    }

    public void printCommonName(){
        System.out.printf("Common Name: %s\n", this.commonName);
    }
    public void printSize(){
        System.out.printf("Size: %s\n", this.size);
    }

}
