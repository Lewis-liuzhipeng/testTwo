package com.lzp.util;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class BaseDataSource {
	
	@Resource
	DataSource dataSource;
}
