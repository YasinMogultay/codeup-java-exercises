import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsLecture {
    public static void main(String[] args) {

        // ----------------------------- Array Lists

        List<String> names = new ArrayList<>();
        names.add("Carlos");
        names.add("Casey");
        names.add("Yasin");

        names.add(3,"Justin");

        System.out.println(names);

        List<Integer> numbers  = new ArrayList<>(Arrays.asList(
                1,
                2,
                3,
                4
        ));

        numbers.add(4,5);
        numbers.set(0,0); // .set will take in an index number and element and unlike the .add() method and it will replace the value

        System.out.println(numbers);
        Collections.sort(numbers); // .contains .lastindexof .isEmpty another methods for collections

        // info about list and getting elements

//        System.out.println(numbers.size());
//        System.out.println(numbers.indexOf(2));
//        System.out.println(numbers);
//        System.out.println(numbers.indexOf(105));
//
//        ArrayList<String> roasts = new ArrayList<>();
//        roasts.add("medium");
//        roasts.add("light");
//        roasts.add("medium");
//        roasts.add("dark");
//        System.out.println(roasts);
//        System.out.println(roasts.contains("dark"));
//        System.out.println(roasts.contains("espresso"));
//        System.out.println(roasts.lastIndexOf("medium"));
//        System.out.println(roasts.isEmpty());
//
//        ArrayList<String> roast = roasts;
//        System.out.println(roast == roasts);

        // ----------------------------- Hash Maps

        // creating hash maps
//        Map<String, String> usernames = new HashMap<>();
//        usernames.put("Ryan", "ryanorsinger");
//        usernames.put("Luis", "MontealegreLuis");
//        usernames.put("Zach", "zgulde");
//        usernames.put("Fernando", "fmendozaro");
//        usernames.put("Justin", "jreich5");
//        System.out.println(usernames);

        // getting values from and info about hash map
//        System.out.println(usernames);
//        System.out.println(usernames.get("Justin"));
//        System.out.println(usernames.get("Phillip"));
//        System.out.println(usernames.get("Justin"));
//        System.out.println(usernames.getOrDefault("Fred", "gocodeup"));
//        System.out.println(usernames.containsKey("Luis"));

        // updating hash maps

//        usernames.put("Ryan", "rorsinger");
//        System.out.println(usernames);
//        usernames.put("Ryan", "Test");
//
//        usernames.putIfAbsent("Zach", "coderdude24");
//        usernames.replace("Ryan", "torvalds"); // same as put
//        System.out.println(usernames);

        // removing pairs from hash map

//        System.out.println(usernames.remove("Zach"));
//        System.out.println(usernames.remove("Zach"));
//        System.out.println(usernames);
//        System.out.println(usernames);
//        usernames.clear();
//        System.out.println(usernames);
//        System.out.println(usernames.isEmpty());

    }
}
