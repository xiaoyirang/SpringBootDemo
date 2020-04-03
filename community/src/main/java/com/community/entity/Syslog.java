package com.community.entity;

import java.sql.Date;

/**
 * Syslog entity. @author MyEclipse Persistence Tools
 */

public class Syslog implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private Integer userId;
	private String userName;
	private String realName;
	private String model;
	private String msg;
	private Date time;

	// Constructors

	/** default constructor */
	public Syslog() {
	}

	/** full constructor */
	public Syslog(Integer userId, String userName, String realName, String model, String msg, Date time) {
		this.userId = userId;
		this.userName = userName;
		this.realName = realName;
		this.model = model;
		this.msg = msg;
		this.time = time;
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

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}