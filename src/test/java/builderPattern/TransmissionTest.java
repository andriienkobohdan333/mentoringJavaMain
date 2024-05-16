package builderPattern;

import com.mentorship.patterns.builderPattern.model.DriveTrain;
import com.mentorship.patterns.builderPattern.model.ProducerCoutry;
import com.mentorship.patterns.builderPattern.model.Transmission;
import com.mentorship.patterns.builderPattern.model.TransmissionType;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TransmissionTest {

    @Test
    public void testTransmissionBuilder(){
        Transmission transmission = new Transmission.Builder()
                .type(TransmissionType.DUAL_CLUTCH)
                .numberOfGears(7)
                .isManual(false)
                .driveTrain(DriveTrain.AWD)
                .producerCountry(ProducerCoutry.Italy)
                .build();

        assertThat(transmission.getType(), is(equalTo(TransmissionType.DUAL_CLUTCH)));
        assertThat(transmission.getNumberOfGears(), is(equalTo(7)));
        assertThat(transmission.getIsManual(), is(equalTo(false)));
        assertThat(transmission.getDriveTrain(), is(equalTo(DriveTrain.AWD)));
        assertThat(transmission.getProducer(), is(equalTo(ProducerCoutry.Italy)));
    }
}
