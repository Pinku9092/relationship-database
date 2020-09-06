package com.example.relationshipdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.relationshipdatabase.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
