
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x1 = " + x);
        System.out.println("y1 = " + y);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        swap(x,y);
        System.out.println("x2 = " + x);
        System.out.println("y2 = " + y);
    }
}
