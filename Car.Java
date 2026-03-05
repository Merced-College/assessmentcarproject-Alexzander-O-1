//Alexzander Oates
//3/5/26


public class Car {
    //Data variables
    private String car_ID;
    private String brand;
    private String model;
    private int year;
    private String fuel_Type;
    private String color;
    private double mileage_kmpl;

    //parameterized constructors
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
    public void String setCar_ID(String Car_ID) {
        this.Car_ID = Car_ID;
    }

    public String getBrand() {
        retrun brand;
    }
    public void String setBrandD(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        retrun model;
    }
    public void String setModel(String Model) {
        this.Model = Model;
    }

    public String getYear() {
        retrun year;
    }
    public void String setYear(String Year) {
        this.Year = Year;
    }

    public String getFuel_Type() {
        retrun fuel_Type;
    }
    public void String setFuel_Type(String Fuel_Type) {
        this.Fuel_Type = Fuel_Type;
    }

    public String getColor() {
        retrun color;
    }
    public void String setColor(String Color) {
        this.Color = Color;
    }

    public String getMileage_kmpl() {
        retrun mileage_kmpl;
    }
    public void String setMileage_kmpl(String Mileage_kmpl) {
        this.Mileage_kmpl = Mileage_kmpl;
    }

    @Override
    public String toString() {
        return Car_ID + Brand + Model + Year + Fuel_Type + Color + Mileage_kmpl;
    }
}