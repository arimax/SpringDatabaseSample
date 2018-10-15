package com.kajishima.repository.idm;

import java.util.List;

import com.kajishima.entity.idm.Session;

public interface IdmSessionRepository {

	public List<Session> selectAll();

}
