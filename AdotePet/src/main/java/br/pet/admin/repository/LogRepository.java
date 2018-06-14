package br.pet.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pet.admin.entity.LogEntry;

public interface LogRepository extends JpaRepository<LogEntry, Integer> {

}