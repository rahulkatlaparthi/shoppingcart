package com.example.demo.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user")


public class User {
	
	  @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="user_id")
      private int id;
	  @NotBlank(message = "Email is mandatory")
	  @Column(unique=true)
      private String email;
	  
      private String name;
      @NotBlank(message = "Password is mandatory")
      @JsonProperty(access = Access.WRITE_ONLY)
      private String password;
      @JsonProperty(access = Access.WRITE_ONLY)
      private String  confirmpassword;
      private Boolean isSeller;
      
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public Boolean getIsSeller() {
		return isSeller;
	}
	public void setIsSeller(Boolean isSeller) {
		this.isSeller = isSeller;
	}
      
      
      
    
	
	
	
	
      

}
