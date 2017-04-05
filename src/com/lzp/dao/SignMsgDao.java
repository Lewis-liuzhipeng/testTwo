package com.lzp.dao;

import com.lzp.entity.User;

public interface SignMsgDao {
	
	public User findByName(String name);
}
