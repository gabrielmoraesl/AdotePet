package br.pet.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.pet.entity.TipoAnimal;
import br.pet.service.TipoAnimalService;

@Controller
public class TipoAnimalController {

	@Autowired
	private TipoAnimalService tipoAnimalService;

	@RequestMapping(value = "tipos-animais", method = RequestMethod.GET)
	public String showTiposAnimais(Model model, Principal principal) {

		model.addAttribute("tiposAnimais", tipoAnimalService.findAll());

		return "tipos-animais";
	}

	@RequestMapping(value = "tipo-animal-register", method = RequestMethod.GET)
	public String showRegister(Model model, Principal principal) {
		if (principal == null)
			return "redirect:/login.html?authenticate=false";
		model.addAttribute("tipoAnimal", new TipoAnimal());

		return "tipo-animal-register";
	}

	@RequestMapping(value = "tipo-animal-register", method = RequestMethod.POST)
	public String doRegister(Model model, Principal principal, @ModelAttribute("tipoAnimal") TipoAnimal tipoAnimal) {
		if (principal == null)
			return "redirect:/login.html?authenticate=false";
		tipoAnimalService.save(tipoAnimal);

		return "redirect:/tipos-animais.html";
	}
}
