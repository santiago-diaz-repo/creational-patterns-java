package factory;

public abstract class Factory {

    public void doStuff(){
        Product product = createProduct();
        product.executeStuffProduct();
    }

    public abstract Product createProduct();
}
