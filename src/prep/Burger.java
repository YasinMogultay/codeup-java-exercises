package prep;

public class Burger extends Food{
    private boolean isDouble;
    private boolean isWellDone;

    public Burger(String name, String description, int calories) {
        super(name, description, calories);
    }

    public boolean isDouble() {
        return isDouble;
    }

    public void setDouble(boolean aDouble) {
        isDouble = aDouble;
    }

    public boolean isWellDone() {
        return isWellDone;
    }

    public void setWellDone(boolean wellDone) {
        isWellDone = wellDone;
    }
}
