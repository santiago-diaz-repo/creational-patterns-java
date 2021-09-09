package proxy;

public class Client {

    public void executeOrder(){
        Order order = new Order("something","somethingElse");
        IOrder proxy = new OrderFulfillment();
        proxy.fulfillOrder(order);
    }
}
