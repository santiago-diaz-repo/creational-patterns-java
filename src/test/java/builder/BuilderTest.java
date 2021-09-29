package builder;

import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    public void testBuilder(){
        Car car = new Car.CarBuilder(35345.89).type("something").color("blue").build();
        Car car2 = new Car.CarBuilder(35345.89).color("red").build();
    }
}
