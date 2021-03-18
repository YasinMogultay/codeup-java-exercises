package grades;

import java.util.*;

public class GradesApplication {
    static  Map<String, Student> students = new HashMap<>();
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


        viewUsersByUserName();
        viewStudent();
    }

    public static void viewUsersByUserName (){
        System.out.println("Welcome !\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        students.forEach((key,value) -> {
            System.out.print(" |" + key + "| ");
        });
        System.out.println("\n");
    }

    public static void viewStudent(){
        System.out.println("What student would you like to see more information on?\n");
        String input = sc.nextLine();

        if (students.containsKey(input)){
            System.out.println("Name: " + students.get(input).getName() + " - GitHub Username: " + input);
            System.out.println("Current Average: " + students.get(input).getGradeAverage());
            System.out.println("All Grades: " + students.get(input).getGrades());
        } else {
            System.out.println("Sorry, no student found with the GitHub username of " + input);
        }
    }
}
