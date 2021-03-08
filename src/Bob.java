import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

        System.out.println("Ask a question to Bob");
        Scanner sc = new Scanner(System.in);
        String questionToBob = sc.nextLine();
        String lastChar = questionToBob.substring(questionToBob.length() - 1);
        System.out.println();
        if (lastChar.equals("?")){
            System.out.println("Sure.");
        } else if (lastChar.equals("!")){
            System.out.println("Whoa, chill out");
        } else if (questionToBob.equals(" ")){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }


    }
}
