package com.community.entity;

import java.util.Date;

public class User implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	/*
	 * personal information
	 */
	private String userName;
	
	private String password;
	
	private String realName;
	
	//male = 1 ;female = 0
	private String sex;
	
	private String companyName;
	
	private String idCardNum;
	
	private String phone;
	
	private String email;
	
	private String address;
	
	/*
	 * building information
	 */
	
	//the time move in
	private Date settleTime;
	
	/*
	 * account information
	 */
	
	//main account id,the owner of the house
	private Integer mainAccount;
	
	//the relationship with the owner of house,儿子，女儿，母亲，父亲，etc
	private String relationship;
	//ordinary user = 1 , admin user  = 2 ;
	private Integer role;
	//account status,1 is normal,0 is deleted,2 is unchecked
	private Integer status;
	
	private Date createTime;
	
	private Date updateTime;
	
	// the time move out
	private Date outmigrationTime;
	
	
	/**
	 * setter and getter
	 */
	
	public Integer getId() {
		return id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getOutmigrationTime() {
		return outmigrationTime;
	}
	public void setOutmigrationTime(Date outmigrationTime) {
		this.outmigrationTime = outmigrationTime;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getIdCardNum() {
		return idCardNum;
	}
	public void setIdCardNum(String idCardNum) {
		this.idCardNum = idCardNum;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getSettleTime() {
		return settleTime;
	}
	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
	}
	
	public Integer getMainAccount() {
		return mainAccount;
	}
	public void setMainAccount(Integer mainAccount) {
		this.mainAccount = mainAccount;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", realName=" + realName
				+ ", sex=" + sex + ", companyName=" + companyName + ", idCardNum=" + idCardNum + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + ", settleTime=" + settleTime + ", mainAccount="
				+ mainAccount + ", relationship=" + relationship + ", role=" + role + ", status=" + status
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", outmigrationTime=" + outmigrationTime
				+ "]";
	}
		
	
}
