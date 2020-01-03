package com.xiao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String code;

    @Column
    private String detail;

    @Column
    private Date gmtCreate;

    @Column
    private Date gmtModify;

    @Column
    private Integer isDeleted;

    @Column
    private String name;

    @Column
    private Integer type;

}