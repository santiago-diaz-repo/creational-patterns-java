package state;

public class ControllerState {
    private State state;

    public ControllerState(){
        this.state = new Validator();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState(){
        double a =4.655;
        int b = (int)a;
        return this.state;
    }
}
