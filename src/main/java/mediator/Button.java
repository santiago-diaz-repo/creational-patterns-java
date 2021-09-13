package mediator;

public class Button extends Colleague{

    public Button(Mediator mediator){
        super(mediator);
    }

    @Override
    public void executeAction() {
        press();
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public void press(){
        System.out.println("press button");
        this.mediator.press();
    }
}
