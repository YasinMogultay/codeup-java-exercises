import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

        System.out.println("Ask a question to Bob");
        Scanner sc = new Scanner(System.in);
        String questionToBob = sc.nextLine();
        System.out.println();
        if (questionToBob.endsWith("?")){
            System.out.println("Sure.");
        } else if (questionToBob.endsWith("!")){
            System.out.println("Whoa, chill out");
        } else if (questionToBob.equals("")){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }


    }
}
