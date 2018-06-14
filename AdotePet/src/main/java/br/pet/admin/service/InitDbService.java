package br.pet.admin.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.pet.admin.entity.Role;
import br.pet.admin.entity.User;
import br.pet.admin.repository.RoleRepository;
import br.pet.admin.repository.UserRepository;

//import br.lb.admin.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@PostConstruct
	public void init() {
		if (userRepository.findAll().isEmpty())
			usersTest();
	}

	private void usersTest() {
		Role adminRole;
		adminRole = new Role();
		adminRole.setName("ROLE_ADMIN");
		roleRepository.save(adminRole);

		List<Role> rolesAdmin = new ArrayList<Role>();
		rolesAdmin.add(adminRole);

		User luiz;
		luiz = new User();
		luiz.setName("Luiz Botton");
		luiz.setRoles(rolesAdmin);
		luiz.setEmail("luizbotton@gmail.com");
		luiz.setEnabled(true);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		luiz.setPassword(encoder.encode("lb2002"));
		luiz.setCpf("00484779079");

		userRepository.save(luiz);

		User admin = new User();
		admin.setName("admin");
		admin.setRoles(rolesAdmin);
		admin.setEmail("admin@admin.com.br");
		admin.setEnabled(true);
		encoder = new BCryptPasswordEncoder();
		admin.setPassword(encoder.encode("12345678"));
		admin.setCpf("0123456789");

		userRepository.save(admin);

		User kaique = new User();
		kaique.setName("Kaique");
		kaique.setEmail("kaiquearantes@hotmail.com");
		kaique.setEnabled(true);
		kaique.setRoles(rolesAdmin);
		kaique.setCpf("04015926188");
		encoder = new BCryptPasswordEncoder();
		kaique.setPassword(encoder.encode("080197"));

		userRepository.save(kaique);

	}

}
