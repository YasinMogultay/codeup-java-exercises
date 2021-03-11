package BurgerExercise;

public class BurgerTester {

    public static void main(String[] args) {
        BurgerTools burger = new BurgerTools();

        burger.mostPopularTopping = "Cheese";
        burger.averageDaysBeforeExpiration = 2;
        burger.temperatureWhenCooked = 80;

        System.out.println("Topping: " + burger.mostPopularTopping);
        System.out.println("Average Days Exp: " + burger.averageDaysBeforeExpiration);
        System.out.println("Cooked Temp: " + burger.temperatureWhenCooked);
        BurgerTools.grill("Carlos");
    }
}
