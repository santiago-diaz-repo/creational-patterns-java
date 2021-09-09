package decorator;

public class BasicWebPage implements WebPage{

    public BasicWebPage(){}

    @Override
    public void display() {
        System.out.println("Display from basic page");
    }

    @Override
    public String close() {
        System.out.println("Close from basic page");
        return "Exit basic";
    }
}
