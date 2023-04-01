package com.example.deneme.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.example.deneme.dto.UserCreateDTO;
import com.example.deneme.dto.UserUpdateDTO;
import com.example.deneme.dto.UserViewDTO;


public interface UserService {

	UserViewDTO getUserById(Long id);
	
	List<UserViewDTO> getUsers(); 

	UserViewDTO createUser(UserCreateDTO userCreateDTO);

	UserViewDTO updateUser(Long id, UserUpdateDTO userUpdateDTO);

	void deleteUser(Long id);

	List<UserViewDTO> slice(Pageable pageable);

	
}
