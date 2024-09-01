package refactoring_to_better_design;

class PaidIntern extends Intern {
    private double stipend;

    public PaidIntern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }
}

