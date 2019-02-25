package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import bean.LoginBean;

public class LoginDao {
	public String checkLoginDao(LoginBean lb){
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ss = sf.openSession();
		
		LoginBean ll = (LoginBean)ss.get(LoginBean.class,lb.getName());
		ss.close();
		sf.close();
		if(ll != null){
			return "success";
		}else{
			return "failure";
		}	
	}
}
