package DataModel;

/**
 * Created by kwitkowski on 2017-04-06.
 */
public class User {
    private String Login;
    private String Password;
    private String FirstName;
    private String LastName;
    private boolean Ghost;

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public boolean isGhost() {
        return Ghost;
    }

    public void setGhost(boolean ghost) {
        Ghost = ghost;
    }
}
