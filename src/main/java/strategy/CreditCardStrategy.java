package strategy;

public class CreditCardStrategy implements PaymentStrategy{

    @Override
    public void pay(Double amount) {
        getCreditCardInfo();
        System.out.println("paying with credit card");
    }

    private void getCreditCardInfo(){
        System.out.println("Give me information about your card");
    }
}
