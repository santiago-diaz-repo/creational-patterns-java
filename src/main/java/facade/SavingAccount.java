package facade;

import java.math.BigDecimal;

public class SavingAccount implements IAccount{

    private BigDecimal amount;
    private Integer number;

    public SavingAccount(BigDecimal amount){
        this.amount = amount;
        this.number = 134235;
    }

    @Override
    public void transfer(BigDecimal amount, IAccount toAccount) {
        System.out.println("Depositing: "+ amount);
    }

    @Override
    public Integer getNumber(){
        return this.number;
    }
}
