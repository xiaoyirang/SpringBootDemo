package com.community.entity;

import java.sql.Date;

public class Instrument implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private Integer userId;
	private String realName;
	private Integer roomId;
	private Date startTime;
	private String type;
	private String feeType;
	private String brand;
	private Integer lastNum;
	private Integer thisNum;
	private Integer consumeNum;
	private Integer lastInputUserId;
	private String lasthInputUserName;
	private Integer thisInputUserId;
	private String thisInputUserName;
	private Integer status;

	// Constructors

	/** default constructor */
	public Instrument() {
	}

	/** full constructor */
	public Instrument(Integer userId, String realName, Integer roomId, Date startTime, String type, String feeType,
			String brand, Integer lastNum, Integer thisNum, Integer consumeNum, Integer lastInputUserId,
			String lasthInputUserName, Integer thisInputUserId, String thisInputUserName, Integer status) {
		this.userId = userId;
		this.realName = realName;
		this.roomId = roomId;
		this.startTime = startTime;
		this.type = type;
		this.feeType = feeType;
		this.brand = brand;
		this.lastNum = lastNum;
		this.thisNum = thisNum;
		this.consumeNum = consumeNum;
		this.lastInputUserId = lastInputUserId;
		this.lasthInputUserName = lasthInputUserName;
		this.thisInputUserId = thisInputUserId;
		this.thisInputUserName = thisInputUserName;
		this.status = status;
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

	public Integer getRoomId() {
		return this.roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFeeType() {
		return this.feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getLastNum() {
		return this.lastNum;
	}

	public void setLastNum(Integer lastNum) {
		this.lastNum = lastNum;
	}

	public Integer getThisNum() {
		return this.thisNum;
	}

	public void setThisNum(Integer thisNum) {
		this.thisNum = thisNum;
	}

	public Integer getConsumeNum() {
		return this.consumeNum;
	}

	public void setConsumeNum(Integer consumeNum) {
		this.consumeNum = consumeNum;
	}

	public Integer getLastInputUserId() {
		return this.lastInputUserId;
	}

	public void setLastInputUserId(Integer lastInputUserId) {
		this.lastInputUserId = lastInputUserId;
	}

	public String getLasthInputUserName() {
		return this.lasthInputUserName;
	}

	public void setLasthInputUserName(String lasthInputUserName) {
		this.lasthInputUserName = lasthInputUserName;
	}

	public Integer getThisInputUserId() {
		return this.thisInputUserId;
	}

	public void setThisInputUserId(Integer thisInputUserId) {
		this.thisInputUserId = thisInputUserId;
	}

	public String getThisInputUserName() {
		return this.thisInputUserName;
	}

	public void setThisInputUserName(String thisInputUserName) {
		this.thisInputUserName = thisInputUserName;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Instrument [id=" + id + ", userId=" + userId + ", realName=" + realName + ", roomId=" + roomId
				+ ", startTime=" + startTime + ", type=" + type + ", feeType=" + feeType + ", brand=" + brand
				+ ", lastNum=" + lastNum + ", thisNum=" + thisNum + ", consumeNum=" + consumeNum + ", lastInputUserId="
				+ lastInputUserId + ", lasthInputUserName=" + lasthInputUserName + ", thisInputUserId="
				+ thisInputUserId + ", thisInputUserName=" + thisInputUserName + ", status=" + status + "]";
	}
	
}