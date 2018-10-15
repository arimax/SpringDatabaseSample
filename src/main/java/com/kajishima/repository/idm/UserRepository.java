package com.kajishima.repository.idm;

import java.util.List;

import com.kajishima.entity.idm.User;

public interface UserRepository {

	public List<User> selectAll();

}
