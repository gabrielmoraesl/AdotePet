package br.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.pet.entity.TipoAnimal;

@Repository
public interface TipoAnimalRepository extends JpaRepository<TipoAnimal, Integer> {

}
