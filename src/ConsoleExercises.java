import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

        double pi = 3.14159;
        //System.out.printf("The value of pi is approximately %.2f", pi);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your age");
//        int age = sc.nextInt(); // if you enter value other then defined class for variable it will throw errors
//        sc.next();
//        System.out.println(age);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 3 words");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a sentence");
//        String sentence = sc.next(); // it doesnt capture more than one world because of .next() method .nextLine() can fix that
//        System.out.println(sentence);

        //perimeter and area of Codeup's classrooms
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lenght");
        String length = sc.nextLine();
        double l = Double.parseDouble(length); //coeversion string to double number or integer
        System.out.println("Enter width");
        String width = sc.nextLine();
        double w = Double.parseDouble(width);

        System.out.println("The area of Classroom is " + (l * w));
        System.out.println("The perimeter of Classroom is " + 2 * (l + w));

    }


}
