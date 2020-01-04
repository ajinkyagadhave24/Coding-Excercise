package bean;

public class user {
	private int loginid;
	private String password;
	private String email;
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public user(int loginid, String password, String email) {
		super();
		this.loginid = loginid;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "user [loginid=" + loginid + ", password=" + password + ", email=" + email + "]";
	}
	

}
