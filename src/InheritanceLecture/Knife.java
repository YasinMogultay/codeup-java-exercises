package InheritanceLecture;

public class Knife extends KitchenTool {

    public Knife(String brandName, int price) {
        super(brandName, price);
    }

    public static void throwAway (){
        System.out.println("Throwing away ingredient..." + brandName);
    }

}
