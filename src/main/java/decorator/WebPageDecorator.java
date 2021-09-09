package decorator;

public abstract class WebPageDecorator implements WebPage {
    private WebPage wrappee;

    public WebPageDecorator(WebPage wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void display() {
        this.wrappee.display();
    }

    @Override
    public String close() {
        return this.wrappee.close();
    }
}
