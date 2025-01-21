public class Car {

    String make;
    String model;
    int year;

    public Car(String make,String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void display(){
        System.out.println("Car make " + make);
        System.out.println("Car model " + model);
        System.out.println("Car year " + year);
    }
}
