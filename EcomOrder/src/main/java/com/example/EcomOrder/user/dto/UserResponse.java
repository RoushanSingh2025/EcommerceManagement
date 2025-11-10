package com.example.EcomOrder.user.dto;

public class UserResponse {

    private Long id;
    private String email;
    private String roles;
    
    public UserResponse() {}

    public UserResponse(Long id, String email, String roles) {
        this.id = id;
        this.email = email;
        this.roles = roles;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}
    
    

}
