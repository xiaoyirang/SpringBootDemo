package com.community.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Equipment implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private String equipmentName;
	private String location;
	private String serialNumber;
	private Date boughtDate;
	private String type;
	private String brand;
	private String status;
	private String conditiona;
	private Date createTime;
	private BigDecimal price;

	// Constructors

	/** default constructor */
	public Equipment() {
	}

	/** full constructor */
	public Equipment(String equipmentName, String location, String serialNumber, Date boughtDate, String type,
			String brand, String status, String conditiona, Date createTime, BigDecimal price) {
		this.equipmentName = equipmentName;
		this.location = location;
		this.serialNumber = serialNumber;
		this.boughtDate = boughtDate;
		this.type = type;
		this.brand = brand;
		this.status = status;
		this.conditiona = conditiona;
		this.createTime = createTime;
		this.price = price;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEquipmentName() {
		return this.equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Date getBoughtDate() {
		return this.boughtDate;
	}

	public void setBoughtDate(Date boughtDate) {
		this.boughtDate = boughtDate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getConditiona() {
		return this.conditiona;
	}

	public void setConditiona(String conditiona) {
		this.conditiona = conditiona;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Equipment [id=" + id + ", equipmentName=" + equipmentName + ", location=" + location + ", serialNumber="
				+ serialNumber + ", boughtDate=" + boughtDate + ", type=" + type + ", brand=" + brand + ", status="
				+ status + ", condition=" + conditiona + ", createTime=" + createTime + ", price=" + price + "]";
	}
	
}