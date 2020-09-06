package com.example.relationshipdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.relationshipdatabase.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
