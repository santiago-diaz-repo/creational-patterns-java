package state;

public class Finisher implements State{

    private String NAME = "finisher";

    @Override
    public void onBlocked(ControllerState controller) {
        System.out.println("from finisher to blocked");
        controller.setState(new Blocker());
    }

    @Override
    public void onFinished(ControllerState controller) {
        System.out.println("from finisher to blocked");
        if(controller.getState().getNAME() != "blocker")
            throw new RuntimeException("impossible");
        controller.setState(new Finisher());
    }

    @Override
    public void onValidation(ControllerState controller) {
        System.out.println("from finisher to blocked");
        controller.setState(this);
    }

    public String getNAME(){
        return this.NAME;
    }
}
