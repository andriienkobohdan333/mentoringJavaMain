package factory;

import com.mentorship.patterns.factory.Car;
import com.mentorship.patterns.factory.CarFactory;
import com.mentorship.patterns.factory.ConcreteCarFactory;
import com.mentorship.patterns.factory.ElectricCar;
import com.mentorship.patterns.factory.SedanCar;
import com.mentorship.patterns.factory.SportCar;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CarFactoryTest {
    private CarFactory factory = new ConcreteCarFactory();

    @Test
    public void testCreateSedanCar() {
        Car car = factory.createCar("sedan");
        assertNotNull(car);
        assertTrue(car instanceof SedanCar);
    }

    @Test
    public void testCreateElectricCar() {
        Car car = factory.createCar("electric");
        assertNotNull(car);
        assertTrue(car instanceof ElectricCar);
    }

    @Test
    public void testCreateSportCar() {
        Car car = factory.createCar("sport");
        assertNotNull(car);
        assertTrue(car instanceof SportCar);
    }
}
