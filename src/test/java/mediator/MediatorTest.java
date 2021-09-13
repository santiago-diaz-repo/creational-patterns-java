package mediator;

import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    public void mediatorTest(){
        MediatorImpl mediator = new MediatorImpl();

        Colleague button = new Button(mediator);
        Colleague fan = new Fan(mediator);

        mediator.setButton(button);
        mediator.setFan(fan);

        button.executeAction();
        button.executeAction();
        button.executeAction();
        button.executeAction();
    }
}
