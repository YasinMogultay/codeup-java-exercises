package fileIo;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIoPractice {
    public static void main(String[] args) {
        Path path = Paths.get("src/fileIo/people.txt");

        List<String> names = new ArrayList<>(); // creates empty array list for people.txt file
        List<String> brNames = new ArrayList<>(Arrays.asList("Emily", "Sabrina", "Ann", "Michael"));

        try {
            names = Files.readAllLines(path); //reading all lines in .txt file
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(names); // prints as an array

        for (String name : brNames) { // names for people.txt  brNames for people in my br room
            System.out.println(name + " works at Codeup!");
        }

        List<String> name1 = new ArrayList<>(Arrays.asList("Emily", "Ann", "Michael"));
        deleteEntry((ArrayList) name1);
    }

    public static Path deleteEntry (ArrayList name){
        Path p = Paths.get("src/fileIo/people.txt");
        try {
            return Files.write(p, name);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return p;
    }
}
