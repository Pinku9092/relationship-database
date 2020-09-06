package com.example.relationshipdatabase.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.relationshipdatabase.exception.NoDataFoundException;
import com.example.relationshipdatabase.model.Address;
import com.example.relationshipdatabase.model.Laptop;
import com.example.relationshipdatabase.model.Person;
import com.example.relationshipdatabase.model.Student;
import com.example.relationshipdatabase.model.UserContacts;
import com.example.relationshipdatabase.model.Users;
import com.example.relationshipdatabase.repository.LaptopRepository;
import com.example.relationshipdatabase.repository.PersonRepository;
import com.example.relationshipdatabase.repository.StudentRepository;
import com.example.relationshipdatabase.repository.UserContactRepository;
import com.example.relationshipdatabase.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserContactRepository userContactRepository;
	
	@Autowired
	PersonRepository personRepository;
	@Autowired
	LaptopRepository laptopRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@GetMapping("/show")
	public String getUser() {
		
		
		laptopRepository.findById(1)
		.orElseThrow(()-> new NoDataFoundException("Pinku"));
		
		Users users = new Users();
		users.setName(bCryptPasswordEncoder.encode("pinku"));
		users.setAge(29);
		List<Users> userList = new ArrayList<Users>();
		userList.add(users);
		UserContacts userContact = new UserContacts();
		userContact.setPhone(999999)
		.setUsers(userList);
		userContactRepository.save(userContact);
		
		
		
		
		Laptop laptop = new Laptop();
		laptop.setName("HP");
		
		Student student = new Student();
		student.setName("ujjwal");
		student.setLaptop(laptop);
		studentRepository.save(student);
		return "added";
	}
	
	@GetMapping("/getProp")
	public String getMultipleProperty() {
		Address address = new Address();
		address.setHouseNo(1111);
		address.setPinCode(123456);
		address.setCity("Rajpura");
		Person person = new Person();
		person.setName("Pinku");
		person.setAddress(address);
		personRepository.save(person);
		return "prop";
	}
}
