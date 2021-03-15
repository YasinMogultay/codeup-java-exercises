package InheritanceLecture;

public class main {
    public static void main(String[] args) {
        Ingredient i = new Ingredient();
        i.setBrandName("PeterPan");
        System.out.println(i.getBrandName());
        i.throwAway();
        PeanutButter peanut = new PeanutButter();
        peanut.throwAway();

        Ingredient j = new Ingredient();
        j.setBrandName("Smucker");
        System.out.println(j.getBrandName());
        j.throwAway();
        Jelly jelly = new Jelly();
        jelly.throwAway();
        jelly.caloriesPrint();

        Ingredient b = new Ingredient();
        b.setBrandName("HEB Bakery");
        System.out.println(b.getBrandName());
        b.throwAway();
        Bread bread = new Bread();
        bread.throwAway();

//        KitchenTool k = new KitchenTool();
//        k.setBrandName("Zwelling");
//        System.out.println(k.getBrandName());
//        k.throwAway();
        Knife knife = new Knife("Zwelling",20);
        System.out.println(knife.brandName);
        System.out.println(knife.price);
//        knife.throwAway();

//        KitchenTool p = new KitchenTool();
//        p.setBrandName("Service Plate");
//        System.out.println(p.getBrandName());
//        p.throwAway();
        Plate plate = new Plate("PaperPlate",5);
        System.out.println(knife.brandName);
        System.out.println(knife.price);

    }
}
