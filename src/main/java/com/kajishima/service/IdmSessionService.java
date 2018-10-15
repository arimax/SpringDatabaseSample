package com.kajishima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kajishima.entity.idm.Session;
import com.kajishima.repository.idm.IdmSessionRepository;

@Service
public class IdmSessionService {

	@Autowired
	private IdmSessionRepository sessionRepository;

	public List<Session> list() {
		return sessionRepository.selectAll();
	}

}
