package factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FactoryTest {

    @Test
    public void testProductFactory(){
        ByteArrayOutputStream baos= new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Factory factory = new ConcreteFactoryOne();
        factory.doStuff();

        Assertions.assertEquals("Invoking ConcreteProductOne's executeStuffProduct method\n",baos.toString());

    }

    @Test
    public void testProductTwo(){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        Factory factory = new ConcreteFactoryTwo();
        factory.doStuff();

        Assertions.assertEquals("Invoking ConcreteProductTwo's executeStuffProduct method\n", baos.toString());
    }
}
