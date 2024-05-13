package abstract_factory;

import com.mentorship.patterns.abstractfactory.BasicWheels;
import com.mentorship.patterns.abstractfactory.CarFactory;
import com.mentorship.patterns.abstractfactory.ElectricEngine;
import com.mentorship.patterns.abstractfactory.GasEngine;
import com.mentorship.patterns.abstractfactory.SedanBody;
import com.mentorship.patterns.abstractfactory.SedanCarFactory;
import com.mentorship.patterns.abstractfactory.SportBody;
import com.mentorship.patterns.abstractfactory.SportWheels;
import com.mentorship.patterns.abstractfactory.SportsCarFactory;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ElectricCarFactoryTest {
    @Test
    public void testCreateEngine(){
        CarFactory factory = new SedanCarFactory();
        assertTrue(factory.createEngine() instanceof GasEngine);
    }

    @Test
    public void testCreateWheels(){
        CarFactory factory = new SedanCarFactory();
        assertTrue(factory.createWheels() instanceof BasicWheels);
    }

    @Test
    public void testCreateBody(){
        CarFactory factory = new SedanCarFactory();
        assertTrue(factory.createBody() instanceof SedanBody);
    }
}
