package com.sp.mehta.applications.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String 	userName;
	private String 	email;
	private Boolean active;
	
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String employeeNo;
	private String externalId;
	private String password;
	private String deviceNo;
	private String training;
	private int failedAttempts;
	private int changePasswordAttempts;
	private String cellPin;
	private String emailId;
	private String skill;
	private String group;
	public User() {
		super();
	}

	public User(Integer id) {
		this.id = id;
	}

	public User(String userName, String password, String email, Boolean active) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.active = active;
	}

	public User(User user) {
		this.id=user.getId();
		this.userName = user.getUserName();
		this.email = user.getEmail();
		this.password = user.getPassword();
		this.active = user.getActive();	
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", length = 11, unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="user_name",unique = true,length=60,nullable=false)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name="password",length=60,nullable=false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="email",length=60,nullable=false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="active")
	public Boolean getActive() {
		return active;
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getTraining() {
		return training;
	}

	public void setTraining(String training) {
		this.training = training;
	}

	public int getFailedAttempts() {
		return failedAttempts;
	}

	public void setFailedAttempts(int failedAttempts) {
		this.failedAttempts = failedAttempts;
	}

	public int getChangePasswordAttempts() {
		return changePasswordAttempts;
	}

	public void setChangePasswordAttempts(int changePasswordAttempts) {
		this.changePasswordAttempts = changePasswordAttempts;
	}

	public String getCellPin() {
		return cellPin;
	}

	public void setCellPin(String cellPin) {
		this.cellPin = cellPin;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	
}
