import java.util.Scanner;

public class HighLow {
    public static void main (String[] args){
        initilizeGame();
    }

    public static void initilizeGame(){
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*100)+1;
        System.out.println("Please guess a number between 1 and 100: ");
        playGame(sc,randomNumber);
    }

    public static void playGame(Scanner sc, int randomNumber){

        int userGuess = sc.nextInt();

        if (userGuess < 1 || userGuess > 100){
            System.out.println("Your guess is out of bounds. Please try again");
            playGame(sc,randomNumber);
        } else {
           String response = checkGuess(userGuess, randomNumber);
           if (response.equals("GOOD GUESS!")){
               System.out.println(response);
           }else {
               System.out.println(response);
               playGame(sc,randomNumber);
           }
        }
    }

    public static String checkGuess (int guess, int targetNum){
        if (guess == targetNum){
           return "GOOD GUESS!";
        }else if (guess > targetNum){
            return "HIGHER";
        }else if (guess < targetNum){
            return "LOWER";
        }
        return "enter valid number";
    }



}
