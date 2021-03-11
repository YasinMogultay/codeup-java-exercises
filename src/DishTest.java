
public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish(100,"Taco",true);
//        dish1.costInCents = 2000;
//        dish1.nameOfDish = "Burger";
//        dish1.wouldRecommend = true;

//        dish1.printSummary();

//        DishTools.shoutDishName(dish1);
//        DishTools.analyzeDishCost(dish1);
//        DishTools.flipRecommendation(dish1);

        //TODO: Getters and Setters

//        System.out.println(dish1.costCents());
//        dish1.changeCosts(100); //change value
//        System.out.println(dish1.costCents());
//
//        System.out.println(dish1.dishName());
//        dish1.changeName("Pizza");
//        System.out.println(dish1.dishName());
//
//        System.out.println(dish1.recommend());
//        dish1.changeRecommend(true);
//        System.out.println(dish1.recommend());

        //TODO:Constructors

        Dish dish2 = new Dish(1200,"Pasta",true);
        System.out.println(dish2.costCents());
        System.out.println(dish2.getInfo());
        System.out.println(dish1.getInfo());

    }
}
