package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    static HashMap<String, Student> students = new HashMap<>();
    static Input input = new Input();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Student student1 = new Student("William");
        student1.addGrade(10);
        student1.addGrade(20);
        student1.addGrade(30);

        Student student2 = new Student("Yasin");
        student2.addGrade(30);
        student2.addGrade(40);
        student2.addGrade(30);

        Student student3 = new Student("Carlos");
        student3.addGrade(40);
        student3.addGrade(50);
        student3.addGrade(30);

        Student student4 = new Student("Emily");
        student4.addGrade(80);
        student4.addGrade(20);
        student4.addGrade(90);

        students.put("williambaldridge", student1);
        students.put("yasinmogultay", student2);
        students.put("carlospadilla91", student3);
        students.put("emilyhorn", student4);

        gradesApp();
    }

    public static void viewUsersByUserName() {
        students.forEach((key, value) -> {
            System.out.print(" |" + key + "| ");
        });
        System.out.println("\n");
    }

    public static void viewStudent() {
        System.out.println("What student would you like to see more information on?");
        String userInput = sc.nextLine();

        if (students.containsKey(userInput)) {
            System.out.println("Name: " + students.get(userInput).getName() + " - GitHub Username: " + userInput);
            System.out.println("Current Average: " + students.get(userInput).getGradeAverage());
            System.out.println("All Grades for " + userInput + " " + students.get(userInput).getGrades());
        } else {
            System.out.println("Sorry, no student found with the GitHub username of " + userInput);
        }
    }

    public static void viewAllGrades() { // .keySet() method in Java is used to create a set out of the key elements contained in the hash map.
        for (String username : students.keySet()) {
            System.out.println(username + " : " + students.get(username).getGrades());
        }
    }

    public static void viewClassAverage() {
        double sumOfAverages = 0;
        for (String username : students.keySet()) {
            sumOfAverages += students.get(username).getGradeAverage();
        }
        System.out.println("Class Average is: " + sumOfAverages / students.size());
    }

    public static void viewReport() {
        System.out.println("name,github_username,average");
        for (String username : students.keySet()) {
            System.out.println(students.get(username).getName() + " " + username + " " + students.get(username).getGradeAverage());
        }
    }

    public static void gradesApp() {
        System.out.println("Welcome !\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        viewUsersByUserName();

        boolean continueRunning = true;
        do {
            System.out.println("Here is your options: ");
            System.out.println("1 - View a student with more information.");
            System.out.println("2 - View all grades for all students");
            System.out.println("3 - View overall class average");
            System.out.println("4 - View a CSV report of all students");
            System.out.println("5 - Exit");

            System.out.println("What would you like to do? Please enter a number from 1-4");
            int userInput = input.getInt();

            switch (userInput) {
                case 1:
                    viewStudent();
                    System.out.println("Would you like to continue?");
                    continueRunning = input.yesNo();
                    gradesApp();
                    break;
                case 2:
                    viewAllGrades();
                    System.out.println("Would you like to continue?");
                    continueRunning = input.yesNo();
                    gradesApp();
                case 3:
                    viewClassAverage();
                    System.out.println("Would you like to continue?");
                    continueRunning = input.yesNo();
                    gradesApp();
                case 4:
                    viewReport();
                    System.out.println("Would you like to continue?");
                    continueRunning = input.yesNo();
                    gradesApp();
                case 5:
                    System.out.println("Bye");
                    continueRunning = false;
            }
        } while (continueRunning);
        System.out.println("Thanks for using Application");
    }
}
