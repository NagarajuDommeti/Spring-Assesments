package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import beans.Login;
/*
 * Program to demonstrate user login.
 * If user credentials match will show success page.
 * If user credentials does not match show errorpage.
 */

@Controller
public class LoginController {

	@RequestMapping("login")
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "Login";
	}

	// Annotation that binds a method parameter or method return valueto a named
	// model attribute, exposed to a web view
	@RequestMapping(value = "submit", method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("loginBean") Login loginBean) {
		System.out.println("inside submit");

		if (loginBean != null && loginBean.getUserName() != null & loginBean.getPassword() != null) {
			System.out.println("inside if block");
			if (loginBean.getUserName().equals("ojas") && loginBean.getPassword().equals("ojas123")) {
				model.addAttribute("msg", loginBean.getUserName());
				return "success";
			} else {
				System.out.println("inside else block");
				model.addAttribute("error", "Invalid Details");
				return "errorpage";
			} // else block
		} else {
			System.out.println("inside outer else block");
			model.addAttribute("error", "Please enter proper login Details");
			return "errorpage";
		}
	}
}