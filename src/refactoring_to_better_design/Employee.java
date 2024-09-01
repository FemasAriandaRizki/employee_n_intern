package refactoring_to_better_design;

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return name + " earns " + calculateSalary();
    }
}