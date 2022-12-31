package day34_abstraction_interface.carTask;

public class Toyota extends Car{

    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }


    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" is starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" is driving");

    }
}
