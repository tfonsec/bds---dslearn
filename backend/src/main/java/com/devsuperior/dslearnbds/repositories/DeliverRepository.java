package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.entities.Deliver;

@Repository
public interface DeliverRepository extends JpaRepository<Deliver, Long>{

}
