package com.example.relationshipdatabase.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class UserContacts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private int phone;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private List<Users> users;

	public Integer getId() {
		return id;
	}

	public UserContacts setId(Integer id) {
		this.id = id;
		return this;
	}

	public int getPhone() {
		return phone;
	}

	public UserContacts setPhone(int phone) {
		this.phone = phone;
		return this;
	}
	
	

	public List<Users> getUsers() {
		return users;
	}

	public UserContacts setUsers(List<Users> users) {
		this.users = users;
		return this;
	}

	@Override
	public String toString() {
		return "UserContacts [id=" + id + ", phone=" + phone + "]";
	}
	
	
}
