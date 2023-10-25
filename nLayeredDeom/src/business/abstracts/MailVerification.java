package business.abstracts;

import entities.concretes.User;

public interface MailVerification {
    void send(User user);
    void verification(User user);
}
