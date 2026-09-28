class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double higherSalary(Employee e) {
        if (this.salary > e.salary) {
            return this.salary;
        }
        return e.salary;
    }
}

public class Main3 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Yemen", 10);
        Employee e2 = new Employee("Nasar", 20);

        System.out.println("Higher Salary: " + e1.higherSalary(e2));
    }
}
