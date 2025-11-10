package com.example.EcomOrder.user.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "U_Users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

 @Id
 //@GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "u_id") 
 private Long id;

 @Column(nullable = false, unique = true,name = "u_email")
 private String email;

 @Column(nullable = false,name = "u_password")
 private String passwordHash;

 @Column(nullable = false,name = "u_roles")
 private String roles; // e.g. ROLE_USER, ROLE_ADMIN

 @Column(nullable = false, updatable = false,name = "createdAt")
 private Instant createdAt = Instant.now();
 

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

 public String getPasswordHash() {
     return passwordHash;
 }

 public void setPasswordHash(String passwordHash) {
     this.passwordHash = passwordHash;
 }

 public String getRoles() {
     return roles;
 }

 public void setRoles(String roles) {
     this.roles = roles;
 }

 public Instant getCreatedAt() {
     return createdAt;
 }
}
