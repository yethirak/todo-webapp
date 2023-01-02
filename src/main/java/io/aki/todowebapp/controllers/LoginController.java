package io.aki.todowebapp.controllers;

import io.aki.todowebapp.services.AuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("login")
    public String gotoLoginPage(){
        return "Login";
    }
    @PostMapping("login")
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
        model.addAttribute("name",name);
        model.addAttribute("password",password);

        if (name=="aki" && )
        return "Welcome";
    }
}
