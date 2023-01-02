package io.aki.todowebapp.services;

import org.springframework.context.annotation.Bean;
@Bean
public class AuthenticationService {
    public AuthenticationService authenticationService() {
        AuthenticationService authenticationService =new AuthenticationService();
        return authenticationService;
    }

    private boolean authenticate(String user, String password){
        boolean isValidUserName = user.equals("aki");
        boolean isValidPassword = password.equals("manage");

        return isValidUserName && isValidPassword;
    }
}
