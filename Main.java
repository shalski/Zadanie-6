import devices.Car;

public class Main {
    public static void main(String[] args) {
        Car pasat = new Car("Niesmigany", "Volkswagen", 6000.0,30000.0);
        Car pasacior = new Car("Nowka sztuka","Volkswagen",5800.0,40000.0);
        Car pasat2 = new Car("Niesmigany", "Volkswagen", 6000.0,30000.0);
        Human Janusz = new Human();
        Janusz.Name="Janusz";
        Janusz.Surname="Nowak";
        Janusz.setSalary(2700.0);
        Janusz.getSalary();
        Janusz.setCar(pasat);

        System.out.println(pasat==pasat2);
        System.out.println(pasat);
        System.out.println(pasat2);


    }
}