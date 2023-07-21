package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.model.Dogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogsRepository extends JpaRepository<Dog, Long>{

}