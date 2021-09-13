package chainOfResponsability;

public class UserNameProvider implements IProvider{
    @Override
    public boolean authorize() {
        System.out.println("Authorizing with username");
        return false;
    }
}
