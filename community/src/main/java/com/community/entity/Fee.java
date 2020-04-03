package com.community.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Fee implements Serializable {
    private Integer id;

    /**
     * 费用名称
     */
    private String feename;

    /**
     * 单价
     */
    private Long price;

    /**
     * 固定收费价格
     */
    private Long fixedcost;

    /**
     * 收费单位，年，月，日，数字
     */
    private Integer costunit;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 创建人id
     */
    private Integer createuserid;

    /**
     * 创建人姓名
     */
    private String createusername;

    /**
     * 更新人id
     */
    private Integer updateuserid;

    /**
     * 更新人姓名
     */
    private String updateusername;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 状态
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeename() {
        return feename;
    }

    public void setFeename(String feename) {
        this.feename = feename;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getFixedcost() {
        return fixedcost;
    }

    public void setFixedcost(Long fixedcost) {
        this.fixedcost = fixedcost;
    }

    public Integer getCostunit() {
        return costunit;
    }

    public void setCostunit(Integer costunit) {
        this.costunit = costunit;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername;
    }

    public Integer getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(Integer updateuserid) {
        this.updateuserid = updateuserid;
    }

    public String getUpdateusername() {
        return updateusername;
    }

    public void setUpdateusername(String updateusername) {
        this.updateusername = updateusername;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}