package com.lzp.filter;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class FilterAllRequest implements Filter{
	HttpServletResponse rep = null;
	@Override
	public void destroy() {
		try {
			close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("destroy");
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain filter) throws IOException, ServletException {
		System.out.println("doFilter");
		rep = (HttpServletResponse) res;
		filter.doFilter(req, res);
	}


	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("init");
		
	}

	public void close() throws IOException{
		OutputStream os = rep.getOutputStream();
		rep.sendRedirect("login.html");
 		
	}

}
