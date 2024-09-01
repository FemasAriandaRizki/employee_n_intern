package demo_of_problem;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John", 3000);
        Employee jane = new Intern("Jane", 1000);

        System.out.println(john); // Output: John earns 3000.0
        System.out.println(jane); // Output: Jane earns 0.0
    }
}
