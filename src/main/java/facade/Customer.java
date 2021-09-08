package facade;

import java.math.BigDecimal;

public class Customer {

    public void doStuff(){
        BankServiceFacade bankServiceFacade = new BankServiceFacade();
        bankServiceFacade.createAccount("saving",new BigDecimal(46456.1));
        bankServiceFacade.createAccount("saving",new BigDecimal(0.0));
    }
}
