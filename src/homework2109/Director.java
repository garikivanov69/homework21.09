package homework2109;

import java.util.Arrays;

public class Director extends Employee {
    public Director(String name, String surname, int experience) {
        super(name, surname, experience);
    }

    @Override
    public POSITION getPosition() {
        return POSITION.DIRECTOR;
    }

    Employee[] employees = new Employee[3];

    public Employee[] getEmployees() {
        return employees;
    }

      Employee[] employees2 = new Employee[1];
    public Employee[] getEmployees2() {
        return employees2;
    }


    @Override
    public int calculationSalary() {
        return super.calculationSalary() * employees.length;
    }

    @Override
    public String toString() {
        return "Director{" +
                "employees=" + Arrays.toString(employees) + "Exerience: " + experience + "," +
                '}';
    }
}







