package template;

public class Facebook extends SocialMedia{

    public Facebook(String username, String password){
        this.username=username;
        this.password=password;
    }

    @Override
    public boolean login(String username, String password) {
        System.out.println("Logging from facebook");
        return true;
    }

    @Override
    public void logout() {
        System.out.println("Logging out from facebook");
    }
}
