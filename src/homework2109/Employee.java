package homework2109;

import java.util.Arrays;

public abstract class Employee extends Person {
    protected int experience;
    public abstract POSITION getPosition();

    public int calculationSalary() {

        int salary = 27 * experience * getPosition().getCoefficient();
        return salary;
    }

    public Employee(String name, String surname, int experience) {
        this.name = name;
        this. surname = surname;
        this.experience = experience;
    }


    public String toStringExperiance() {
        return "experience=" + experience +",";

    }
}
