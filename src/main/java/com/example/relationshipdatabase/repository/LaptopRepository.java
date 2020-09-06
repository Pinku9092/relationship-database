package com.example.relationshipdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.relationshipdatabase.model.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer>{

}
