package br.pet.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.pet.entity.Animal;
import br.pet.service.AnimalService;
import br.pet.service.TipoAnimalService;

@Controller
public class AnimalController {
	@Autowired
	private AnimalService animalService;

	@Autowired
	private TipoAnimalService tipoAnimalService;

	@RequestMapping(value = "animais", method = RequestMethod.GET)
	public String showAnimais(Model model, Principal principal) {

		model.addAttribute("animais", animalService.findAll());

		return "animais";
	}

	@RequestMapping(value = "animal-register", method = RequestMethod.GET)
	public String showRegister(Model model, Principal principal) {
		if (principal == null)
			return "redirect:/login.html?authenticate=false";
		model.addAttribute("tiposAnimais", tipoAnimalService.findAll());
		model.addAttribute("animal", new Animal());

		return "animal-register";
	}

	@RequestMapping(value = "animal-register", method = RequestMethod.POST)
	public String doRegister(Model model, Principal principal, @ModelAttribute("animal") Animal animal,
			@RequestParam Integer idTipo) {
		if (principal == null)
			return "redirect:/login.html?authenticate=false";
		animal.setTipoAnimal(tipoAnimalService.findOne(idTipo));
		animalService.save(animal);

		return "redirect:/animais.html";
	}

}
