package com.lzp.dao;

import com.lzp.entity.Person;

public interface SignMsgDao {
	
	public Person findByName(String name);
}
