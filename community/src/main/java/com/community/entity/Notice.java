package com.community.entity;

import java.sql.Date;

public class Notice implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private String title;
	private Date date;
	private String content;
	private String author;

	// Constructors

	/** default constructor */
	public Notice() {
	}

	/** full constructor */
	public Notice(String title, Date date, String content, String author) {
		this.title = title;
		this.date = date;
		this.content = content;
		this.author = author;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", date=" + date + ", content=" + content + ", author="
				+ author + "]";
	}
	
}