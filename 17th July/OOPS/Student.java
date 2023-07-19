package OOPS;
import java.util.*;
public class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }
}

class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 10);

        System.out.println("Student details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Courses: " + student.getCourses());

        // Add courses
        student.addCourse("Mathematics");
        student.addCourse("Science");
        student.addCourse("English");

        System.out.println("\nAfter adding courses:");
        System.out.println("Courses: " + student.getCourses());

        // Remove a course
        student.removeCourse("Science");

        System.out.println("\nAfter removing a course:");
        System.out.println("Courses: " + student.getCourses());
    }
}
