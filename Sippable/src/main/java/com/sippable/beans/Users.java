package com.sippable.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Users {
	
	@Id
	@Column(name="USER_ID")
	@SequenceGenerator(name="USER_SEQ", sequenceName = "USER_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_SEQ")
	int userid;
	
	@Column(name="USERNAME")
	String username;
	
	@Column(name="FIRST_NAME")
	String firstName;
	
	@Column(name="LAST_NAME")
	String lastName;
	
	@Column(name = "EMAIL")
	String email;
	
	@Column(name = "PASS")
	String pass;
	
	@Column(name = "IS_ACTIVE")
	int isActive;
	
	@Column(name = "TYPE_ID")
	int typeid;
	
	
/*	String userType;*/
	
	public Users(){}
	
	public Users(int userid, String username, String firstName, String lastName, String email, String pass, int isActive, int typeid){
		this.userid = userid;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pass = pass;
		this.isActive = isActive;
		this.typeid = typeid;
	}
	
	public Users(String username, String firstName, String lastName, String email, String pass, int isActive, int typeid){

		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pass = pass;
		this.isActive = isActive;
		this.typeid = typeid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", pass=" + pass + ", isActive=" + isActive + ", typeid=" + typeid
				+ "]";
	}

/*	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	};
	*/

	
	
}
