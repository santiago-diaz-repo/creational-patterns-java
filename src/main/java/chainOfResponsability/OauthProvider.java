package chainOfResponsability;

public class OauthProvider implements IProvider{

    @Override
    public boolean authorize() {
        System.out.println("Authorizing with oauth");
        return true;
    }
}
