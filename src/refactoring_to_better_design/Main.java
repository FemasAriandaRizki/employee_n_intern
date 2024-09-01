package refactoring_to_better_design;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John", 3000);
        UnpaidIntern jane = new UnpaidIntern("Jane");

        System.out.println(john); // Output: John earns 3000.0
        System.out.println(jane); // Output: Jane is an unpaid intern.
    }
}
