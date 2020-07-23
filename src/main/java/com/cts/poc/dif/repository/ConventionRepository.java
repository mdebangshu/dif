package com.cts.poc.dif.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.poc.dif.entity.ConventionEntity;

public interface ConventionRepository extends JpaRepository<ConventionEntity, Integer> {

}
