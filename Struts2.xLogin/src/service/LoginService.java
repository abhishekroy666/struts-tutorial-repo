package service;

import bean.LoginBean;
import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDao;

public class LoginService extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	LoginBean lb;
	LoginDao ld = new LoginDao();
	
	public LoginBean getLb() {
		return lb;
	}

	public void setLb(LoginBean lb) {
		this.lb = lb;
	}

	@Override
	public String execute() throws Exception {
		return ld.checkLoginDao(lb);
	}

	/*
	 * PROGRAMMATIC VALIDATION 
	@Override
	public void validate() {
		if(lb.getName().length()<=4 || lb.getName().length()>8){
			this.addFieldError("a","User Name should be between 4-8 characters.");
		}
		if(lb.getPass().length()<=4 || lb.getPass().length()>8){
			this.addFieldError("b","Password should be between 4-8 characters.");
		}
	}
	*/	
}
