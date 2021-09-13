package chainOfResponsability;

public class OauthProcessor extends SecurityProcessor{

    public OauthProcessor() {
        super();
    }

    public OauthProcessor(SecurityProcessor next) {
        super(next);
    }

    @Override
    public boolean isAuthorized(IProvider provider) {
        System.out.println("Here is Oauth");
        if(provider instanceof OauthProvider)
            return provider.authorize();
        return false;
    }
}
