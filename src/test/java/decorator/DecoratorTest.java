package decorator;

import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void testDecorator(){
        WebPage webPage = new BasicWebPage();
        webPage = new AuthenticatedWebPage(webPage);
        webPage = new AuthorizedWebPage(webPage);
        webPage.display();
    }
}
