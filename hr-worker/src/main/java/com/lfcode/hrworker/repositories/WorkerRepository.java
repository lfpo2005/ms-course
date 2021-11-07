package com.lfcode.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lfcode.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

	
}
