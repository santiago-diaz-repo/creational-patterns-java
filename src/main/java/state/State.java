package state;

public interface State {
    public void onBlocked(ControllerState pkg);
    public void onFinished(ControllerState pkg);
    public void onValidation(ControllerState pkg);
    public String getNAME();
}