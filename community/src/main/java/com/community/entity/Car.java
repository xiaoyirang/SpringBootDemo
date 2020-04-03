package com.community.entity;

import java.util.Date;

public class Car implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private String plateNum;
	private Integer parkNum;
	private String brand;
	private String color;
	private Date startTime;
	private String serialNumber;
	private Date endTime;
	private Integer userId;
	private String realName;
	private Integer roomId;
	private Integer status;

	
	// Property accessors
	
	public Integer getId() {
		return this.id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlateNum() {
		return this.plateNum;
	}

	public void setPlateNum(String plateNum) {
		this.plateNum = plateNum;
	}

	public Integer getParkNum() {
		return this.parkNum;
	}

	public void setParkNum(Integer parkNum) {
		this.parkNum = parkNum;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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
	
	
	public Car() {
		super();
	}

	public Car(Integer id, String plateNum, Integer parkNum, String brand, String color, Date startTime,
			String serialNumber, Date endTime, Integer userId, String realName, Integer roomId, Integer status) {
		super();
		this.id = id;
		this.plateNum = plateNum;
		this.parkNum = parkNum;
		this.brand = brand;
		this.color = color;
		this.startTime = startTime;
		this.serialNumber = serialNumber;
		this.endTime = endTime;
		this.userId = userId;
		this.realName = realName;
		this.roomId = roomId;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", plateNum=" + plateNum + ", parkNum=" + parkNum + ", brand=" + brand + ", color="
				+ color + ", startTime=" + startTime + ", serialNumber=" + serialNumber + ", endTime=" + endTime
				+ ", userId=" + userId + ", realName=" + realName + ", roomId=" + roomId +", status=" + status + "]";
	}

}