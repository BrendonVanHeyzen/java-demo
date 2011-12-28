package com.demo.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.demo.application.model.User;

@Controller
@RequestMapping("/user/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String loginForm(ModelMap model) {
        User user = new User();
        model.addAttribute("user",user);
        return "user/login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processForm(@ModelAttribute("user") User User, BindingResult result, SessionStatus status)
    {
        if (User.validateUser()) {
            return "user/success";
        }
        return "user/failure";
    }
}
