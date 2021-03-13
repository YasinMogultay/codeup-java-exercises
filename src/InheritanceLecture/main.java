package InheritanceLecture;

public class main {
    public static void main(String[] args) {
        Ingredient i = new PeanutButter();
        i.brandName = "JIF";
        System.out.println(i.brandName);
        i.setBrandName("PeterPan");
        System.out.println(i.getBrandName());
    }
}
