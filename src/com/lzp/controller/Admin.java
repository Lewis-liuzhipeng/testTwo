package com.lzp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

@Controller
public class Admin {
	
	/**
	 * 管理员查询所有用户，可选看是否在线，用户按照user和driver分类显示
	 * @param request
	 * @param response
	 */
	
	public void findAll(HttpServletRequest request,HttpServletResponse response){
		
	}
	
	/**
	 * 管理员查看各个节点的进度
	 * @param request
	 * @param response
	 */
	public void ViewProgress(HttpServletRequest request,HttpServletResponse response){
		
	}
}
