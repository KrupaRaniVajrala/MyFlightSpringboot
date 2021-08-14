package com.example.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.entity.UserInfoEntity;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	String url="http://localhost:8989/api/v3/userbyname";
	@Autowired
	private PasswordEncoder bcryptEncoder;
	public UserInfoEntity user;
	
	public RestTemplate rest_template = new RestTemplate();
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		UserInfoEntity userobj = rest_template.getForObject(url+"/"+username,UserInfoEntity.class);
		System.out.println(userobj);
		if (userobj==null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	
		return new org.springframework.security.core.userdetails.User(userobj.getName(), bcryptEncoder.encode(userobj.getPassword()),
				new ArrayList<>());
	}
}