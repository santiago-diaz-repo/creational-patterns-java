package state;

public class Blocker implements State{

    private String NAME = "blocker";

    @Override
    public void onBlocked(ControllerState controller) {
        System.out.println("from blocker to blocked");
        throw new RuntimeException("impossible");
    }

    @Override
    public void onFinished(ControllerState controller) {
        System.out.println("from blocker to blocked");
        controller.setState(this);
    }

    @Override
    public void onValidation(ControllerState controller) {
        System.out.println("from blocker to blocked");
        controller.setState(this);
    }

    public String getNAME(){
        return this.NAME;
    }
}
