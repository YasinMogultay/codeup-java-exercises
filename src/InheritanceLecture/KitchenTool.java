package InheritanceLecture;

public class KitchenTool {
    public static String brandName;
    public static int price;
    public static int inventory;

//    public KitchenTool(){
//
//    }
    public KitchenTool(String brandName, int price) {
        this.brandName = brandName;
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public static void throwAway (){
        System.out.println("Throwing away ..." + brandName);
    }

}
