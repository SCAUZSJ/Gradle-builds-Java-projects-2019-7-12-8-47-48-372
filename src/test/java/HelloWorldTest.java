import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.LinkedList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {

    @Test
    public void testMockClass() throws Exception {
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        String value = "first";
        when(mockedList.get(0)).thenReturn(value);

        Assertions.assertEquals(mockedList.get(0), value);

    }
}
