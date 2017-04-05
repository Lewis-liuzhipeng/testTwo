package com.lzp.dao;

import com.lzp.entity.Driver;


public interface DriverLogin {
	
	public String driverLogin(String nameId,String password);
	
	public boolean driverSign(Driver driver);
	
	public boolean updataDriverInfo(Driver driver);
}
