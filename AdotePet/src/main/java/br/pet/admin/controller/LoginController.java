package br.pet.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.pet.admin.entity.AppConfiguration;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("appName", AppConfiguration.getAppName());
		return "login";
	}

	@RequestMapping("/login-mobile")
	public String loginMobile(Model model) {
		model.addAttribute("appName", AppConfiguration.getAppName());
		model.addAttribute("isMobile", true);
		return "login";
	}

	@RequestMapping("/error-400")
	public String error400() {
		return "error-400";
	}

	@RequestMapping("/error-403")
	public String error403() {
		return "error-403";
	}

	@RequestMapping("/error-404")
	public String error404() {
		return "error-404";
	}

}
