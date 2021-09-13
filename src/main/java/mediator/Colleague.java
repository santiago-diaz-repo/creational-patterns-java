package mediator;

public abstract class Colleague {
    protected Mediator mediator;
    private boolean isOn;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        this.isOn = false;
    }

    public abstract void executeAction();

    public boolean isOn(){
        return this.isOn;
    }

    public void setOn(boolean setOn){
        this.isOn = setOn;
    }

    public abstract void turnOn();

    public abstract void turnOff();
}
