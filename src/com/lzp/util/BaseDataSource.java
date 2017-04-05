package com.lzp.util;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;


public class BaseDataSource<T> {
	
	@Resource(name="sessionFactory")
	public SessionFactory sessionFactory;
	
	/**
	 * 根据用户名查询对象
	 * @param nameId
	 * @return
	 */
	public T findByNameId(String nameId){
		
		return null;
	}
	/**
	 * 根据id查询对象
	 * @param id
	 * @return
	 */
	public T findById(String id){
		return null;
	}
	
	/**
	 * 向数据库中插入对象
	 * @param t
	 */
	public void insertInto(T t){
		
	}
	
	
	
}
