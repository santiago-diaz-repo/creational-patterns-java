package mediator;

public class MediatorImpl implements Mediator{
    private Colleague button;
    private Colleague fan;

    public MediatorImpl() {
    }

    @Override
    public void press() {
        if(this.fan.isOn())
            this.fan.turnOn();
        else
            this.fan.turnOff();
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    public void setButton(Colleague button) {
        this.button = button;
    }

    public void setFan(Colleague fan) {
        this.fan = fan;
    }
}
