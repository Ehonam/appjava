package fr.m2i.demo.api.controllers.payload.requests;

public class LoginRequest {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginRequest() {
		// TODO Auto-generated constructor stub
	}

	public LoginRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

}
