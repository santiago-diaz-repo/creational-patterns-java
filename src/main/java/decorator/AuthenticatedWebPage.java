package decorator;

public class AuthenticatedWebPage extends WebPageDecorator{

    public AuthenticatedWebPage(WebPage webPage) {
        super(webPage);
    }

    @Override
    public void display(){
        super.display();
        authenticated();
    }

    @Override
    public String close(){
        return super.close();
    }

    public void authenticated(){
        System.out.println("Authenticating...");
    }
}
