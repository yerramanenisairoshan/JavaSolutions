package Inheritance;

public class HRManager extends Employee1 {

    public HRManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("I am working as an HR Manager");
    }

    @Override
    public String getName() {
        return null;
    }

    public void addEmployee(Employee1 employee) {
        System.out.println("I added the employee " + employee.getName());
    }

}
