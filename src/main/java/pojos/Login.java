package pojos;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import utils.CustomerAccount;
@Log4j2
@Getter
public class Login {
    String emailAddress;
    String password;

    public Login(String scenario){

        switch (scenario){

            case "valid credential":
                this.emailAddress= CustomerAccount.EXISTING_Customer.getEmailAddress();
                this.password = CustomerAccount.EXISTING_Customer.getPassword();
                break;
            case "invalid credential":
                this.emailAddress = CustomerAccount.EXISTING_Customer.getEmailAddress();
                this.password ="2331";
                break;
            default:
                throw new RuntimeException("Incorrect scenario! Pass valid data");
        }

    }
}
