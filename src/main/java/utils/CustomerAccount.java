package utils;

import lombok.Getter;

@Getter
public enum CustomerAccount {
    EXISTING_Customer("jide.opa@outlook.com","BqAxTQ#KJu3Xg_d");

    private String emailAddress;
    private String password;

    CustomerAccount(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }
}
