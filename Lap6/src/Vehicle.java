import java.time.Year;

public class Vehicle {
    private final String brand;
    private final int year;

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year  = year;
    }
    public void displayInfo(){
        System.out.println("Brand"+ brand + "Year" + year);
    }
}
