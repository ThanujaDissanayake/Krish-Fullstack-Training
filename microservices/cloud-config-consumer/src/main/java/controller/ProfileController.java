package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.MemberProfileConfiguration;

@RestController
public class ProfileController {
	
	@Autowired
	MemberProfileConfiguration memberProfileConfiguration;
	
	@RequestMapping("/profile")
//	public MemberProfileConfiguration getConfig() {
//		return memberProfileConfiguration;
//	}
	public String getConfig(Model model) {
		model.addAttribute("mode", memberProfileConfiguration.getDefaultMode());
		model.addAttribute("min", memberProfileConfiguration.getMinRentPerio());
		return "mprofile";
	}

}
