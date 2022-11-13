package devices;

public class Car {
    final String model;
    final String producer;
    public double price;
    public double mileage;

    public Car(String model, String producer, Double price, Double mileage) {
        this.model = model;
        this.producer = producer;
        this.price = price;
        this.mileage = mileage;
    }
    public String toString(){
        return model+" "+producer+" "+price+" "+mileage;
    }

}