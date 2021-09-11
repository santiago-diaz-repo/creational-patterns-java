package command;

import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    public void testLightCommand(){
        Light light = new Light();

        RemoteControl remoteControlLightOn = new RemoteControl(new LightOnCommand(light));
        remoteControlLightOn.buttonPressed();

        RemoteControl remoteControlOff = new RemoteControl(new LightOffCommand(light));
        remoteControlOff.buttonPressed();
    }

    @Test
    public void testStereoCommand(){
        Stereo stereo = new Stereo();

        RemoteControl remoteControl = new RemoteControl(new StereoOnCommand(stereo));
        System.out.println("----------------------------");
        remoteControl.buttonPressed();
        remoteControl.buttonPressed();
        remoteControl.buttonPressed();
        remoteControl.buttonPressed();

        System.out.println("----------------------------");
        remoteControl.undo();
        remoteControl.undo();

        System.out.println("----------------------------");
        remoteControl.redo();
    }
}
