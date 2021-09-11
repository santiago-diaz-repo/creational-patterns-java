package template;

public class Twitter extends SocialMedia{

    public Twitter(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        System.out.println("Logging from twitter");
        return false;
    }

    @Override
    public void logout() {
        System.out.println("Logging out from twitter");
    }
}
