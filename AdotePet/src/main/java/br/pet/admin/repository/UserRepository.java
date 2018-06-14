package br.pet.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.pet.admin.entity.Role;
import br.pet.admin.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByRoles(Role role);

	User findByName(String name);

	User findByCpf(String cpf);

	User findByCpfAndPassword(String cpf, String password);

}
