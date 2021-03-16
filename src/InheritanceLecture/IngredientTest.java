package InheritanceLecture;

public class IngredientTest {
    public static void main(String[] args) {
        Ingredient j  = new Jelly(); // instance
        Ingredient p = new PeanutButter();
        Ingredient b = new Bread();
        throwAwayIngredient(j);
        throwAwayIngredient(p);
        throwAwayIngredient(b);

    }

    public static void throwAwayIngredient(Ingredient ing){
        ing.throwAway();
    }
}
