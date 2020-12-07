package com.example.app.ws.requests;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class UserRequest {

	
	@NotBlank(message = "Ce champ ne peut pas être nul")
	@Size(min=3, message = "Ce champ doit avoir au moins 3 caractéres")
	private String firstName;
	
	@NotNull(message = "Ce champ ne peut pas être nul")
	@Size(min=3, message = "Ce champ doit avoir au moins 3 caractéres")
	private String lastName;
	
	@NotNull(message = "Ce champ ne peut pas être nul")
	@Email
	private String email;
	
	@NotNull(message = "Ce champ ne peut pas être nul")
	@Size(min=8, max=12, message = "Ce champ doit avoir entre 8 et 12 caractéres")
	@Pattern(regexp = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$", message = "Ce champ doit avoir des lettres majuscules, minuscule, des nombres ou bien caractéres spéciaux")
	private String password;
	
	@NotNull
	private int age;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private List<AddressRequest> addresses;
	
	
	public List<AddressRequest> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<AddressRequest> addresses) {
		this.addresses = addresses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
