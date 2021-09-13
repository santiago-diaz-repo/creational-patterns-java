package mediator;

public class Fan extends Colleague{

    public Fan(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void executeAction() { }

    public void turnOn() {
        System.out.println("turn on fan");
        this.setOn(false);
    }

    public void turnOff() {
        System.out.println("turn off fan");
        this.setOn(true);
    }

}
