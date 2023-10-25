package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserdaoM implements UserDao {

    @Override
    public void save(User user) {
        System.out.println(user.getFirstname() + " saved");
    }
}
