package builderPattern;

import com.mentorship.patterns.builderPattern.model.Engine;
import com.mentorship.patterns.builderPattern.model.EngineType;
import com.mentorship.patterns.builderPattern.model.ProducerCoutry;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class EngineTest {
    @Test
    public void testEngineBuilder(){
        Engine engine = new Engine.Builder()
                .name("Lamborghini Huracan")
                .engineType(EngineType.GASOLINE)
                .power(500)
                .producer(ProducerCoutry.Italy)
                .build();

        assertThat(engine.getName(), is(equalTo("Lamborghini Huracan")));
        assertThat(engine.getEngineType(), is(equalTo(EngineType.GASOLINE)));
        assertThat(engine.getPower(), is(equalTo(500)));
        assertThat(engine.getProducer(), is(equalTo(ProducerCoutry.Italy)));

    }
}
