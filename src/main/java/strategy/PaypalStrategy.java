package strategy;

public class PaypalStrategy implements PaymentStrategy{


    @Override
    public void pay(Double amount) {
        if(signIn("test","test")){
            System.out.println("Signed and paying");
        }else{
            System.out.println("not signed and not pay");
        }
    }

    private boolean signIn(String user, String pass){
        return true;
    }
}
