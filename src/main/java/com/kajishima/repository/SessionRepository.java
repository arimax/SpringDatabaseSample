package com.kajishima.repository;

import java.util.List;

import com.kajishima.entity.Session;

public interface SessionRepository {

	public List<Session> selectAll();

}
