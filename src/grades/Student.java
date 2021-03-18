package grades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String studentName;
    private List<Integer> studentGrade;

    public Student(String studentName, List<Integer> studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getName(){
        return studentName;
    }

    public void addGrade(int grade){
        studentGrade.add(grade);
    }

    public double getGradeAverage(){
        int grade = studentGrade.stream().mapToInt(Integer::intValue).sum(); //https://stackoverflow.com/questions/5963847/is-there-possibility-of-sum-of-arraylist-without-looping/5963867
        int gradeSize = studentGrade.size();
        return grade / gradeSize;
    }

    public static void main(String[] args) {
        Student student = new Student("William", Collections.singletonList(10));
        Student student1 = new Student("Yasin", Collections.singletonList(10));
        Student student2 = new Student("Casey", Collections.singletonList(10));
        System.out.println(student.getName());
        System.out.println(student1.getGradeAverage());

    }


}
