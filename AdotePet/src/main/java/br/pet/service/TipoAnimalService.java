package br.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.pet.entity.TipoAnimal;
import br.pet.repository.TipoAnimalRepository;

@Service
public class TipoAnimalService {
	@Autowired
	private TipoAnimalRepository tipoAnimalRepository;

	public void save(TipoAnimal tipoAnimal) {
		tipoAnimalRepository.save(tipoAnimal);
	}

	public List<TipoAnimal> findAll() {
		return tipoAnimalRepository.findAll();
	}

	public TipoAnimal findOne(Integer id) {
		return tipoAnimalRepository.findOne(id);
	}
}
