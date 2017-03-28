package com.lzp.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzp.dao.SignMsgDaoImpl;
import com.lzp.entity.Person;

public class signMsg {
	
	@Resource
	private SignMsgDaoImpl sm;
	
	public Person findByName(String name){
		Person per = sm.findByName(name);
		return per;
	}
}
