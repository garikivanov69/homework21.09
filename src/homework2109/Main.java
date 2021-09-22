package homework2109;

public class Main {
    public static void main(String[] args) {
        Employee sertetor = new Worker("Alex", "Ivanov",10);
        Employee janitor = new Worker("Mark","Petrov", 2);
        Employee accountant = new Worker("Helen", "limutina",4);
        Director director1 = new Director("Ben", "Smit", 17);
        Director director2 = new Director("Nik", "Peskov", 9);
        director1.getEmployees()[0] = sertetor;
        director1.getEmployees() [1] = janitor;
        director1.getEmployees() [2] = director2;
        director2.getEmployees()[0] = accountant;

        System.out.println(director1);


//
//        System.out.println(.toString() +secretary.calculationSalary());
//        System.out.println(janitor.toString() + janitor.calculationSalary());
//        System.out.println(accountant.toString() + accountant.calculationSalary());
//        System.out.println(director1.toString() + accountant.calculationSalary());


    }
}
