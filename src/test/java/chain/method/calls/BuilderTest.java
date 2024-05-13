package chain.method.calls;

import com.mentorship.chained.method.calls.Builder;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuilderTest {
    @Test
    public void testBuilder(){
        Builder builder = new Builder();

        builder.setName("Bohdan_Test")
                .setType("Type_Test")
                .setSize(5);

        assertEquals("Bohdan_Test", builder.getName());
        assertEquals("Type_Test", builder.getType());
        assertEquals(5, builder.getSize());
    }
}
