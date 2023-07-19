package OOPS;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void calculateSalaryIncrease(double percentage) {
        double increaseAmount = salary * (percentage / 100);
        salary += increaseAmount;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }
}

 class EmployeeExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Sai Roshan", "Software Engineer", 5000.0);

        System.out.println("Employee details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Salary: " + employee.getSalary());

        // Calculate and update salary increase
        double percentageIncrease = 10.0;
        employee.calculateSalaryIncrease(percentageIncrease);

        System.out.println("\nAfter " + percentageIncrease + "% salary increase:");
        System.out.println("Salary: " + employee.getSalary());

        // Update salary directly
        double newSalary = 6000.0;
        employee.setSalary(newSalary);

        System.out.println("\nAfter direct salary update:");
        System.out.println("Salary: " + employee.getSalary());
    }
}
