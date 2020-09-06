package com.example.relationshipdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.relationshipdatabase.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
