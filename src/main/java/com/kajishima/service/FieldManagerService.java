package com.kajishima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kajishima.entity.Field;
import com.kajishima.repository.FieldRepository;

@Service
public class FieldManagerService {

	@Autowired
	private FieldRepository fieldRepository;


	public List<Field> fieldList() {

		return fieldRepository.selectAll();
	}

}
