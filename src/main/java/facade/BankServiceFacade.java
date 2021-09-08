package facade;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BankServiceFacade {

    private Map<Integer,IAccount> accountHashmap;

    public BankServiceFacade(){
        this.accountHashmap = new HashMap<>();
    }

    public Integer createAccount(String type, BigDecimal initialAmount){
        IAccount account = null;
        switch (type){
            case "saving": 
                account = new SavingAccount(initialAmount);
                break;
            default: 
                System.out.println("Bye");
                break;
        }
        
        return account.getNumber();
    }

    public void transfer(IAccount fromAccount, IAccount toAccount, BigDecimal amount){
        IAccount from = this.accountHashmap.get(fromAccount);
        IAccount to= this.accountHashmap.get(toAccount);
        from.transfer(amount, to);
    }
}
