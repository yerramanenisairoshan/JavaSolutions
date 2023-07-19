package Inheritance;

public class Employee1 {
    private String name;
    private double salary;

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("I am working");
    }
    public static void main(String[] args) {
        HRManager hrManager = new HRManager("Sairoshan", 100000);
        hrManager.work();
        hrManager.addEmployee(new Employee1("Yerramaneni", 50000));
    }
}


