package com.community.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Userrepair implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private Integer userId;
	private String realName;
	private Date applyTime;
	private String phone;
	private Date bookTime;
	private BigDecimal serviceCost;
	private BigDecimal equipmentCost;
	private BigDecimal allCost;
	private String comments;
	private Integer agreement;
	private Integer status;
	private String replyComments;

	// Constructors

	/** default constructor */
	public Userrepair() {
	}

	/** full constructor */
	public Userrepair(Integer userId, String realName, Date applyTime, String phone, Date bookTime,
			BigDecimal serviceCost, BigDecimal equipmentCost, BigDecimal allCost, String comments, Integer agreement, Integer status,
			String replyComments) {
		this.userId = userId;
		this.realName = realName;
		this.applyTime = applyTime;
		this.phone = phone;
		this.bookTime = bookTime;
		this.serviceCost = serviceCost;
		this.equipmentCost = equipmentCost;
		this.allCost = allCost;
		this.comments = comments;
		this.agreement = agreement;
		this.status = status;
		this.replyComments = replyComments;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Date getApplyTime() {
		return this.applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBookTime() {
		return this.bookTime;
	}

	public void setBookTime(Date bookTime) {
		this.bookTime = bookTime;
	}

	public BigDecimal getServiceCost() {
		return this.serviceCost;
	}

	public void setServiceCost(BigDecimal serviceCost) {
		this.serviceCost = serviceCost;
	}

	public BigDecimal getEquipmentCost() {
		return this.equipmentCost;
	}

	public void setEquipmentCost(BigDecimal equipmentCost) {
		this.equipmentCost = equipmentCost;
	}

	public BigDecimal getAllCost() {
		return this.allCost;
	}

	public void setAllCost(BigDecimal allCost) {
		this.allCost = allCost;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getAgreement() {
		return this.agreement;
	}

	public void setAgreement(Integer agreement) {
		this.agreement = agreement;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getReplyComments() {
		return this.replyComments;
	}

	public void setReplyComments(String replyComments) {
		this.replyComments = replyComments;
	}

	@Override
	public String toString() {
		return "Userrepair [id=" + id + ", userId=" + userId + ", realName=" + realName + ", applyTime=" + applyTime
				+ ", phone=" + phone + ", bookTime=" + bookTime + ", serviceCost=" + serviceCost + ", equipmentCost="
				+ equipmentCost + ", allCost=" + allCost + ", comments=" + comments + ", agreement=" + agreement
				+ ", status=" + status + ", replyComments=" + replyComments + "]";
	}
	
}