package strategy;

import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void testStrategy(){
        System.out.println("I want paying by paypal");
        OrderContext order1 = new OrderContext();
        PaymentStrategy paypal = new PaypalStrategy();
        order1.processOrder(paypal);

        System.out.println("I want paying by credit card");
        OrderContext order2 = new OrderContext();
        PaymentStrategy creditCard = new CreditCardStrategy();
        order2.processOrder(creditCard);


    }
}
