

public class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public void printSummary(){
        System.out.printf("Cost: %d\nName: %s\nRecommended: %b\n", costInCents, nameOfDish, wouldRecommend);
    }


    //constructor method
    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend){
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public String getInfo(){
        return String.format("Cost: %d, Name: %s, Recommend: %b ",costInCents, nameOfDish,wouldRecommend);
    }


    //getter method
    public int costCents() {
        return costInCents;
    }

    //setter method
    public void changeCosts(int cost){
        this.costInCents = cost;
    }

    //getter method
    public String dishName (){
        return nameOfDish;
    }

    //setter method
    public void changeName(String name){
        this.nameOfDish = name;
    }

    //getter method
    public boolean recommend(){
        return wouldRecommend;
    }

    //setter method
    public void changeRecommend(boolean recommend){
        this.wouldRecommend = recommend;
    }


}
