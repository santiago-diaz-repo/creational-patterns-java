package factory;

public class ConcreteFactoryTwo extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductTwo();
    }
}
