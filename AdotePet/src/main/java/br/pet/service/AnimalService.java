package br.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.pet.entity.Animal;
import br.pet.repository.AnimalRepository;

@Service
public class AnimalService {
	@Autowired
	private AnimalRepository animalRepository;

	public void save(Animal animal) {
		animalRepository.save(animal);
	}

	public List<Animal> findAll() {
		return animalRepository.findAll();
	}
}
