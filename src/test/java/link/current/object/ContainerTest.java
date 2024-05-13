package link.current.object;

import com.mentorship.link.current.object.Container;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainerTest {
    @Test
    public void testContainer() {
        Container container1 = new Container(1);
        Container container2 = new Container(2);
        Container container3 = new Container(3);

        container1.setValue(4);
        container2.setValue(5);

        assertEquals(4, container1.getValue());
        assertEquals(5, container2.getValue());
        assertEquals(3,container3.getValue());
    }
}
