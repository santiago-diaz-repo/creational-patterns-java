package adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private boolean oldVendingMachine;

    public CoffeeTouchscreenAdapter(boolean oldVendingMachine){
        this.oldVendingMachine = oldVendingMachine;
    }

    @Override
    public void chooseFirstSelection() {
        OldCoffeeMachine machine = new OldCoffeeMachine();
        machine.selectA("A");
    }

    @Override
    public void chooseSecondSelection() {
        OldCoffeeMachine machine = new OldCoffeeMachine();
        machine.selectB("B");
    }
}
