package com.lzp.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzp.dao.DriverLogin;

@Service
public class DriverToLoginImpl implements DriverToLogin{
	
	@Resource
	DriverLogin driver;
	
	@Override
	public String driverLogin(String nameId, String password) {
		String msg = driver.driverLogin(nameId, password);
		return null;
	}

}
