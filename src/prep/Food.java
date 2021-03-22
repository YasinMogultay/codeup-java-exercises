package prep;

public class Food {
    private String name;
    private String description;
    private int calories;

    public Food(String name, String description, int calories) {

            this.name = name;
            this.description = description;
            this.calories = calories;

        if (name == null || name.isEmpty() ) {
            throw new IllegalArgumentException("Please enter a valid String or Integer");
        }
        if ( description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid String or Integer");
        }
        if (calories <= 0) {
            throw new IllegalArgumentException("Please enter a valid String or Integer");
        }
    }


}
