package com.lzp.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzp.dao.SignMsgDaoImpl;
import com.lzp.entity.User;

public class signMsg {
	
	@Resource
	private SignMsgDaoImpl sm;
	
	public User findByName(String name){
		User per = sm.findByName(name);
		return per;
	}
}
