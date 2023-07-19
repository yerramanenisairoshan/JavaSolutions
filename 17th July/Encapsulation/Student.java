package Encapsulation;
import java.util.*;
public class Student {
    private int student_id;
    private String student_name;
    private List<Integer> grades;

    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade! Grade should be between 0 and 100.");
        }
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public static void main(String[] args) {
        Student student = new Student(12346, "Sai Roshan");

        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(105);

        System.out.println("Student details:");
        System.out.println("Student ID: " + student.getStudent_id());
        System.out.println("Student Name: " + student.getStudent_name());
        System.out.println("Grades: " + student.getGrades());
    }
}
