package pack;

import com.opensymphony.xwork2.ActionSupport;

public class Demo extends ActionSupport {
	
	private static final long serialVersionUID = 1L;

	@Override
	public String execute(){
		System.out.println("Hello");
		return "display";
	}
	
	public String ownMethod(){
		System.out.println("Own Method");
		return "display";
	}
}
