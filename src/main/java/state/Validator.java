package state;

public class Validator implements State{

    private String NAME = "validator";

    @Override
    public void onBlocked(ControllerState controller) {
        System.out.println("from validator to blocked");
        if(controller.getState().getNAME() != "validator")
            throw new RuntimeException("impossible");
        controller.setState(new Blocker());
    }

    @Override
    public void onFinished(ControllerState controller) {
        System.out.println("from validator to finished");
        controller.setState(new Finisher());
    }

    @Override
    public void onValidation(ControllerState controller) {
        System.out.println("from validator to validation");
        throw new RuntimeException("impossible");
    }

    public String getNAME(){
        return this.NAME;
    }
}
