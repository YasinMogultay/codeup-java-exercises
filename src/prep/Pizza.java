package prep;

public class Pizza extends Food{
    private boolean isVeggie;
    private boolean isThin;

    public Pizza(String name, String description, int calories) {
        super(name, description, calories);
    }

    public boolean isVeggie() {
        return isVeggie;
    }

    public void setVeggie(boolean veggie) {
        isVeggie = veggie;
    }

    public boolean isThin() {
        return isThin;
    }

    public void setThin(boolean thin) {
        isThin = thin;
    }
}
