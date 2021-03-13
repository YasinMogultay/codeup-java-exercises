import java.util.Locale;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjective = {"different", "efficient", "powerful", "foreign", "hungry", "popular", "available", "useful", "similar", "healthy"};
        String[] nouns = {"coffee", "soap", "music", "dog", "cat", "taxi", "salt", "pepper", "apple", "water"};

        System.out.println("Your random adjective is: " + getWord(adjective));
        System.out.println("Your random noun is: " + getWord(nouns));

    }

    //number randomizer method
    public static int randomNumber(){
        int randomNumber = (int)(Math.random()*10)+1;
        return randomNumber;
    }


     public static String getWord (String[] array){
         String str = array[randomNumber()];
         String cap = str.substring(0,1).toUpperCase() + str.substring(1);
         return cap;
     }

}
