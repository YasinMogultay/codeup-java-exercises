import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //While loop
//        int i = 5;
//        while (i <= 15){
//            System.out.println("i is " + i);
//            i++;
//        }

        //for loop for above exercise

//        for (int i = 0; i <= 15; i++){
//            System.out.println(i);
//        }

        //Do While loop
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        }while (i <= 100);

        //for loop for above exercise

//        for (int i = 0; i<= 100; i+=2){
//            System.out.println(i);
//        }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        }while (i >= -10);

        //for loop for above exercise

//        for(int i = 100; i>= -10; i-= 5){
//            System.out.println(i);
//        }

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }while (i <= 100000);

        //**** Fizzbuzz TEST ****

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0  && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }
//            else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//            else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //Display a table of powers

//        Scanner sc = new Scanner(System.in);
//        System.out.print("What number would you like to go up to? ");
//        int userInt = sc.nextInt();
//        System.out.println("");
//        System.out.println("Here is your table!");
//        System.out.println("");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 1; i <= userInt; i++){
//            System.out.println(i + "      | " + (i * i) + "       |" + "  " +(i * i * i));
//        }

        //Convert given number grades into letter grades
        System.out.println("Do you want to continue ?");
        Scanner sc = new Scanner(System.in);
        String userPrompt = sc.next();
        if (userPrompt.equals("yes")){
        System.out.println("Enter a numerical grade from 0 to 100.");
        int userInt = sc.nextInt();
        if (userInt >= 88){
            System.out.println("Your Grade is: A");
        }
        else if (userInt >= 80){
            System.out.println("Your Grade is: B");
        }
        else if (userInt >= 67){
            System.out.println("Your Grade is: C");
        }
        else if (userInt >= 60){
            System.out.println("Your Grade is: D");
        } else {
            System.out.println("Your Grade is: F");
        }
        System.out.println("");
        }




    }
}
