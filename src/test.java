
import java.util.HashMap;
import java.util.Map;

public class test {
    public static int findSum(int N) {

        int result;
        result = N + (N / 2) + (N / 4) + (N / 8) + (N / 16) + (N / 32);
        return result;
    }

    public static void main(String[] args) {
     findSum(-404);
    }
}
