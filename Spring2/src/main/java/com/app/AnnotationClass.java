package com.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnnotationClass {
	    @RequestMapping("/File1")
	    public String doProcess(@RequestParam("name") String name,
	                             @RequestParam("pass") String  pass) {
	        
	        if(name.equals("Nagaraju") && pass.equals("dhoni")) {
	            return "File2";
	        }
	        
	        else {
	            return "File1";
	        }
	        
	        
	    }

}
