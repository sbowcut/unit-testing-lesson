public class Car {

    private String make;
    private String model;
    private String year;
    private String color;
    private double mileage;
    private boolean isElectric;

    public Car(String make, String model, String year, String color, double mileage, boolean isElectric) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.isElectric = isElectric;
    }

    public Car(){}

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getMileage() {
        return mileage;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
