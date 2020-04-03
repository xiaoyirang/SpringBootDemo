package com.community.entity;

import java.util.Date;

public class Parkinglots implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private String serialNumber;
	private String location;
	private Integer userId;
	private String realName;
	private Integer sold;
	private Date startTime;
	private Date endTime;
	private Integer carId;

	// Constructors

	/** default constructor */
	public Parkinglots() {
	}

	/** full constructor */
	public Parkinglots(String serialNumber, String location, Integer userId, String realName, Integer sold,
			Date startTime, Date endTime, Integer carId) {
		this.serialNumber = serialNumber;
		this.location = location;
		this.userId = userId;
		this.realName = realName;
		this.sold = sold;
		this.startTime = startTime;
		this.endTime = endTime;
		this.carId = carId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public Integer getSold() {
		return this.sold;
	}

	public void setSold(Integer sold) {
		this.sold = sold;
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

	public Integer getCarId() {
		return this.carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	@Override
	public String toString() {
		return "Parkinglots [id=" + id + ", serialNumber=" + serialNumber + ", location=" + location + ", userId="
				+ userId + ", realName=" + realName + ", sold=" + sold + ", startTime=" + startTime + ", endTime="
				+ endTime + ", carId=" + carId + "]";
	}
	
}