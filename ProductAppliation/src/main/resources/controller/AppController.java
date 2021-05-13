package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.beans.Login;

/*Program to validate user Login details.
 * Values are directly hardcoded.
 * Using "@RequestParam" read values from view and compare in controller.
 * * 
 */
@Controller
public class LoginController {
	@RequestMapping("success")
	public String submit(Model m, @ModelAttribute("login") Login loginBean) {
		return "success";
	}

	// Annotation that binds a method parameter or method return valueto a named
	// model attribute, exposed to a web view
	@RequestMapping(value = "submit", method = RequestMethod.POST)
	public String submit(Model model, @RequestParam("userName") String uname, @RequestParam("password") String pwd) {
		System.out.println("inside submit");
		if (uname.equalsIgnoreCase("ojas") && pwd.equalsIgnoreCase(("ojas123"))) {
			model.addAttribute("msg", uname + "logged in successfully");
			return "success";
		} else {
			System.out.println("inside else block");
			model.addAttribute("error", "Invalid Credentials Details");
			return "errorpage";
		} // else block
	}

}