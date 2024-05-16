package builderPattern;

import com.mentorship.patterns.builderPattern.Car;
import com.mentorship.patterns.builderPattern.model.DriveTrain;
import com.mentorship.patterns.builderPattern.model.Engine;
import com.mentorship.patterns.builderPattern.model.EngineType;
import com.mentorship.patterns.builderPattern.model.ProducerCoutry;
import com.mentorship.patterns.builderPattern.model.Transmission;
import com.mentorship.patterns.builderPattern.model.TransmissionType;
import com.mentorship.patterns.builderPattern.model.Wheel;
import com.mentorship.patterns.builderPattern.model.Wheels;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CarTest {

    @Test
    public void testCarBuiler() {
        Transmission transmissionSport = new Transmission.Builder()
                .type(TransmissionType.DUAL_CLUTCH)
                .numberOfGears(7)
                .isManual(false)
                .driveTrain(DriveTrain.AWD)
                .producerCountry(ProducerCoutry.Italy)
                .build();

        Engine engineSport = new Engine.Builder()
                .name("Lamborghini Huracan")
                .engineType(EngineType.GASOLINE)
                .power(500)
                .producer(ProducerCoutry.Italy)
                .build();

        Wheels wheelsSport = new Wheels.Builder()
                .addWheel(new Wheel.Builder()
                        .brand("Sport Lamborghini")
                        .producer(ProducerCoutry.FRANCE)
                        .size(20.0)
                        .isWinter(false)
                        .build())
                .addWheel(new Wheel.Builder()
                        .brand("Sport Lamborghini")
                        .producer(ProducerCoutry.FRANCE)
                        .size(20.0)
                        .isWinter(false)
                        .build())
                .addWheel(new Wheel.Builder()
                        .brand("Sport Lamborghini")
                        .producer(ProducerCoutry.FRANCE)
                        .size(20.0)
                        .isWinter(false)
                        .build())
                .addWheel(new Wheel.Builder()
                        .brand("Sport Lamborghini")
                        .producer(ProducerCoutry.FRANCE)
                        .size(20.0)
                        .isWinter(false)
                        .build())
                .build();

        Car car = new Car.Builder()
                .madeBy(ProducerCoutry.Italy)
                .model("Lamborghini")
                .producedDate(LocalDate.of(2024, 5, 15))
                .mileage(0)
                .engine(engineSport)
                .transmission(transmissionSport)
                .wheels(wheelsSport)
                .build();

        assertThat(car.getProducer(), is(ProducerCoutry.Italy));
        assertThat(car.getModel(), is("Lamborghini"));
        assertThat(car.getProducedDate(), is(LocalDate.of(2024, 5, 15)));
        assertThat(car.getMileage(), is(0));
        assertThat(car.getEngine(), is(engineSport));
        assertThat(car.getTransmission(), is(transmissionSport));
        assertThat(car.getWheels(), is(wheelsSport));

    }

}
