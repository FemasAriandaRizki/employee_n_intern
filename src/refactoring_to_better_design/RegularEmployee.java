package refactoring_to_better_design;

class RegularEmployee extends Employee {
    protected double baseSalary;

    public RegularEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}