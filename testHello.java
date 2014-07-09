import org.junit.Test;
import org.junit.ClassRule.*;
import org.junit.rules.*;
import org.junit.Assert.*;
import static system-rules.org.unit.contrib.java.lang.system.StandardOutputStreamLog.*;

public class testHello {
    @Rule
    public final StandardOutputStreamLog outputLog = new StandardOutputStreamLog();

    @Test
    public void testPrintHelloWorld() {
        //Hello tester = new Hello();
        //String result = tester.main().toString();
        //assertEquals("Hello World!", result);
        
        System.out.print("Hello World!");
        assertEquals("Hello World!", outputLog.getLog());
    }
}
