package com.example.relationshipdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.relationshipdatabase.model.UserContacts;

public interface UserContactRepository extends JpaRepository<UserContacts, Integer> {

}
