package decorator;

public class AuthorizedWebPage extends WebPageDecorator{

    public AuthorizedWebPage(WebPage webPage) {
        super(webPage);
    }

    @Override
    public void display() {
        super.display();
        authorize();
    }

    @Override
    public String close() {
        return super.close();
    }

    public void authorize(){
        System.out.println("Authorizing....");
    }
}
