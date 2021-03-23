package prep;


import prep.Foods.FoodTools;

public class App {
    public static void main(String[] args) {

        //Question 1
        System.out.println("power of number: " + Arithmetic.square(5));

        //Question 2
        System.out.println("sum of numbers: " + Arithmetic.sum(3, 3));

        //Question 3
        System.out.println("difference of numbers: " + Arithmetic.difference(10, 2));

        //Question 3
        System.out.println("product of numbers: " + Arithmetic.product(2, 5));

        //Question 4
        double[] numbers = {1, 2, 3, 4, 5};
        System.out.println("average array of numbers : " + Arithmetic.average(new double[]{1, 2, 3})); // or callnumbers

        FoodTools.initializeApp();

    }
}
