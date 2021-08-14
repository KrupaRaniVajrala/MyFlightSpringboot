package com.User.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.entities.UserInfoEntity;
import com.User.repository.UserInfoRepository;

@Service
public class UserInfoService {
	
	@Autowired

	UserInfoRepository repository;
		
	public UserInfoEntity findUserById(long id) {
		System.out.println("Id in service" + id);
		Optional<UserInfoEntity> user = repository.findById(id);
		if (user.isPresent())
			return user.get();

		else
			return null;

	}

	public UserInfoEntity saveUser(UserInfoEntity user) {
		return repository.save(user);
	}

	public UserInfoEntity findUserByName(String name) {
		Optional<UserInfoEntity> user = repository.findByName(name);
		if (user.isPresent())
			return user.get();

		else
			return null;

	}

	public List<UserInfoEntity> findUsers() {
		
		return repository.findAll();
	}

	public void deleteUser(long id) {
		
		repository.deleteById(id);
		
	}


	

}
