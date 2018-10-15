package com.kajishima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kajishima.entity.idm.User;
import com.kajishima.repository.idm.UserRepository;

@Service
public class IdmUserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> list() {
		return userRepository.selectAll();
	}

}
