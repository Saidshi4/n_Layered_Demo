package business.concretes;

import business.abstracts.MailVerification;
import entities.concretes.User;

public class MailVerificationManager implements MailVerification {
    @Override
    public void send(User user) {
        System.out.println("Verification code is sent to " + user.getEmail());
    }

    @Override
    public void verification(User user) {
        System.out.println("User verification mail");
        user.setVerify(true);
    }

}
