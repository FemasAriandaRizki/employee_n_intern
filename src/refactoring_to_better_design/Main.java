package refactoring_to_better_design;

public class Main {
    public static void main(String[] args) {
        Employee john = new RegularEmployee("John Doe", 5000);
        Employee jane = new PaidIntern("Jane Smith", 1000);
        Employee jack = new UnpaidIntern("Jack Brown");

        System.out.println(john);  // Output: John Doe earns 5000.0
        System.out.println(jane);  // Output: Jane Smith earns 1000.0
        System.out.println(jack);  // Output: Jack Brown earns 0.0
    }
}

