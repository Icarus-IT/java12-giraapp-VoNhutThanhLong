package cybersoft.javabackend.java12.gira.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/welcome")
@RestController
public class WelcomeController {
	
	@GetMapping("")
	public Object welcome() {
		return "welcome to Gira Application";
	}
	
}
