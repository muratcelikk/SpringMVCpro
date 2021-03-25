package com.muratcelik.pro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignUpController {

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
  //  @GetMapping({"/abc","/signup" })
    public String getSignUpForm() {
        return "signUpForm";
    }
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String save() {
        return "result";
    }
}
