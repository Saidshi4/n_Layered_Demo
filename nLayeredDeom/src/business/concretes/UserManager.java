package business.concretes;

import business.abstracts.CheckUserService;
import business.abstracts.MailVerification;
import business.abstracts.UserService;
import dataAccess.concretes.UserdaoM;
import entities.concretes.User;

public class UserManager implements UserService {
    private final CheckUserService checkUserService;
    private final UserdaoM userdaoM;
    private final MailVerification mailVerification;
    public UserManager(CheckUserService checkUserService, UserdaoM userdaoM, MailVerification mailVerification){
        this.checkUserService = checkUserService;
        this.userdaoM = userdaoM;
        this.mailVerification = mailVerification;
    }
    @Override
    public void add(User user) {
        boolean checked = true;
        if(!checkUserService.checkPassword(user)){
            System.out.println("Password is shorter than 6!!");
            checked = false;
        }
        if(!checkUserService.checkEmail(user)){
            System.out.println("Email is not correct format!!");
            checked = false;
        }
        if(checkUserService.checkIsSignUp(user)){
            System.out.println("User already has sign up");
            checked = false;
        }

        if(checked){
            userdaoM.save(user);
            mailVerification.send(user);
        }
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void singIn(User user) {

    }
}
