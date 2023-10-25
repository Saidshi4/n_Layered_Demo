package business.abstracts;

import entities.concretes.User;

public interface CheckUserService {
    boolean checkPassword(User user);
    boolean checkEmail(User user);
    boolean checkIsSignUp(User user);
}

