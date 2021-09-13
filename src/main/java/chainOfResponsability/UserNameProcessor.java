package chainOfResponsability;

public class UserNameProcessor extends SecurityProcessor{

    public UserNameProcessor() {
        super();
    }

    public UserNameProcessor(SecurityProcessor next) {
        super(next);
    }

    @Override
    public boolean isAuthorized(IProvider provider) {
        System.out.println("Here is UserName");
        if(provider instanceof UserNameProvider)
            return provider.authorize();
        return false;
    }
}
