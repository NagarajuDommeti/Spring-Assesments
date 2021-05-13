package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.beans.User;

@Controller
public class LoginController {
	@RequestMapping("/Login")
	String displayPage() {
		System.out.println("inside login controller");
		return "Login";
		
	}
	@RequestMapping("/Registration")
	String displayRegistration() {
		
		return "Registration";
		
	}
	@RequestMapping(method=RequestMethod.POST)
    String displayUserDetails(Model m,@ModelAttribute("user") User userb,@RequestParam("uname") String uname, @RequestParam("password") String password) {
        userb.setUname(uname);
        userb.setPwd(password);
        System.out.println("user"+userb.getUname());
        m.addAttribute("username",userb.getPwd());
        
        return "RegistrationDetails";
	}
}
