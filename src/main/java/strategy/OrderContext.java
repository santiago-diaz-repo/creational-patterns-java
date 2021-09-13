package strategy;

public class OrderContext {

    private boolean isClosed;

    public OrderContext() {
        this.isClosed = false;
    }

    public void processOrder(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(423432.5);
        this.isClosed = true;
    }
}
