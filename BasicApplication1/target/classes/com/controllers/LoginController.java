import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LoginController {

	@RequestMapping(value = "login")
	  public String init(Model model) {
		System.out.println("inside login");
	  //  model.addAttribute("msg", "Please Enter Your Login Details");
	    return "Login";
	  }
	@RequestMapping(value = "success")
	  public String initsuccess(Model model) {
	  //  model.addAttribute("msg", "Please Enter Your Login Details");
	    return "success";
	  }
	@RequestMapping(value = "welcome")
	  public String initwelcome(Model model) {
	  //  model.addAttribute("msg", "Please Enter Your Login Details");
	    return "welcome";
	  }

}
