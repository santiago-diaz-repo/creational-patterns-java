package factory;

public class ConcreteFactoryOne extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductOne();
    }
}
