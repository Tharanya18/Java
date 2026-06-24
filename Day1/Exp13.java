package Day1;

class Car {

    private String brand;
    private String model;
    private double price;

    Car(String brand, String model, double price) {

        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {

        System.out.println("Car Brand : " + brand);
        System.out.println("Car Model : " + model);
        System.out.println("Car Price : " + price);

        System.out.println();
    }
}

public class Exp13 {

    public static void main(String[] args) {

        Car c1 = new Car("BMW", "X5", 9500000);
        Car c2 = new Car("Audi", "A6", 7200000);
        Car c3 = new Car("Toyota", "Fortuner", 4500000);

        c1.display();
        c2.display();
        c3.display();
    }
}