import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        /*
    Write a method named firstChar() that takes a string as an input and returns the first letter as a character data type.
Write a method named secondChar() that takes a string as an input and returns the first letter as a character data type.
Write a method named lastChar() that takes a string as an input and returns the last letter as a character data type.
Write a method named secondToLastChar() that takes a string as an input and returns the second to letter as a character data type.
Write a method named userWantsToContinue(). This method should prompt the user if they want to continue and then return a boolean value if the user inputs "y" or "yes".
Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.
Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.
Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.
Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.
Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".
Write a method named hasVowels() that accepts a string of any length and returns a boolean if there are any vowels in that string.
Write a method named countVowels() that accepts a string of any length and returns an integer count of the number of vowels in the provided input String.
Write a solution to FizzBuzz using recursion instead of a loop.
Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.
Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.
*/

        String name = "Yasin";
        Integer number = 23;
//        System.out.println(firstChar(name));
//        System.out.println(secondChar(name));
//        System.out.println(lastChar(name));
//        System.out.println(secondToLastChar(name));
//        System.out.println(booleanUserWantsToContinue());
//        System.out.println(isEven(number));
//        System.out.println(isOdd(number));
//        System.out.println(countOdds(1,10));
//        System.out.println(countEvens(1,10));
//        System.out.println(isVowel("e"));
//        System.out.println(hasVowel("why"));
//        System.out.println(countVowels("hello"));
//        System.out.println(isPrime(7));
//        System.out.println(addition(10,2));
//        System.out.println(subtraction(10,2));
//        System.out.println(multiplication(10,2));
//        System.out.println(multiplicationForLoop(10,2));
//        System.out.println(multiplicationRecursion(10,2));
//        System.out.println(division(10,2));
//        System.out.println(modulus(10,2));
//        System.out.println(getInteger(1,10));
//        System.out.println("The factorial of your number " + factorialOfaNumber());
//        System.out.println("Enter a number between 1 and 10:");
//        Scanner sc = new Scanner(System.in);
//        int userInput = sc.nextInt();
//        System.out.println("The factorial of your number " + factorialOfaNumberRecursion(userInput));
        diceRolling();
    }

    // If method will not have return it is not going to be void
    // If method will have return it is going to be void


    //Question 1
    public static char/*returns char in here*/ firstChar(/*takes string as an input here*/String name){
        return name.charAt(0);
    }

    //Question 2
    public static char secondChar(String name){
        return name.charAt(1);
    }

    ///Question 3
    public static char lastChar (String name){
        return name.charAt(name.length() - 1);
    }

    //Question 4
    public static char secondToLastChar(String name){
        return name.charAt(name.length() - 2);
    }

    //Question 5
    public static boolean booleanUserWantsToContinue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wanna continue");
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }

    //Question 6
    public static boolean isEven (Integer number){

        if (number % 2 == 0){
            return true;
        }
        return false;
    }

    //Question 7
    public static boolean isOdd (Integer number){
        if (number % 2 != 0){
            return true;
        }
        return false;
    }

    //Question 8
    public static Integer countOdds(Integer number1, Integer number2){
        Integer count = 0;
        for (int i = number1; i <= number2; i++){
        if (isOdd(i)){
            count++;
        }
        }
        return count;
    }

    //Question 9
    public static Integer countEvens (Integer number1 ,Integer number2){
        Integer count = 0;
        for (int i = number1; i <= number2; i++){
            if (isEven(i)){
                count++;
            }
        }
        return count;
    }

    //Question 10
    public static Boolean isVowel(String input){
        String vowels = "aeiouAEIOU";
        return vowels.contains(input);
    }


    //Question 11
    public static Boolean hasVowel(String input){
        for (int i = 0; i < input.length(); i++){
            if ((input.charAt(i) == 'a') ||
                    (input.charAt(i) == 'e') ||
                    (input.charAt(i) == 'i') ||
                    (input.charAt(i) == 'o') ||
                    (input.charAt(i) == 'u')){
                return true;
            }
        }
        return false;
    }


    //Question 12
    public static int countVowels(String input){
        int count = 0;
        for (Integer i = 0; i < input.length(); i++){
            char eachLetter = input.charAt(i);
            if ((input.charAt(i) == 'a') ||
                    (input.charAt(i) == 'e') ||
                    (input.charAt(i) == 'i') ||
                    (input.charAt(i) == 'o') ||
                    (input.charAt(i) == 'u')){
                count++;
            }
        }
return count;
    }

    //Question 13

    //Question 14
    public static boolean isPrime(Integer input){
        if (input <= 1){
            return false;
        }
        for (int i = 2; i < input; i++){
            if (input % i == 0){
                return false;
            }
        }
        return true;
    }

    //Question15

//    public static Integer getTwentyPrimes (String input){
//        if (input <= 1){
//            return false;
//        }
//        for (int i = 2; i < 100; i++){
//            if (input % )
//        }
//    }

    //Methods exercise 1 ===================
    public static int addition (int num1, int num2){
        return num1 + num2;
    }

    public static int subtraction (int num1, int num2){
        return num1 - num2;
    }

    public static int multiplication (int num1, int num2){
        return num1 * num2;
    }

    //multiply two numbers without "*" with for loop

    public static int multiplicationForLoop (int num1, int num2){
        int result = 0;
        for (int i = 0; i < num1; i++){ //sums num2 times num1
            result += num2;
        }
        return result;
    }

    //multiply two numbers without "*" with recursion method

    public static int multiplicationRecursion (int num1, int num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        } else {
            return num1 + multiplication(num1, num2 - 1);
        }
    }

    public static int division (int num1, int num2){
        return num1 / num2; // if you divide 0 jvm will throw an error
    }

    public static int modulus (int num1, int num2){
        return num1 % num2;
    }

    //Methods exercise 2 ===================
    public static int getInteger (int min, int max) {
        System.out.println("Enter a number between 1 and 10:");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput < min || userInput > max) {
            return getInteger(min, max);
        } else {
            return userInput;
        }
    }

    //Methods exercise 3 ===================

    public static long factorialOfaNumber (){
        System.out.println("Enter a number between 1 and 10:");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        long fact = 1;
        if (userInput > 0 && userInput < 10){
            for (int i = 1; i <= userInput; i++){
                 fact = fact * i;
            }
        } else {
            fact = factorialOfaNumber();
        }
        return fact;
    }

    //factorial of a number with recursion

    public static long factorialOfaNumberRecursion(int num){
        if (num > 0 && num < 10){
            return num * factorialOfaNumberRecursion(num - 1);
        } else {
            return 1;
        }
    }

    //Methods exercise 4 ===================

    public static void diceRolling (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides for a first dice.");
        int input1 = sc.nextInt();
        System.out.println("Enter the number of sides for a second dice.");
        int input2 = sc.nextInt();
        System.out.println("Roll the dice typing roll");
        String userInput = sc.next();
        if (userInput.equalsIgnoreCase("roll")){
            int random1 = (int)(Math.random() * (input1 - 1 + 1) + 1);
            int random2 = (int)(Math.random() * (input2 - 1 + 1) + 1);
            System.out.println("Your first dice: " + random1);
            System.out.println("Your first dice: " + random2);
            System.out.println("Do you wanna dice again");
            String userInput2 = sc.next();
            if (userInput2.equalsIgnoreCase("yes")){
                diceRolling();
            }
        }
    }


    //Methods exercise 5 ===================


}
