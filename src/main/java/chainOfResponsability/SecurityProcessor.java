package chainOfResponsability;

public abstract class SecurityProcessor {
    private SecurityProcessor next;

    public SecurityProcessor(){
        this.next = null;
    }

    public SecurityProcessor(SecurityProcessor next) {
        this.next = next;
    }

    public abstract boolean isAuthorized(IProvider provider);

    public boolean validate(IProvider provider){
        SecurityProcessor tmp = this;
        while (tmp != null){
             if(tmp.isAuthorized(provider))
                 return true;
             else
                 tmp = tmp.next;
        }
        return false;
    }
}
