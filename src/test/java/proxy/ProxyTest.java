package proxy;

import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    public void testProxy(){
        Client client = new Client();
        client.executeOrder();
    }
}
