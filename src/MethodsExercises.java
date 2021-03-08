import java.awt.*;
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
        System.out.println(isVowel("e"));
//        System.out.println(hasVowel("Hello"));
//        System.out.println(countVowels("hello"));


    }

    // If method will not have return it is not going to be void
    // If method will have return it is going to be void


    //Question 1
    public static char firstChar(String name){
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

    //Question 10
    public static Integer countEvens (Integer number1 ,Integer number2){
        Integer count = 0;
        for (int i = number1; i <= number2; i++){
            if (isEven(i)){
                count++;
            }
        }
        return count;
    }

    //Question 11
    public static Boolean isVowel(String input){
        String vowels = "aeiouAEIOU";
        return vowels.contains(input);
    }


    //Question 12
//    public static Boolean hasVowel(String input){
//        for (int i = 0; i < input.length(); i++){
//            String eachLetter = input.substring(0, i);
//            if (eachLetter.equalsIgnoreCase("a") ||eachLetter.equalsIgnoreCase("e") || eachLetter.equalsIgnoreCase("i") || eachLetter.equalsIgnoreCase("o")|| eachLetter.equalsIgnoreCase("u")){
//                return true;
//            }
//        }
//        return true;
//    }


    //Question 13
//    public static int countVowels(String input){
//        int count = 0;
//        for (Integer i = 0; i < input.length(); i++){
//            char eachLetter = input.charAt(i);
//            if (eachLetter){
//                count++;
//            }
//        }
//return count;
//    }
}
