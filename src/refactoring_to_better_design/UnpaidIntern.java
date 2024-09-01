package refactoring_to_better_design;

class UnpaidIntern {
    protected String name;

    public UnpaidIntern(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " is an unpaid intern.";
    }
}
