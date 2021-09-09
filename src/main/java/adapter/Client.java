package adapter;

public class Client {

    public static void main(String[] args){
        CoffeeMachineInterface machine = new CoffeeTouchscreenAdapter(false);
        machine.chooseFirstSelection();
    }
}
