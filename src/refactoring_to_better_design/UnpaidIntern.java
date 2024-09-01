package refactoring_to_better_design;

class UnpaidIntern extends Intern {
    public UnpaidIntern(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 0; // No salary for unpaid interns
    }
}
