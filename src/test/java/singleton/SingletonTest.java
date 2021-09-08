package singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SingletonTest {

    @Test
    public void testSingleton(){
        final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));

        Singleton subject1 = Singleton.getInstance();
        Assertions.assertEquals("Creating instance\n", myOut.toString());
        myOut.reset();

        Singleton subject2 = Singleton.getInstance();
        Assertions.assertEquals("", myOut.toString());
    }
}
