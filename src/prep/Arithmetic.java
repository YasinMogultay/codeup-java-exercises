package prep;

import java.util.ArrayList;
import java.util.Arrays;

public class Arithmetic {

    public static int square(int input){
        return (int) Math.pow(input,2);
    }

    public static int sum(int input1, int input2){
        return input1 + input2;
    }

    public static int difference(int input1, int input2){
        return input1 - input2;
    }

    public static int product (int input1, int input2){
        return input1 * input2;
    }

    public static double average(double[] input){
        double totalOfArray = 0;
        for (int i = 0; i<input.length; i++){
            totalOfArray += input[i];
        }
        return totalOfArray / input.length;
    }
}
