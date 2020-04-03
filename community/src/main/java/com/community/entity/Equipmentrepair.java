package com.community.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Equipmentrepair implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private Integer equipmentId;
	private String equipmentName;
	private String operateName;
	private String comments;
	private Integer createUserId;
	private String createName;
	private String operaterName;
	private String location;
	private Integer status;
	private Date startTime;
	private Date endTime;
	private BigDecimal fee;
	private Date createTime;

	// Constructors

	/** default constructor */
	public Equipmentrepair() {
	}

	/** full constructor */
	public Equipmentrepair(Integer equipmentId, String equipmentName, String operateName, String comments,
			Integer createUserId, String createName, String operaterName, String location, Integer status,
			Date startTime, Date endTime, BigDecimal fee, Date createTime) {
		this.equipmentId = equipmentId;
		this.equipmentName = equipmentName;
		this.operateName = operateName;
		this.comments = comments;
		this.createUserId = createUserId;
		this.createName = createName;
		this.operaterName = operaterName;
		this.location = location;
		this.status = status;
		this.startTime = startTime;
		this.endTime = endTime;
		this.fee = fee;
		this.createTime = createTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEquipmentId() {
		return this.equipmentId;
	}

	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getEquipmentName() {
		return this.equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getOperateName() {
		return this.operateName;
	}

	public void setOperateName(String operateName) {
		this.operateName = operateName;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateName() {
		return this.createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getOperaterName() {
		return this.operaterName;
	}

	public void setOperaterName(String operaterName) {
		this.operaterName = operaterName;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public BigDecimal getFee() {
		return this.fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Equipmentrepair [id=" + id + ", equipmentId=" + equipmentId + ", equipmentName=" + equipmentName
				+ ", operateName=" + operateName + ", comments=" + comments + ", createUserId=" + createUserId
				+ ", createName=" + createName + ", operaterName=" + operaterName + ", location=" + location
				+ ", status=" + status + ", startTime=" + startTime + ", endTime=" + endTime + ", fee=" + fee
				+ ", createTime=" + createTime + "]";
	}
	
}