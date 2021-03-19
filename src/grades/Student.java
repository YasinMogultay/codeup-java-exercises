package grades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student {

    private String studentName;
    private List<Integer> studentGrade;


    //constructor just for name
    public Student(String studentName) {
        this.studentName = studentName;
        this.studentGrade = new ArrayList<>();
    }

    //constructor for both name and grade
    public Student(String studentName, List<Integer> studentGrade) {
        this.studentName = studentName;
        this.studentGrade = new ArrayList<>();
    }

    public String getName() {
        return studentName;
    }

    public void addGrade(int grade) {
        this.studentGrade.add(grade);
    }


    public double getGradeAverage() {
        int grade = studentGrade.stream().mapToInt(Integer::intValue).sum(); //https://stackoverflow.com/questions/5963847/is-there-possibility-of-sum-of-arraylist-without-looping/5963867
        int gradeSize = studentGrade.size();
        return grade / gradeSize;
    }

    //displaying all students grades
    public List<Integer> getGrades() {
        return this.studentGrade;
    }


    public static void main(String[] args) {

        Student student0 = new Student("William");
        student0.addGrade(20);
        student0.addGrade(20);
        student0.addGrade(20);
        System.out.println(student0.getGradeAverage());
        Student student5 = new Student("yasin", Collections.singletonList(10));
        student5.addGrade(10);

    }


}
