package abstract_factory;

import com.mentorship.patterns.abstractfactory.CarFactory;
import com.mentorship.patterns.abstractfactory.ElectricEngine;
import com.mentorship.patterns.abstractfactory.GasEngine;
import com.mentorship.patterns.abstractfactory.SedanBody;
import com.mentorship.patterns.abstractfactory.SportBody;
import com.mentorship.patterns.abstractfactory.SportWheels;
import com.mentorship.patterns.abstractfactory.SportsCarFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SportsCarFactoryTest {

    @Test
    public void testCreateEngine(){
        CarFactory factory = new SportsCarFactory();
        assertTrue(factory.createEngine() instanceof ElectricEngine);
    }

    @Test
    public void testCreateWheels(){
        CarFactory factory = new SportsCarFactory();
        assertTrue(factory.createWheels() instanceof SportWheels);
    }

    @Test
    public void testCreateBody(){
        CarFactory factory = new SportsCarFactory();
        assertTrue(factory.createBody() instanceof SportBody);
    }
}
