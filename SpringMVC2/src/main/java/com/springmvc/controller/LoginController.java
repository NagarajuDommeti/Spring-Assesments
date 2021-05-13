package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.Login;

@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	public String init(Model model) {
		model.addAttribute("msg", "Please enter ur login details");
		return "login";
	}

	@RequestMapping(value = "/")
	public String submit(Model model, @ModelAttribute("LoginBean") Login loginBean) {
		if (loginBean != null && loginBean.getUserName() != null && loginBean.getPassword() != null) {
			if (loginBean.getUserName().equals("nagaraju") && loginBean.getPassword().equals("ojas")) {
				model.addAttribute("msg", loginBean.getUserName());
				return "success";
			} else {
				model.addAttribute("error", "Invalid details");
				return "login";
			}
		} else {
			model.addAttribute("error", "Enter details");
			return "login";
		}
	}

}
