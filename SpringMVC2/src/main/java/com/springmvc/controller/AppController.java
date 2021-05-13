package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.AppModel;

@Controller
public class AppController {
	
		@RequestMapping("/bookingForm")
		public String bookingForm(Model model) {
			AppModel res = new AppModel();
			model.addAttribute("reservation", res);
			return "reservation-page";
		}

		@RequestMapping("/submitForm")
		public String submitForm(@ModelAttribute("reservation") AppModel res) {
			return "conformation-page";
		}

}
