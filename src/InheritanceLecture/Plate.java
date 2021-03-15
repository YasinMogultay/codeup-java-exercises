package InheritanceLecture;

public class Plate extends KitchenTool{
    public Plate(String brandName, int price) {
        super(brandName, price);
    }
    public static void throwAway (){
        System.out.println("Throwing away ingredient..." + brandName);
    }
}
