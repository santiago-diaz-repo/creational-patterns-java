package state;

import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    public void testState(){
        ControllerState controllerState = new ControllerState();

        State validator = new Validator();
        validator.onBlocked(controllerState);

        State finisher = new Finisher();
        finisher.onFinished(controllerState);
    }
}
