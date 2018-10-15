package com.kajishima.entity.idm;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{
	private Integer userId;
	private String userName;
}
