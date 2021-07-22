import org.junit.Assert;
import org.junit.Test;

public class CarDetailsTests {

    @Test
    public void getCarDetails_GivenValidCar_ReturnsExpectedString(){

        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear("2019");
        car.setColor("Red");

        //Act
        String details = CarUtils.getCarDetails(car);

        //Assert
        Assert.assertEquals("Red 2019 Ford Mustang", details);

    }
    @Test
    public void getCarDetails_GivenYearNullValues_ReturnsErrorString(){

        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
        //No set Year

        //Act
        String details = CarUtils.getCarDetails(car);

        //Assert
        Assert.assertEquals("Not able to provide year details", details);
    }
    @Test
    public void getCarDetails_GivenMakeNullValues_ReturnsErrorString(){

        //Arrange
        Car car = new Car();
        car.setModel("Mustang");
        car.setYear("2019");

        //Act
        String details = CarUtils.getCarDetails(car);

        //Assert
        Assert.assertEquals("Not able to provide make details", details);
    }
    @Test
    public void getCarDetails_GivenModelNullValues_ReturnsErrorString(){

        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setYear("2019");

        //Act
        String details = CarUtils.getCarDetails(car);

        //Assert
        Assert.assertEquals("Not able to provide model details", details);
    }
    @Test
    public void getCarDetails_GivenColorNullValues_ReturnsErrorString(){

        //Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setYear("2019");
        car.setModel("Mustang");

        //Act
        String details = CarUtils.getCarDetails(car);

        //Assert
        Assert.assertEquals("Not able to provide color details", details);
    }
    @Test
    public void addToMileage_ReturnsCorrectMileage(){

        //Arrange
        Car car = new Car();
        car.setMileage(40000.0);
        //Act
        CarUtils.addToMileage(car, 10000.0);
        //Assert
        Assert.assertEquals(50000.0, car.getMileage() , 0);
    }

    @Test
    public void convertToElectric_ReturnsTrue(){

        //Arrange
        Car car = new Car();
        //Act

        CarUtils.convertToElectric(car, "Electric");
        //Assert
        Assert.assertTrue(car.isElectric());
    }

    @Test
    public void convertToElectric_ReturnsFalse(){

        //Arrange
        Car car = new Car();
        //Act

        CarUtils.convertToElectric(car, "gas");
        //Assert
        Assert.assertFalse(car.isElectric());
    }
}
