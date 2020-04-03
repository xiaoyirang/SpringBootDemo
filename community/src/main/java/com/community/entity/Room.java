package com.community.entity;

public class Room implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private String communityName;
	private Integer buildingNum;
	private Integer unitNum;
	private Integer roomNum;
	private Double commonArea;
	private Double area;
	private String roomType;
	private Integer userId;
	private String realName;
	private Integer sold;

	// Constructors

	/** default constructor */
	public Room() {
	}

	/** full constructor */
	public Room(String communityName, Integer buildingNum, Integer unitNum, Integer roomNum, Double commonArea,
			Double area, String roomType, Integer userId, String realName, Integer sold) {
		this.communityName = communityName;
		this.buildingNum = buildingNum;
		this.unitNum = unitNum;
		this.roomNum = roomNum;
		this.commonArea = commonArea;
		this.area = area;
		this.roomType = roomType;
		this.userId = userId;
		this.realName = realName;
		this.sold = sold;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommunityName() {
		return this.communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public Integer getBuildingNum() {
		return this.buildingNum;
	}

	public void setBuildingNum(Integer buildingNum) {
		this.buildingNum = buildingNum;
	}

	public Integer getUnitNum() {
		return this.unitNum;
	}

	public void setUnitNum(Integer unitNum) {
		this.unitNum = unitNum;
	}

	public Integer getRoomNum() {
		return this.roomNum;
	}

	public void setRoomNum(Integer roomNum) {
		this.roomNum = roomNum;
	}

	public Double getCommonArea() {
		return this.commonArea;
	}

	public void setCommonArea(Double commonArea) {
		this.commonArea = commonArea;
	}

	public Double getArea() {
		return this.area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public String getRoomType() {
		return this.roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
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

	@Override
	public String toString() {
		return "Room [id=" + id + ", communityName=" + communityName + ", buildingNum=" + buildingNum + ", unitNum="
				+ unitNum + ", roomNum=" + roomNum + ", commonArea=" + commonArea + ", area=" + area + ", roomType="
				+ roomType + ", userId=" + userId + ", realName=" + realName + ", sold=" + sold + "]";
	}
	
}