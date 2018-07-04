/**
 * 
 */
package com.practise.model;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Dilip
 *
 */
public class Student implements  Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Size(min = 3, max = 30)
	@NotEmpty
	private String firstName;
	
	@Size(min = 3, max = 30)
	private String LastName;
	
	@NotEmpty
	private String sex;
	
	@Email
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String country;
	
	/**
	 * @return the firstNamae
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstNamae
	 *            the firstNamae to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastNamae
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @param lastNamae
	 *            the lastNamae to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
