package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");

        System.out.print("Enter your choice: ");
        int userInput = sc.nextInt();

        Movie[] movies = MoviesArray.findAll(); //that generate all the movies

        if (userInput == 0) {
            System.out.println("exit");
        } else if (userInput == 1) {
            for (Movie movie : movies)
                System.out.println(movie.getName() + " -- " + movie.getCategory());
        } else if (userInput == 2) {
            for (Movie movie : movies)
                if (movie.getCategory().equalsIgnoreCase("animated")) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
        } else if (userInput == 3) {
            for (Movie movie : movies)
                if (movie.getCategory().equalsIgnoreCase("drama")) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
        } else if (userInput == 4) {
            for (Movie movie : movies)
                if (movie.getCategory().equalsIgnoreCase("horror")) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
        } else if (userInput == 5) {
            for (Movie movie : movies)
                if (movie.getCategory().equalsIgnoreCase("scifi")) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
        }

    }
}
