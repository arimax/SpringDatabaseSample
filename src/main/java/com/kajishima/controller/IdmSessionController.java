package com.kajishima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kajishima.entity.idm.Session;
import com.kajishima.repository.idm.IdmSessionRepository;

@RestController
public class IdmSessionController {

	@Autowired
	private IdmSessionRepository sessionRepository;

	@RequestMapping(value="/idm/session",method=RequestMethod.GET)
	public List<Session> list() {

		return sessionRepository.selectAll();
	}

}
