package refactoring_to_better_design;

interface PaidEmployee {
    double calculateSalary();
}

public class Employee implements PaidEmployee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return name + " earns " + calculateSalary();
    }
}
