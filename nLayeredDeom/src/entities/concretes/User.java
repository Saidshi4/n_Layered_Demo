package entities.concretes;

public class User {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private boolean isSignUp;
    private boolean isVerify;
    public User() {
    }

    public User(int id, String firstname, String lastname, String email, String password, boolean isSignUp, boolean isVerify) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.isSignUp = isSignUp;
        this.isVerify = isVerify;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSignUp() {
        return isSignUp;
    }

    public void setSignUp(boolean signUp) {
        isSignUp = signUp;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean verify) {
        isVerify = verify;
    }
}
