package my.test;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

import com.lzp.entity.User;


public class TestOne {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		TestOne test = new TestOne();
		test.test1();
		
			
		
	}
	
	public void test1() throws SQLException{
		Connection conn = null;
		Statement sta = null;
		ResultSet rs = null;
		String sql="";
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		DataSource data = ac.getBean("dataSource",DataSource.class);
		System.out.println(data);
		System.out.println(data.getConnection());
	}
	
	public void test2() throws ClassNotFoundException, SQLException{
		
		//Session session = Hiber.getSession();
		//System.out.println(session);
		//Person person = (Person)session.byId("2");
		//System.out.println(person.toString());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}









