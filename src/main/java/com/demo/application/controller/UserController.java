package com.demo.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.demo.application.model.User;

@Controller
@RequestMapping("/user/signup")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public String signup(ModelMap model) {
        User user = new User();
        model.addAttribute(user);
        return "user/signup";
    }
}
