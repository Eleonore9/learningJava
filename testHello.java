import org.junit.Test;
import static org.junit.Assert.*;

public class testHello {
    @Test
    public void testPrintHelloWorld() {
        Hello tester = new Hello();

        String result = tester.main().toString();
        assertEquals("Hello World!", result);
    }
}
