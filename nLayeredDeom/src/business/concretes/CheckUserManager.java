package business.concretes;

import business.abstracts.CheckUserService;
import entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUserManager implements CheckUserService {
    @Override
    public boolean checkPassword(User user) {
        return user.getPassword().length() > 6;
    }

    @Override
    public boolean checkEmail(User user) {
        Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
        Matcher m = p.matcher("foobar@gmail.com");
        return m.find();
    }

    @Override
    public boolean checkIsSignUp(User user) {
        return user.isSignUp();
    }
}
