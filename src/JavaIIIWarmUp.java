public class JavaIIIWarmUp {
    public static void main(String[] args) {
        System.out.println(SameFirstAndLast("Yasin"));
    }

    public static boolean SameFirstAndLast (String input) {
        char first = input.charAt(0);
        char last = input.charAt(input.length() - 1);
        return first == last;
    }
}
