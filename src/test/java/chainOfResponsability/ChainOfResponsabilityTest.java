package chainOfResponsability;

import org.junit.jupiter.api.Test;

public class ChainOfResponsabilityTest {

    @Test
    public void testSecurityProcessor(){
        SecurityProcessor subject = new UserNameProcessor(new OauthProcessor());
        IProvider provider = new OauthProvider();
        subject.validate(provider);
    }
}
