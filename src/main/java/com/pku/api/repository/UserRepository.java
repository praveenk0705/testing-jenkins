package com.pku.api.repository;

import java.util.List;
import java.util.Optional;

import com.pku.api.entity.User;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User, String> {

	public List<User> findAll();

	public Optional<User> findById(String id);


	public Optional<User> findByEmail(String email);

	public User save(User user); //update and insert

	public void delete(User user);
}
