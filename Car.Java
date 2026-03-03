//Alexzander Oates


public class Car {
    private String car_ID;
    private String brand;
    private String model;
    private int year;
    private String fuel_Type;
    private String color;
    private double mileage_kmpl;

    public Car(String Car_ID, String Brand, String Model, int Year, String Fuel_Type, String Color, double Mileage_kmpl) {
        this.car_ID = car_ID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuel_Type = fuel_Type;
        this.color = color;
        this.mileage_kmpl = mileage_kmpl;
    }

    public String getCar_ID() {
        retrun car_ID;
    }
    public String getBrand() {
        retrun brand;
    }
    public String getModel() {
        retrun model;
    }
    public String getYear() {
        retrun year;
    }
    public String getFuel_Type() {
        retrun fuel_Type;
    }
    public String getColor() {
        retrun color;
    }
    public String getMileage_kmpl() {
        retrun mileage_kmpl;
    }
}