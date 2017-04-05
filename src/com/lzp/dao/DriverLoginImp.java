package com.lzp.dao;

import com.lzp.entity.Driver;
import com.lzp.util.BaseDataSource;
/**
 * 所有涉及密码信息，均以MD5进行加密
 * @author admin
 *
 */

public class DriverLoginImp extends BaseDataSource implements DriverLogin{

	/**
	 * driver登录信息验证
	 */
	@Override
	public String driverLogin(String nameId, String password) {
		
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
