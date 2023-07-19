package Inheritance;

public class Person {


    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Sairoshan", "Yerramaneni", "123489", "Software Engineer");
        System.out.println(employee.getLastName());
        System.out.println(employee.getEmployeeId());
    }
}
