package template;

public abstract class SocialMedia {

    protected String username;
    protected String password;

    public SocialMedia(){}

    public final void post(String message){
        if(login(this.username,this.password)){
            System.out.println("Posting something: " + message);
            logout();
        }else {
            System.out.println("Bye");
        }
    }

    public abstract boolean login(String username, String password);
    public abstract void logout();
}
