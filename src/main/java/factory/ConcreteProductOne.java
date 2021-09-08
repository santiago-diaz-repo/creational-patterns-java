package factory;

public class ConcreteProductOne implements Product {

    @Override
    public void executeStuffProduct() {
        System.out.println("Invoking ConcreteProductOne's executeStuffProduct method");
    }
}
