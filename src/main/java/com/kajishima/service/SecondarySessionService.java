package com.kajishima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kajishima.entity.secondary.Session;
import com.kajishima.repository.secondary.SecondarySessionRepository;

@Service
public class SecondarySessionService {

	@Autowired
	private SecondarySessionRepository sessionRepository;

	public List<Session> list() {
		return sessionRepository.selectAll();
	}

}
