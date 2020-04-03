package com.community.entity;

import java.sql.Date;

public class Complain implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private Date createTime;
	private Integer userId;
	private String realName;
	private String phone;
	private Date dealTime;
	private String operaterName;
	private Integer operaterUserId;
	private String content;
	private Integer agreement;
	private String status;
	private String comments;
	private Date updateTime;

	// Constructors

	/** default constructor */
	public Complain() {
	}

	/** full constructor */
	public Complain(Date createTime, Integer userId, String realName, String phone, Date dealTime,
			String operaterName, Integer operaterUserId, String content, Integer agreement, String status,
			String comments,Date updateTime) {
		this.createTime = createTime;
		this.userId = userId;
		this.realName = realName;
		this.phone = phone;
		this.dealTime = dealTime;
		this.operaterName = operaterName;
		this.operaterUserId = operaterUserId;
		this.content = content;
		this.agreement = agreement;
		this.status = status;
		this.comments = comments;
		this.updateTime = updateTime;
	}

	// Property accessors
	
	public Integer getId() {
		return this.id;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDealTime() {
		return this.dealTime;
	}

	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}

	public String getOperaterName() {
		return this.operaterName;
	}

	public void setOperaterName(String operaterName) {
		this.operaterName = operaterName;
	}

	public Integer getOperaterUserId() {
		return this.operaterUserId;
	}

	public void setOperaterUserId(Integer operaterUserId) {
		this.operaterUserId = operaterUserId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getAgreement() {
		return this.agreement;
	}

	public void setAgreement(Integer agreement) {
		this.agreement = agreement;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Complain [id=" + id + ", createTime=" + createTime + ", userId=" + userId + ", realName=" + realName
				+ ", phone=" + phone + ", dealTime=" + dealTime + ", operaterName=" + operaterName + ", operaterUserId="
				+ operaterUserId + ", content=" + content + ", agreement=" + agreement + ", status=" + status
				+ ", comments=" + comments + ", updateTime"+ updateTime + "]";
	}
	
	
}