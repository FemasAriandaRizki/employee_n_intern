package demo_of_problem;

public class Intern extends Employee {
    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return 0; // Intern tidak mendapatkan gaji
    }
}
