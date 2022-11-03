package com.adienerlopez.reservationmanager.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.adienerlopez.reservationmanager.entities.User;
import com.adienerlopez.reservationmanager.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository ur;
	
	public void saveUser(User u) {
		ur.save(u);
	}

	public void addUser(User u) {
		ur.save(u);
	}

	public void deleteUserById(int id) {
		ur.deleteById(id);
	}
	
	public Optional<User> getUserById(int id) {
		return ur.findById(id);
	}
	
	public Iterable<User> getAllUsers(){
		return ur.findAll();
	}
	
	public Iterable<User> getAllAndPaginate(Pageable p){
		return ur.findAll(p);
	}

	public Optional<User> getUserBySurname( String username) {
		return ur.findByUsername( username );
	}

	public Optional<User> getByName(String u){
		return ur.findByUsername(u);
	}

}
