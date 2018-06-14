package br.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.pet.entity.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
