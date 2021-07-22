public class CarUtils {

    public static String getCarDetails(Car car){

        String make = car.getMake();
        String model = car.getModel();
        String year = car.getYear();
        String color = car.getColor();

        if(make == null){
            return "Not able to provide make details";
        }
        if(model == null){
            return "Not able to provide model details";
        }
        if(year == null){
            return "Not able to provide year details";
        }
        if(color == null){
            return "Not able to provide color details";
        }
        return color + " " + year + " " + make + " " + model;
    }

    public static void addToMileage(Car car, double mileage){

        double oldMileage = car.getMileage();
        car.setMileage(oldMileage + mileage);

    }

    public static void  convertToElectric(Car car, boolean isElectric){

        boolean electric = car.isElectric();
        car.setElectric(electric);
    }
}
