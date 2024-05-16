package builderPattern;

import com.mentorship.patterns.builderPattern.model.ProducerCoutry;
import com.mentorship.patterns.builderPattern.model.Wheel;
import com.mentorship.patterns.builderPattern.model.Wheels;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

public class WheelsTest {
    @Test
    public void testWheelsBuilder(){
        Wheels wheels = new Wheels.Builder()
                .addWheel(new Wheel.Builder()
                        .brand("Sport Lamborghini")
                        .producer(ProducerCoutry.FRANCE)
                        .size(20.0)
                        .isWinter(false)
                        .build())
                .build();

        assertThat(wheels.getWheelList(), hasSize(1));

        Wheel wheel = wheels.getWheelList().get(0);
        assertThat(wheel.getBrand(), is(equalTo("Sport Lamborghini")));
        assertThat(wheel.getProducer(), is(equalTo(ProducerCoutry.FRANCE)));
        assertThat(wheel.getSize(), is(equalTo(20.0)));
        assertThat(wheel.getIsWinter(), is(equalTo(false)));
    }
}
