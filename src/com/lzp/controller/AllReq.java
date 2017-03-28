package com.lzp.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lzp.entity.Person;



@Controller
public class AllReq {
	@RequestMapping(value="/getLeve.do")
	public void getLeve(HttpServletRequest request,HttpServletResponse response){
		System.out.println(request.getParameter("leve"));
	}
	/**
	 *	异步通讯验证账号是否存在 (注册辅助功能)
	 */
	@RequestMapping("/verify.do")
	public void verify(HttpServletRequest request, HttpServletResponse response){
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			
			e1.printStackTrace();
		}
		response.setCharacterEncoding("utf-8");
		String userId = request.getParameter("userId");
		//根据userId查找此人是否存在
		System.out.println(userId);
		//
	}
	//点击登录按钮后，最后一步验证，登录系统
	//登录失败，转发到login页面，否则重定向到主页面
	//并在此处记录登陆者信息
	@RequestMapping("/enter.do")
	public void enter(HttpServletRequest request,HttpServletResponse response){
		String userId = request.getParameter("username");
		String pwd = request.getParameter("password");
	}
	
	//跳转到登录页面
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
		request.setCharacterEncoding("utf-8");
		String userId = request.getParameter("username");
		String pwd = request.getParameter("password");
		response.setContentType("text/xml;charset=UTF-8");
		//System.out.println("login.do");
		//根据唯一的userId，找到这个人信息，并对比pwd是否正确，正确后将此人信息存入session
		return "login";
	}
	
	//登录页面
	@RequestMapping("/index.do")
	public String index(HttpServletRequest request,HttpServletResponse response){
		//System.out.println("index.do");
		response.setContentType("text/xml;charset=UTF-8");
		return "index";
	}
	//地图查询
	@RequestMapping("/map.do")
	public String map(HttpServletRequest request,HttpServletResponse response){
		//System.out.println("index.do");
		return "testMap";
	}
	
	//注册
	@RequestMapping("/sign.do")
	public String sign(HttpServletRequest request, HttpServletResponse response){
		/*String username = request.getParameter("signName");
		String pwd = request.getParameter("pwd");
		String nickname = request.getParameter("nickName");
		Integer tel = Integer.parseInt(request.getParameter("tel"));
		Integer qq = Integer.parseInt(request.getParameter("qq"));
		String email = request.getParameter("email");
		String leve = request.getParameter("leve");*/
		//Person per = new Person("",nickname,pwd,username,email,qq,tel,null,leve);
		//调用service方法，将数据插入数据库
		return "signuser";
		
	}
	@RequestMapping("/toSign.do")
	public String toSign(){
		//访问数据库，向数据库中增加信息
		return "login";
	}
	
	
	
	@RequestMapping(value="/status.do")
	public void state(HttpServletRequest request,HttpServletResponse response) throws IOException{
		OutputStream os = response.getOutputStream();
		os.write('e');
		
	}
	//test
	@RequestMapping("/test.do")
	public String test(HttpServletRequest request, HttpServletResponse response) throws IOException{
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
		response.setContentType("text/html;charset=utf-8");
		//ServletOutputStream os = response.getOutputStream();
		//os.print("123");
		//response.addHeader("Access-Control-Allow-Origin", "*");
		System.out.println("/test.do");
		return "testMap";
	}
	
	
	

}
