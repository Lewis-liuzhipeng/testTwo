package com.lzp.dao;

import org.hibernate.Session;

import com.lzp.entity.Driver;
import com.lzp.util.BaseDataSource;
/**
 * 所有涉及密码信息，均以MD5进行加密
 * @author admin
 *
 */

public class DriverLoginImp extends BaseDataSource<Driver> implements DriverLogin{

	/**
	 * driver登录信息验证
	 */
	@Override
	public String driverLogin(String nameId, String password) {
		Session session = super.sessionFactory.openSession();
		Driver driver = (Driver) session.byId("1");
		System.out.println(driver.toString());
		return null;
	}

	@Override
	public boolean driverSign(Driver driver) {
		
		return false;
	}

	@Override
	public boolean updataDriverInfo(Driver driver) {
		
		return false;
	}

}
