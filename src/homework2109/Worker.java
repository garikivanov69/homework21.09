package homework2109;

public class Worker extends Employee {
    @Override
    public POSITION getPosition() {
        return POSITION.Worker;
    }

    public int calculationSalary() {
        return super.calculationSalary();
    }

    public Worker(String name, String surname, int experience) {
        super(name, surname, experience);
    }

}
