package br.pet.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pet.admin.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String name);

}
