package fr.m2i.demo.api.controllers.payload.responses;

public class GetUserResponse {
	
	private Long id;
	private String username;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public GetUserResponse() {	}
	
	public GetUserResponse(Long id, String username) {
		super();
		this.id = id;
		this.username = username;
	}

}
