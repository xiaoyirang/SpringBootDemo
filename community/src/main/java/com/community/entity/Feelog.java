package com.community.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class Feelog implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private Integer feeId;
	private String feeName;
	private Date startTime;
	private Date endTime;
	private Date createTime;
	private String payType;
	private Date payTime;
	private BigDecimal payCost;
	private String comments;
	private Integer roomId;
	private Integer dealUserId;
	private String dealUserName;
	private Integer status;
	private Integer isPay;

	// Constructors

	/** default constructor */
	public Feelog() {
	}

	/** full constructor */
	public Feelog(Integer feeId, String feeName, Date startTime, Date endTime, Date createTime,
			String payType, Date payTime, BigDecimal payCost, String comments, Integer roomId, Integer dealUserId,
			String dealUserName, Integer status, Integer isPay) {
		this.feeId = feeId;
		this.feeName = feeName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createTime = createTime;
		this.payType = payType;
		this.payTime = payTime;
		this.payCost = payCost;
		this.comments = comments;
		this.roomId = roomId;
		this.dealUserId = dealUserId;
		this.dealUserName = dealUserName;
		this.status = status;
		this.isPay = isPay;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFeeId() {
		return this.feeId;
	}

	public void setFeeId(Integer feeId) {
		this.feeId = feeId;
	}

	public String getFeeName() {
		return this.feeName;
	}

	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Date getPayTime() {
		return this.payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public BigDecimal getPayCost() {
		return this.payCost;
	}

	public void setPayCost(BigDecimal payCost) {
		this.payCost = payCost;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getRoomId() {
		return this.roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Integer getDealUserId() {
		return this.dealUserId;
	}

	public void setDealUserId(Integer dealUserId) {
		this.dealUserId = dealUserId;
	}

	public String getDealUserName() {
		return this.dealUserName;
	}

	public void setDealUserName(String dealUserName) {
		this.dealUserName = dealUserName;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsPay() {
		return this.isPay;
	}

	public void setIsPay(Integer isPay) {
		this.isPay = isPay;
	}

	@Override
	public String toString() {
		return "Feelog [id=" + id + ", feeId=" + feeId + ", feeName=" + feeName + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", createTime=" + createTime + ", payType=" + payType + ", payTime="
				+ payTime + ", payCost=" + payCost + ", comments=" + comments + ", roomId=" + roomId + ", dealUserId="
				+ dealUserId + ", dealUserName=" + dealUserName + ", status=" + status + ", isPay=" + isPay + "]";
	}
	
}