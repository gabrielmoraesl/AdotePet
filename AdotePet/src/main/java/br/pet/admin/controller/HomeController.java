package br.pet.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.pet.admin.entity.AppConfiguration;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("appName", AppConfiguration.getAppName());
		model.addAttribute("appIntro", AppConfiguration.getAppIntro());
		model.addAttribute("appIntroTitle1", AppConfiguration.getAppintrotitle1());
		model.addAttribute("appIntroDesc1", AppConfiguration.getAppintrodesc1());
		model.addAttribute("appIntroTitle2", AppConfiguration.getAppintrotitle2());
		model.addAttribute("appIntroDesc2", AppConfiguration.getAppintrodesc2());
		model.addAttribute("appIntroTitle3", AppConfiguration.getAppintrotitle3());
		model.addAttribute("appIntroDesc3", AppConfiguration.getAppintrodesc3());
		model.addAttribute("appIntroTitle4", AppConfiguration.getAppintrotitle4());
		model.addAttribute("appIntroDesc4", AppConfiguration.getAppintrodesc4());
		return "home";
	}

}
