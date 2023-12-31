package com.delery.response;

import com.delery.entity.Student;

public class StudentResponse {
	
	private long Id;
	private String firstName;
	private String lastName;
	private String email;
	
	private AddressResponse addressResponse;
	


	public StudentResponse(Student student) {
		this.Id= student.getId();
		this.firstName= student.getFirstName();
		this.lastName= student.getLastName();
		this.email= student.getEmail();
	
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return Id;
	}



	public void setId(long id) {
		Id = id;
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



	public AddressResponse getAddressResponse() {
		return addressResponse;
	}



	public void setAddressResponse(AddressResponse addressResponse) {
		this.addressResponse = addressResponse;
	}
	
	
	

}
