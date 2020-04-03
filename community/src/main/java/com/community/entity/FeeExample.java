package com.community.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public FeeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFeenameIsNull() {
            addCriterion("feeName is null");
            return (Criteria) this;
        }

        public Criteria andFeenameIsNotNull() {
            addCriterion("feeName is not null");
            return (Criteria) this;
        }

        public Criteria andFeenameEqualTo(String value) {
            addCriterion("feeName =", value, "feename");
            return (Criteria) this;
        }

        public Criteria andFeenameNotEqualTo(String value) {
            addCriterion("feeName <>", value, "feename");
            return (Criteria) this;
        }

        public Criteria andFeenameGreaterThan(String value) {
            addCriterion("feeName >", value, "feename");
            return (Criteria) this;
        }

        public Criteria andFeenameGreaterThanOrEqualTo(String value) {
            addCriterion("feeName >=", value, "feename");
            return (Criteria) this;
        }

        public Criteria andFeenameLessThan(String value) {
            addCriterion("feeName <", value, "feename");
            return (Criteria) this;
        }

        public Criteria andFeenameLessThanOrEqualTo(String value) {
            addCriterion("feeName <=", value, "feename");
            return (Criteria) this;
        }

        public Criteria andFeenameLike(String value) {
            addCriterion("feeName like", value, "feename");
            return (Criteria) this;
        }

        public Criteria andFeenameNotLike(String value) {
            addCriterion("feeName not like", value, "feename");
            return (Criteria) this;
        }

        public Criteria andFeenameIn(List<String> values) {
            addCriterion("feeName in", values, "feename");
            return (Criteria) this;
        }

        public Criteria andFeenameNotIn(List<String> values) {
            addCriterion("feeName not in", values, "feename");
            return (Criteria) this;
        }

        public Criteria andFeenameBetween(String value1, String value2) {
            addCriterion("feeName between", value1, value2, "feename");
            return (Criteria) this;
        }

        public Criteria andFeenameNotBetween(String value1, String value2) {
            addCriterion("feeName not between", value1, value2, "feename");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andFixedcostIsNull() {
            addCriterion("fixedCost is null");
            return (Criteria) this;
        }

        public Criteria andFixedcostIsNotNull() {
            addCriterion("fixedCost is not null");
            return (Criteria) this;
        }

        public Criteria andFixedcostEqualTo(Long value) {
            addCriterion("fixedCost =", value, "fixedcost");
            return (Criteria) this;
        }

        public Criteria andFixedcostNotEqualTo(Long value) {
            addCriterion("fixedCost <>", value, "fixedcost");
            return (Criteria) this;
        }

        public Criteria andFixedcostGreaterThan(Long value) {
            addCriterion("fixedCost >", value, "fixedcost");
            return (Criteria) this;
        }

        public Criteria andFixedcostGreaterThanOrEqualTo(Long value) {
            addCriterion("fixedCost >=", value, "fixedcost");
            return (Criteria) this;
        }

        public Criteria andFixedcostLessThan(Long value) {
            addCriterion("fixedCost <", value, "fixedcost");
            return (Criteria) this;
        }

        public Criteria andFixedcostLessThanOrEqualTo(Long value) {
            addCriterion("fixedCost <=", value, "fixedcost");
            return (Criteria) this;
        }

        public Criteria andFixedcostIn(List<Long> values) {
            addCriterion("fixedCost in", values, "fixedcost");
            return (Criteria) this;
        }

        public Criteria andFixedcostNotIn(List<Long> values) {
            addCriterion("fixedCost not in", values, "fixedcost");
            return (Criteria) this;
        }

        public Criteria andFixedcostBetween(Long value1, Long value2) {
            addCriterion("fixedCost between", value1, value2, "fixedcost");
            return (Criteria) this;
        }

        public Criteria andFixedcostNotBetween(Long value1, Long value2) {
            addCriterion("fixedCost not between", value1, value2, "fixedcost");
            return (Criteria) this;
        }

        public Criteria andCostunitIsNull() {
            addCriterion("costUnit is null");
            return (Criteria) this;
        }

        public Criteria andCostunitIsNotNull() {
            addCriterion("costUnit is not null");
            return (Criteria) this;
        }

        public Criteria andCostunitEqualTo(Integer value) {
            addCriterion("costUnit =", value, "costunit");
            return (Criteria) this;
        }

        public Criteria andCostunitNotEqualTo(Integer value) {
            addCriterion("costUnit <>", value, "costunit");
            return (Criteria) this;
        }

        public Criteria andCostunitGreaterThan(Integer value) {
            addCriterion("costUnit >", value, "costunit");
            return (Criteria) this;
        }

        public Criteria andCostunitGreaterThanOrEqualTo(Integer value) {
            addCriterion("costUnit >=", value, "costunit");
            return (Criteria) this;
        }

        public Criteria andCostunitLessThan(Integer value) {
            addCriterion("costUnit <", value, "costunit");
            return (Criteria) this;
        }

        public Criteria andCostunitLessThanOrEqualTo(Integer value) {
            addCriterion("costUnit <=", value, "costunit");
            return (Criteria) this;
        }

        public Criteria andCostunitIn(List<Integer> values) {
            addCriterion("costUnit in", values, "costunit");
            return (Criteria) this;
        }

        public Criteria andCostunitNotIn(List<Integer> values) {
            addCriterion("costUnit not in", values, "costunit");
            return (Criteria) this;
        }

        public Criteria andCostunitBetween(Integer value1, Integer value2) {
            addCriterion("costUnit between", value1, value2, "costunit");
            return (Criteria) this;
        }

        public Criteria andCostunitNotBetween(Integer value1, Integer value2) {
            addCriterion("costUnit not between", value1, value2, "costunit");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("createUserId is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("createUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(Integer value) {
            addCriterion("createUserId =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(Integer value) {
            addCriterion("createUserId <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(Integer value) {
            addCriterion("createUserId >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("createUserId >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(Integer value) {
            addCriterion("createUserId <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(Integer value) {
            addCriterion("createUserId <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<Integer> values) {
            addCriterion("createUserId in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<Integer> values) {
            addCriterion("createUserId not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(Integer value1, Integer value2) {
            addCriterion("createUserId between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("createUserId not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNull() {
            addCriterion("createUserName is null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNotNull() {
            addCriterion("createUserName is not null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameEqualTo(String value) {
            addCriterion("createUserName =", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotEqualTo(String value) {
            addCriterion("createUserName <>", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThan(String value) {
            addCriterion("createUserName >", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThanOrEqualTo(String value) {
            addCriterion("createUserName >=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThan(String value) {
            addCriterion("createUserName <", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThanOrEqualTo(String value) {
            addCriterion("createUserName <=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLike(String value) {
            addCriterion("createUserName like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotLike(String value) {
            addCriterion("createUserName not like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIn(List<String> values) {
            addCriterion("createUserName in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotIn(List<String> values) {
            addCriterion("createUserName not in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameBetween(String value1, String value2) {
            addCriterion("createUserName between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotBetween(String value1, String value2) {
            addCriterion("createUserName not between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNull() {
            addCriterion("updateUserId is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNotNull() {
            addCriterion("updateUserId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridEqualTo(Integer value) {
            addCriterion("updateUserId =", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotEqualTo(Integer value) {
            addCriterion("updateUserId <>", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThan(Integer value) {
            addCriterion("updateUserId >", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateUserId >=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThan(Integer value) {
            addCriterion("updateUserId <", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThanOrEqualTo(Integer value) {
            addCriterion("updateUserId <=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIn(List<Integer> values) {
            addCriterion("updateUserId in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotIn(List<Integer> values) {
            addCriterion("updateUserId not in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridBetween(Integer value1, Integer value2) {
            addCriterion("updateUserId between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("updateUserId not between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameIsNull() {
            addCriterion("updateUserName is null");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameIsNotNull() {
            addCriterion("updateUserName is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameEqualTo(String value) {
            addCriterion("updateUserName =", value, "updateusername");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameNotEqualTo(String value) {
            addCriterion("updateUserName <>", value, "updateusername");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameGreaterThan(String value) {
            addCriterion("updateUserName >", value, "updateusername");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameGreaterThanOrEqualTo(String value) {
            addCriterion("updateUserName >=", value, "updateusername");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameLessThan(String value) {
            addCriterion("updateUserName <", value, "updateusername");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameLessThanOrEqualTo(String value) {
            addCriterion("updateUserName <=", value, "updateusername");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameLike(String value) {
            addCriterion("updateUserName like", value, "updateusername");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameNotLike(String value) {
            addCriterion("updateUserName not like", value, "updateusername");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameIn(List<String> values) {
            addCriterion("updateUserName in", values, "updateusername");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameNotIn(List<String> values) {
            addCriterion("updateUserName not in", values, "updateusername");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameBetween(String value1, String value2) {
            addCriterion("updateUserName between", value1, value2, "updateusername");
            return (Criteria) this;
        }

        public Criteria andUpdateusernameNotBetween(String value1, String value2) {
            addCriterion("updateUserName not between", value1, value2, "updateusername");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}