package facade;

import java.math.BigDecimal;

public interface IAccount {

    public void transfer(BigDecimal amount,IAccount toAccount);
    public Integer getNumber();
}
