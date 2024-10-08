package saps.banking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Integration completed";
	}
	

    @GetMapping("/home")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String home() {
        return "home";
    }
}
