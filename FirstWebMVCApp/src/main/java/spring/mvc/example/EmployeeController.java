package spring.mvc.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EmployeeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/emp-home")
	public String redirectToEmpHome() {
		return "emp-home";
	}
	
}
 