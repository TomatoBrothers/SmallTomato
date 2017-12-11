package com.smalltomato.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOpeningIsNull() {
            addCriterion("opening is null");
            return (Criteria) this;
        }

        public Criteria andOpeningIsNotNull() {
            addCriterion("opening is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningEqualTo(String value) {
            addCriterion("opening =", value, "opening");
            return (Criteria) this;
        }

        public Criteria andOpeningNotEqualTo(String value) {
            addCriterion("opening <>", value, "opening");
            return (Criteria) this;
        }

        public Criteria andOpeningGreaterThan(String value) {
            addCriterion("opening >", value, "opening");
            return (Criteria) this;
        }

        public Criteria andOpeningGreaterThanOrEqualTo(String value) {
            addCriterion("opening >=", value, "opening");
            return (Criteria) this;
        }

        public Criteria andOpeningLessThan(String value) {
            addCriterion("opening <", value, "opening");
            return (Criteria) this;
        }

        public Criteria andOpeningLessThanOrEqualTo(String value) {
            addCriterion("opening <=", value, "opening");
            return (Criteria) this;
        }

        public Criteria andOpeningLike(String value) {
            addCriterion("opening like", value, "opening");
            return (Criteria) this;
        }

        public Criteria andOpeningNotLike(String value) {
            addCriterion("opening not like", value, "opening");
            return (Criteria) this;
        }

        public Criteria andOpeningIn(List<String> values) {
            addCriterion("opening in", values, "opening");
            return (Criteria) this;
        }

        public Criteria andOpeningNotIn(List<String> values) {
            addCriterion("opening not in", values, "opening");
            return (Criteria) this;
        }

        public Criteria andOpeningBetween(String value1, String value2) {
            addCriterion("opening between", value1, value2, "opening");
            return (Criteria) this;
        }

        public Criteria andOpeningNotBetween(String value1, String value2) {
            addCriterion("opening not between", value1, value2, "opening");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseIsNull() {
            addCriterion("yesterday_close is null");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseIsNotNull() {
            addCriterion("yesterday_close is not null");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseEqualTo(String value) {
            addCriterion("yesterday_close =", value, "yesterdayClose");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseNotEqualTo(String value) {
            addCriterion("yesterday_close <>", value, "yesterdayClose");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseGreaterThan(String value) {
            addCriterion("yesterday_close >", value, "yesterdayClose");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseGreaterThanOrEqualTo(String value) {
            addCriterion("yesterday_close >=", value, "yesterdayClose");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseLessThan(String value) {
            addCriterion("yesterday_close <", value, "yesterdayClose");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseLessThanOrEqualTo(String value) {
            addCriterion("yesterday_close <=", value, "yesterdayClose");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseLike(String value) {
            addCriterion("yesterday_close like", value, "yesterdayClose");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseNotLike(String value) {
            addCriterion("yesterday_close not like", value, "yesterdayClose");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseIn(List<String> values) {
            addCriterion("yesterday_close in", values, "yesterdayClose");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseNotIn(List<String> values) {
            addCriterion("yesterday_close not in", values, "yesterdayClose");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseBetween(String value1, String value2) {
            addCriterion("yesterday_close between", value1, value2, "yesterdayClose");
            return (Criteria) this;
        }

        public Criteria andYesterdayCloseNotBetween(String value1, String value2) {
            addCriterion("yesterday_close not between", value1, value2, "yesterdayClose");
            return (Criteria) this;
        }

        public Criteria andHighestIsNull() {
            addCriterion("highest is null");
            return (Criteria) this;
        }

        public Criteria andHighestIsNotNull() {
            addCriterion("highest is not null");
            return (Criteria) this;
        }

        public Criteria andHighestEqualTo(String value) {
            addCriterion("highest =", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestNotEqualTo(String value) {
            addCriterion("highest <>", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestGreaterThan(String value) {
            addCriterion("highest >", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestGreaterThanOrEqualTo(String value) {
            addCriterion("highest >=", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestLessThan(String value) {
            addCriterion("highest <", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestLessThanOrEqualTo(String value) {
            addCriterion("highest <=", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestLike(String value) {
            addCriterion("highest like", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestNotLike(String value) {
            addCriterion("highest not like", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestIn(List<String> values) {
            addCriterion("highest in", values, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestNotIn(List<String> values) {
            addCriterion("highest not in", values, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestBetween(String value1, String value2) {
            addCriterion("highest between", value1, value2, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestNotBetween(String value1, String value2) {
            addCriterion("highest not between", value1, value2, "highest");
            return (Criteria) this;
        }

        public Criteria andLowestIsNull() {
            addCriterion("lowest is null");
            return (Criteria) this;
        }

        public Criteria andLowestIsNotNull() {
            addCriterion("lowest is not null");
            return (Criteria) this;
        }

        public Criteria andLowestEqualTo(String value) {
            addCriterion("lowest =", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestNotEqualTo(String value) {
            addCriterion("lowest <>", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestGreaterThan(String value) {
            addCriterion("lowest >", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestGreaterThanOrEqualTo(String value) {
            addCriterion("lowest >=", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestLessThan(String value) {
            addCriterion("lowest <", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestLessThanOrEqualTo(String value) {
            addCriterion("lowest <=", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestLike(String value) {
            addCriterion("lowest like", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestNotLike(String value) {
            addCriterion("lowest not like", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestIn(List<String> values) {
            addCriterion("lowest in", values, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestNotIn(List<String> values) {
            addCriterion("lowest not in", values, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestBetween(String value1, String value2) {
            addCriterion("lowest between", value1, value2, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestNotBetween(String value1, String value2) {
            addCriterion("lowest not between", value1, value2, "lowest");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeIsNull() {
            addCriterion("total_volume is null");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeIsNotNull() {
            addCriterion("total_volume is not null");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeEqualTo(String value) {
            addCriterion("total_volume =", value, "totalVolume");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeNotEqualTo(String value) {
            addCriterion("total_volume <>", value, "totalVolume");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeGreaterThan(String value) {
            addCriterion("total_volume >", value, "totalVolume");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("total_volume >=", value, "totalVolume");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeLessThan(String value) {
            addCriterion("total_volume <", value, "totalVolume");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeLessThanOrEqualTo(String value) {
            addCriterion("total_volume <=", value, "totalVolume");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeLike(String value) {
            addCriterion("total_volume like", value, "totalVolume");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeNotLike(String value) {
            addCriterion("total_volume not like", value, "totalVolume");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeIn(List<String> values) {
            addCriterion("total_volume in", values, "totalVolume");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeNotIn(List<String> values) {
            addCriterion("total_volume not in", values, "totalVolume");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeBetween(String value1, String value2) {
            addCriterion("total_volume between", value1, value2, "totalVolume");
            return (Criteria) this;
        }

        public Criteria andTotalVolumeNotBetween(String value1, String value2) {
            addCriterion("total_volume not between", value1, value2, "totalVolume");
            return (Criteria) this;
        }

        public Criteria andTotalLimitIsNull() {
            addCriterion("total_limit is null");
            return (Criteria) this;
        }

        public Criteria andTotalLimitIsNotNull() {
            addCriterion("total_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLimitEqualTo(String value) {
            addCriterion("total_limit =", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitNotEqualTo(String value) {
            addCriterion("total_limit <>", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitGreaterThan(String value) {
            addCriterion("total_limit >", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitGreaterThanOrEqualTo(String value) {
            addCriterion("total_limit >=", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitLessThan(String value) {
            addCriterion("total_limit <", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitLessThanOrEqualTo(String value) {
            addCriterion("total_limit <=", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitLike(String value) {
            addCriterion("total_limit like", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitNotLike(String value) {
            addCriterion("total_limit not like", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitIn(List<String> values) {
            addCriterion("total_limit in", values, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitNotIn(List<String> values) {
            addCriterion("total_limit not in", values, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitBetween(String value1, String value2) {
            addCriterion("total_limit between", value1, value2, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitNotBetween(String value1, String value2) {
            addCriterion("total_limit not between", value1, value2, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeIsNull() {
            addCriterion("buy_one_volume is null");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeIsNotNull() {
            addCriterion("buy_one_volume is not null");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeEqualTo(String value) {
            addCriterion("buy_one_volume =", value, "buyOneVolume");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeNotEqualTo(String value) {
            addCriterion("buy_one_volume <>", value, "buyOneVolume");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeGreaterThan(String value) {
            addCriterion("buy_one_volume >", value, "buyOneVolume");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("buy_one_volume >=", value, "buyOneVolume");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeLessThan(String value) {
            addCriterion("buy_one_volume <", value, "buyOneVolume");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeLessThanOrEqualTo(String value) {
            addCriterion("buy_one_volume <=", value, "buyOneVolume");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeLike(String value) {
            addCriterion("buy_one_volume like", value, "buyOneVolume");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeNotLike(String value) {
            addCriterion("buy_one_volume not like", value, "buyOneVolume");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeIn(List<String> values) {
            addCriterion("buy_one_volume in", values, "buyOneVolume");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeNotIn(List<String> values) {
            addCriterion("buy_one_volume not in", values, "buyOneVolume");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeBetween(String value1, String value2) {
            addCriterion("buy_one_volume between", value1, value2, "buyOneVolume");
            return (Criteria) this;
        }

        public Criteria andBuyOneVolumeNotBetween(String value1, String value2) {
            addCriterion("buy_one_volume not between", value1, value2, "buyOneVolume");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeIsNull() {
            addCriterion("buy_two_volume is null");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeIsNotNull() {
            addCriterion("buy_two_volume is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeEqualTo(String value) {
            addCriterion("buy_two_volume =", value, "buyTwoVolume");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeNotEqualTo(String value) {
            addCriterion("buy_two_volume <>", value, "buyTwoVolume");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeGreaterThan(String value) {
            addCriterion("buy_two_volume >", value, "buyTwoVolume");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("buy_two_volume >=", value, "buyTwoVolume");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeLessThan(String value) {
            addCriterion("buy_two_volume <", value, "buyTwoVolume");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeLessThanOrEqualTo(String value) {
            addCriterion("buy_two_volume <=", value, "buyTwoVolume");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeLike(String value) {
            addCriterion("buy_two_volume like", value, "buyTwoVolume");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeNotLike(String value) {
            addCriterion("buy_two_volume not like", value, "buyTwoVolume");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeIn(List<String> values) {
            addCriterion("buy_two_volume in", values, "buyTwoVolume");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeNotIn(List<String> values) {
            addCriterion("buy_two_volume not in", values, "buyTwoVolume");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeBetween(String value1, String value2) {
            addCriterion("buy_two_volume between", value1, value2, "buyTwoVolume");
            return (Criteria) this;
        }

        public Criteria andBuyTwoVolumeNotBetween(String value1, String value2) {
            addCriterion("buy_two_volume not between", value1, value2, "buyTwoVolume");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeIsNull() {
            addCriterion("buy_three_volume is null");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeIsNotNull() {
            addCriterion("buy_three_volume is not null");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeEqualTo(String value) {
            addCriterion("buy_three_volume =", value, "buyThreeVolume");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeNotEqualTo(String value) {
            addCriterion("buy_three_volume <>", value, "buyThreeVolume");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeGreaterThan(String value) {
            addCriterion("buy_three_volume >", value, "buyThreeVolume");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("buy_three_volume >=", value, "buyThreeVolume");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeLessThan(String value) {
            addCriterion("buy_three_volume <", value, "buyThreeVolume");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeLessThanOrEqualTo(String value) {
            addCriterion("buy_three_volume <=", value, "buyThreeVolume");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeLike(String value) {
            addCriterion("buy_three_volume like", value, "buyThreeVolume");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeNotLike(String value) {
            addCriterion("buy_three_volume not like", value, "buyThreeVolume");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeIn(List<String> values) {
            addCriterion("buy_three_volume in", values, "buyThreeVolume");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeNotIn(List<String> values) {
            addCriterion("buy_three_volume not in", values, "buyThreeVolume");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeBetween(String value1, String value2) {
            addCriterion("buy_three_volume between", value1, value2, "buyThreeVolume");
            return (Criteria) this;
        }

        public Criteria andBuyThreeVolumeNotBetween(String value1, String value2) {
            addCriterion("buy_three_volume not between", value1, value2, "buyThreeVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeIsNull() {
            addCriterion("buy_four_volume is null");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeIsNotNull() {
            addCriterion("buy_four_volume is not null");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeEqualTo(String value) {
            addCriterion("buy_four_volume =", value, "buyFourVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeNotEqualTo(String value) {
            addCriterion("buy_four_volume <>", value, "buyFourVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeGreaterThan(String value) {
            addCriterion("buy_four_volume >", value, "buyFourVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("buy_four_volume >=", value, "buyFourVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeLessThan(String value) {
            addCriterion("buy_four_volume <", value, "buyFourVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeLessThanOrEqualTo(String value) {
            addCriterion("buy_four_volume <=", value, "buyFourVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeLike(String value) {
            addCriterion("buy_four_volume like", value, "buyFourVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeNotLike(String value) {
            addCriterion("buy_four_volume not like", value, "buyFourVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeIn(List<String> values) {
            addCriterion("buy_four_volume in", values, "buyFourVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeNotIn(List<String> values) {
            addCriterion("buy_four_volume not in", values, "buyFourVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeBetween(String value1, String value2) {
            addCriterion("buy_four_volume between", value1, value2, "buyFourVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFourVolumeNotBetween(String value1, String value2) {
            addCriterion("buy_four_volume not between", value1, value2, "buyFourVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeIsNull() {
            addCriterion("buy_five_volume is null");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeIsNotNull() {
            addCriterion("buy_five_volume is not null");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeEqualTo(String value) {
            addCriterion("buy_five_volume =", value, "buyFiveVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeNotEqualTo(String value) {
            addCriterion("buy_five_volume <>", value, "buyFiveVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeGreaterThan(String value) {
            addCriterion("buy_five_volume >", value, "buyFiveVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("buy_five_volume >=", value, "buyFiveVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeLessThan(String value) {
            addCriterion("buy_five_volume <", value, "buyFiveVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeLessThanOrEqualTo(String value) {
            addCriterion("buy_five_volume <=", value, "buyFiveVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeLike(String value) {
            addCriterion("buy_five_volume like", value, "buyFiveVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeNotLike(String value) {
            addCriterion("buy_five_volume not like", value, "buyFiveVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeIn(List<String> values) {
            addCriterion("buy_five_volume in", values, "buyFiveVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeNotIn(List<String> values) {
            addCriterion("buy_five_volume not in", values, "buyFiveVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeBetween(String value1, String value2) {
            addCriterion("buy_five_volume between", value1, value2, "buyFiveVolume");
            return (Criteria) this;
        }

        public Criteria andBuyFiveVolumeNotBetween(String value1, String value2) {
            addCriterion("buy_five_volume not between", value1, value2, "buyFiveVolume");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceIsNull() {
            addCriterion("buy_one_price is null");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceIsNotNull() {
            addCriterion("buy_one_price is not null");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceEqualTo(String value) {
            addCriterion("buy_one_price =", value, "buyOnePrice");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceNotEqualTo(String value) {
            addCriterion("buy_one_price <>", value, "buyOnePrice");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceGreaterThan(String value) {
            addCriterion("buy_one_price >", value, "buyOnePrice");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceGreaterThanOrEqualTo(String value) {
            addCriterion("buy_one_price >=", value, "buyOnePrice");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceLessThan(String value) {
            addCriterion("buy_one_price <", value, "buyOnePrice");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceLessThanOrEqualTo(String value) {
            addCriterion("buy_one_price <=", value, "buyOnePrice");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceLike(String value) {
            addCriterion("buy_one_price like", value, "buyOnePrice");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceNotLike(String value) {
            addCriterion("buy_one_price not like", value, "buyOnePrice");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceIn(List<String> values) {
            addCriterion("buy_one_price in", values, "buyOnePrice");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceNotIn(List<String> values) {
            addCriterion("buy_one_price not in", values, "buyOnePrice");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceBetween(String value1, String value2) {
            addCriterion("buy_one_price between", value1, value2, "buyOnePrice");
            return (Criteria) this;
        }

        public Criteria andBuyOnePriceNotBetween(String value1, String value2) {
            addCriterion("buy_one_price not between", value1, value2, "buyOnePrice");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceIsNull() {
            addCriterion("buy_two_price is null");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceIsNotNull() {
            addCriterion("buy_two_price is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceEqualTo(String value) {
            addCriterion("buy_two_price =", value, "buyTwoPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceNotEqualTo(String value) {
            addCriterion("buy_two_price <>", value, "buyTwoPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceGreaterThan(String value) {
            addCriterion("buy_two_price >", value, "buyTwoPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceGreaterThanOrEqualTo(String value) {
            addCriterion("buy_two_price >=", value, "buyTwoPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceLessThan(String value) {
            addCriterion("buy_two_price <", value, "buyTwoPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceLessThanOrEqualTo(String value) {
            addCriterion("buy_two_price <=", value, "buyTwoPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceLike(String value) {
            addCriterion("buy_two_price like", value, "buyTwoPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceNotLike(String value) {
            addCriterion("buy_two_price not like", value, "buyTwoPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceIn(List<String> values) {
            addCriterion("buy_two_price in", values, "buyTwoPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceNotIn(List<String> values) {
            addCriterion("buy_two_price not in", values, "buyTwoPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceBetween(String value1, String value2) {
            addCriterion("buy_two_price between", value1, value2, "buyTwoPrice");
            return (Criteria) this;
        }

        public Criteria andBuyTwoPriceNotBetween(String value1, String value2) {
            addCriterion("buy_two_price not between", value1, value2, "buyTwoPrice");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceIsNull() {
            addCriterion("buy_three_price is null");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceIsNotNull() {
            addCriterion("buy_three_price is not null");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceEqualTo(String value) {
            addCriterion("buy_three_price =", value, "buyThreePrice");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceNotEqualTo(String value) {
            addCriterion("buy_three_price <>", value, "buyThreePrice");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceGreaterThan(String value) {
            addCriterion("buy_three_price >", value, "buyThreePrice");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceGreaterThanOrEqualTo(String value) {
            addCriterion("buy_three_price >=", value, "buyThreePrice");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceLessThan(String value) {
            addCriterion("buy_three_price <", value, "buyThreePrice");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceLessThanOrEqualTo(String value) {
            addCriterion("buy_three_price <=", value, "buyThreePrice");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceLike(String value) {
            addCriterion("buy_three_price like", value, "buyThreePrice");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceNotLike(String value) {
            addCriterion("buy_three_price not like", value, "buyThreePrice");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceIn(List<String> values) {
            addCriterion("buy_three_price in", values, "buyThreePrice");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceNotIn(List<String> values) {
            addCriterion("buy_three_price not in", values, "buyThreePrice");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceBetween(String value1, String value2) {
            addCriterion("buy_three_price between", value1, value2, "buyThreePrice");
            return (Criteria) this;
        }

        public Criteria andBuyThreePriceNotBetween(String value1, String value2) {
            addCriterion("buy_three_price not between", value1, value2, "buyThreePrice");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceIsNull() {
            addCriterion("buy_four_price is null");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceIsNotNull() {
            addCriterion("buy_four_price is not null");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceEqualTo(String value) {
            addCriterion("buy_four_price =", value, "buyFourPrice");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceNotEqualTo(String value) {
            addCriterion("buy_four_price <>", value, "buyFourPrice");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceGreaterThan(String value) {
            addCriterion("buy_four_price >", value, "buyFourPrice");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceGreaterThanOrEqualTo(String value) {
            addCriterion("buy_four_price >=", value, "buyFourPrice");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceLessThan(String value) {
            addCriterion("buy_four_price <", value, "buyFourPrice");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceLessThanOrEqualTo(String value) {
            addCriterion("buy_four_price <=", value, "buyFourPrice");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceLike(String value) {
            addCriterion("buy_four_price like", value, "buyFourPrice");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceNotLike(String value) {
            addCriterion("buy_four_price not like", value, "buyFourPrice");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceIn(List<String> values) {
            addCriterion("buy_four_price in", values, "buyFourPrice");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceNotIn(List<String> values) {
            addCriterion("buy_four_price not in", values, "buyFourPrice");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceBetween(String value1, String value2) {
            addCriterion("buy_four_price between", value1, value2, "buyFourPrice");
            return (Criteria) this;
        }

        public Criteria andBuyFourPriceNotBetween(String value1, String value2) {
            addCriterion("buy_four_price not between", value1, value2, "buyFourPrice");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceIsNull() {
            addCriterion("buy_five_price is null");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceIsNotNull() {
            addCriterion("buy_five_price is not null");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceEqualTo(String value) {
            addCriterion("buy_five_price =", value, "buyFivePrice");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceNotEqualTo(String value) {
            addCriterion("buy_five_price <>", value, "buyFivePrice");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceGreaterThan(String value) {
            addCriterion("buy_five_price >", value, "buyFivePrice");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceGreaterThanOrEqualTo(String value) {
            addCriterion("buy_five_price >=", value, "buyFivePrice");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceLessThan(String value) {
            addCriterion("buy_five_price <", value, "buyFivePrice");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceLessThanOrEqualTo(String value) {
            addCriterion("buy_five_price <=", value, "buyFivePrice");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceLike(String value) {
            addCriterion("buy_five_price like", value, "buyFivePrice");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceNotLike(String value) {
            addCriterion("buy_five_price not like", value, "buyFivePrice");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceIn(List<String> values) {
            addCriterion("buy_five_price in", values, "buyFivePrice");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceNotIn(List<String> values) {
            addCriterion("buy_five_price not in", values, "buyFivePrice");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceBetween(String value1, String value2) {
            addCriterion("buy_five_price between", value1, value2, "buyFivePrice");
            return (Criteria) this;
        }

        public Criteria andBuyFivePriceNotBetween(String value1, String value2) {
            addCriterion("buy_five_price not between", value1, value2, "buyFivePrice");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeIsNull() {
            addCriterion("sell_one_volume is null");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeIsNotNull() {
            addCriterion("sell_one_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeEqualTo(String value) {
            addCriterion("sell_one_volume =", value, "sellOneVolume");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeNotEqualTo(String value) {
            addCriterion("sell_one_volume <>", value, "sellOneVolume");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeGreaterThan(String value) {
            addCriterion("sell_one_volume >", value, "sellOneVolume");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("sell_one_volume >=", value, "sellOneVolume");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeLessThan(String value) {
            addCriterion("sell_one_volume <", value, "sellOneVolume");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeLessThanOrEqualTo(String value) {
            addCriterion("sell_one_volume <=", value, "sellOneVolume");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeLike(String value) {
            addCriterion("sell_one_volume like", value, "sellOneVolume");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeNotLike(String value) {
            addCriterion("sell_one_volume not like", value, "sellOneVolume");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeIn(List<String> values) {
            addCriterion("sell_one_volume in", values, "sellOneVolume");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeNotIn(List<String> values) {
            addCriterion("sell_one_volume not in", values, "sellOneVolume");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeBetween(String value1, String value2) {
            addCriterion("sell_one_volume between", value1, value2, "sellOneVolume");
            return (Criteria) this;
        }

        public Criteria andSellOneVolumeNotBetween(String value1, String value2) {
            addCriterion("sell_one_volume not between", value1, value2, "sellOneVolume");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeIsNull() {
            addCriterion("sell_two_volume is null");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeIsNotNull() {
            addCriterion("sell_two_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeEqualTo(String value) {
            addCriterion("sell_two_volume =", value, "sellTwoVolume");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeNotEqualTo(String value) {
            addCriterion("sell_two_volume <>", value, "sellTwoVolume");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeGreaterThan(String value) {
            addCriterion("sell_two_volume >", value, "sellTwoVolume");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("sell_two_volume >=", value, "sellTwoVolume");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeLessThan(String value) {
            addCriterion("sell_two_volume <", value, "sellTwoVolume");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeLessThanOrEqualTo(String value) {
            addCriterion("sell_two_volume <=", value, "sellTwoVolume");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeLike(String value) {
            addCriterion("sell_two_volume like", value, "sellTwoVolume");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeNotLike(String value) {
            addCriterion("sell_two_volume not like", value, "sellTwoVolume");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeIn(List<String> values) {
            addCriterion("sell_two_volume in", values, "sellTwoVolume");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeNotIn(List<String> values) {
            addCriterion("sell_two_volume not in", values, "sellTwoVolume");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeBetween(String value1, String value2) {
            addCriterion("sell_two_volume between", value1, value2, "sellTwoVolume");
            return (Criteria) this;
        }

        public Criteria andSellTwoVolumeNotBetween(String value1, String value2) {
            addCriterion("sell_two_volume not between", value1, value2, "sellTwoVolume");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeIsNull() {
            addCriterion("sell_three_volume is null");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeIsNotNull() {
            addCriterion("sell_three_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeEqualTo(String value) {
            addCriterion("sell_three_volume =", value, "sellThreeVolume");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeNotEqualTo(String value) {
            addCriterion("sell_three_volume <>", value, "sellThreeVolume");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeGreaterThan(String value) {
            addCriterion("sell_three_volume >", value, "sellThreeVolume");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("sell_three_volume >=", value, "sellThreeVolume");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeLessThan(String value) {
            addCriterion("sell_three_volume <", value, "sellThreeVolume");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeLessThanOrEqualTo(String value) {
            addCriterion("sell_three_volume <=", value, "sellThreeVolume");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeLike(String value) {
            addCriterion("sell_three_volume like", value, "sellThreeVolume");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeNotLike(String value) {
            addCriterion("sell_three_volume not like", value, "sellThreeVolume");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeIn(List<String> values) {
            addCriterion("sell_three_volume in", values, "sellThreeVolume");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeNotIn(List<String> values) {
            addCriterion("sell_three_volume not in", values, "sellThreeVolume");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeBetween(String value1, String value2) {
            addCriterion("sell_three_volume between", value1, value2, "sellThreeVolume");
            return (Criteria) this;
        }

        public Criteria andSellThreeVolumeNotBetween(String value1, String value2) {
            addCriterion("sell_three_volume not between", value1, value2, "sellThreeVolume");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeIsNull() {
            addCriterion("sell_four_volume is null");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeIsNotNull() {
            addCriterion("sell_four_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeEqualTo(String value) {
            addCriterion("sell_four_volume =", value, "sellFourVolume");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeNotEqualTo(String value) {
            addCriterion("sell_four_volume <>", value, "sellFourVolume");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeGreaterThan(String value) {
            addCriterion("sell_four_volume >", value, "sellFourVolume");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("sell_four_volume >=", value, "sellFourVolume");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeLessThan(String value) {
            addCriterion("sell_four_volume <", value, "sellFourVolume");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeLessThanOrEqualTo(String value) {
            addCriterion("sell_four_volume <=", value, "sellFourVolume");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeLike(String value) {
            addCriterion("sell_four_volume like", value, "sellFourVolume");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeNotLike(String value) {
            addCriterion("sell_four_volume not like", value, "sellFourVolume");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeIn(List<String> values) {
            addCriterion("sell_four_volume in", values, "sellFourVolume");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeNotIn(List<String> values) {
            addCriterion("sell_four_volume not in", values, "sellFourVolume");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeBetween(String value1, String value2) {
            addCriterion("sell_four_volume between", value1, value2, "sellFourVolume");
            return (Criteria) this;
        }

        public Criteria andSellFourVolumeNotBetween(String value1, String value2) {
            addCriterion("sell_four_volume not between", value1, value2, "sellFourVolume");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeIsNull() {
            addCriterion("sell_five_volume is null");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeIsNotNull() {
            addCriterion("sell_five_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeEqualTo(String value) {
            addCriterion("sell_five_volume =", value, "sellFiveVolume");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeNotEqualTo(String value) {
            addCriterion("sell_five_volume <>", value, "sellFiveVolume");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeGreaterThan(String value) {
            addCriterion("sell_five_volume >", value, "sellFiveVolume");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("sell_five_volume >=", value, "sellFiveVolume");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeLessThan(String value) {
            addCriterion("sell_five_volume <", value, "sellFiveVolume");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeLessThanOrEqualTo(String value) {
            addCriterion("sell_five_volume <=", value, "sellFiveVolume");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeLike(String value) {
            addCriterion("sell_five_volume like", value, "sellFiveVolume");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeNotLike(String value) {
            addCriterion("sell_five_volume not like", value, "sellFiveVolume");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeIn(List<String> values) {
            addCriterion("sell_five_volume in", values, "sellFiveVolume");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeNotIn(List<String> values) {
            addCriterion("sell_five_volume not in", values, "sellFiveVolume");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeBetween(String value1, String value2) {
            addCriterion("sell_five_volume between", value1, value2, "sellFiveVolume");
            return (Criteria) this;
        }

        public Criteria andSellFiveVolumeNotBetween(String value1, String value2) {
            addCriterion("sell_five_volume not between", value1, value2, "sellFiveVolume");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceIsNull() {
            addCriterion("sell_one_price is null");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceIsNotNull() {
            addCriterion("sell_one_price is not null");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceEqualTo(String value) {
            addCriterion("sell_one_price =", value, "sellOnePrice");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceNotEqualTo(String value) {
            addCriterion("sell_one_price <>", value, "sellOnePrice");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceGreaterThan(String value) {
            addCriterion("sell_one_price >", value, "sellOnePrice");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceGreaterThanOrEqualTo(String value) {
            addCriterion("sell_one_price >=", value, "sellOnePrice");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceLessThan(String value) {
            addCriterion("sell_one_price <", value, "sellOnePrice");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceLessThanOrEqualTo(String value) {
            addCriterion("sell_one_price <=", value, "sellOnePrice");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceLike(String value) {
            addCriterion("sell_one_price like", value, "sellOnePrice");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceNotLike(String value) {
            addCriterion("sell_one_price not like", value, "sellOnePrice");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceIn(List<String> values) {
            addCriterion("sell_one_price in", values, "sellOnePrice");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceNotIn(List<String> values) {
            addCriterion("sell_one_price not in", values, "sellOnePrice");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceBetween(String value1, String value2) {
            addCriterion("sell_one_price between", value1, value2, "sellOnePrice");
            return (Criteria) this;
        }

        public Criteria andSellOnePriceNotBetween(String value1, String value2) {
            addCriterion("sell_one_price not between", value1, value2, "sellOnePrice");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceIsNull() {
            addCriterion("sell_two_price is null");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceIsNotNull() {
            addCriterion("sell_two_price is not null");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceEqualTo(String value) {
            addCriterion("sell_two_price =", value, "sellTwoPrice");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceNotEqualTo(String value) {
            addCriterion("sell_two_price <>", value, "sellTwoPrice");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceGreaterThan(String value) {
            addCriterion("sell_two_price >", value, "sellTwoPrice");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceGreaterThanOrEqualTo(String value) {
            addCriterion("sell_two_price >=", value, "sellTwoPrice");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceLessThan(String value) {
            addCriterion("sell_two_price <", value, "sellTwoPrice");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceLessThanOrEqualTo(String value) {
            addCriterion("sell_two_price <=", value, "sellTwoPrice");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceLike(String value) {
            addCriterion("sell_two_price like", value, "sellTwoPrice");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceNotLike(String value) {
            addCriterion("sell_two_price not like", value, "sellTwoPrice");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceIn(List<String> values) {
            addCriterion("sell_two_price in", values, "sellTwoPrice");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceNotIn(List<String> values) {
            addCriterion("sell_two_price not in", values, "sellTwoPrice");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceBetween(String value1, String value2) {
            addCriterion("sell_two_price between", value1, value2, "sellTwoPrice");
            return (Criteria) this;
        }

        public Criteria andSellTwoPriceNotBetween(String value1, String value2) {
            addCriterion("sell_two_price not between", value1, value2, "sellTwoPrice");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceIsNull() {
            addCriterion("sell_three_price is null");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceIsNotNull() {
            addCriterion("sell_three_price is not null");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceEqualTo(String value) {
            addCriterion("sell_three_price =", value, "sellThreePrice");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceNotEqualTo(String value) {
            addCriterion("sell_three_price <>", value, "sellThreePrice");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceGreaterThan(String value) {
            addCriterion("sell_three_price >", value, "sellThreePrice");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceGreaterThanOrEqualTo(String value) {
            addCriterion("sell_three_price >=", value, "sellThreePrice");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceLessThan(String value) {
            addCriterion("sell_three_price <", value, "sellThreePrice");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceLessThanOrEqualTo(String value) {
            addCriterion("sell_three_price <=", value, "sellThreePrice");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceLike(String value) {
            addCriterion("sell_three_price like", value, "sellThreePrice");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceNotLike(String value) {
            addCriterion("sell_three_price not like", value, "sellThreePrice");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceIn(List<String> values) {
            addCriterion("sell_three_price in", values, "sellThreePrice");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceNotIn(List<String> values) {
            addCriterion("sell_three_price not in", values, "sellThreePrice");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceBetween(String value1, String value2) {
            addCriterion("sell_three_price between", value1, value2, "sellThreePrice");
            return (Criteria) this;
        }

        public Criteria andSellThreePriceNotBetween(String value1, String value2) {
            addCriterion("sell_three_price not between", value1, value2, "sellThreePrice");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceIsNull() {
            addCriterion("sell_four_price is null");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceIsNotNull() {
            addCriterion("sell_four_price is not null");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceEqualTo(String value) {
            addCriterion("sell_four_price =", value, "sellFourPrice");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceNotEqualTo(String value) {
            addCriterion("sell_four_price <>", value, "sellFourPrice");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceGreaterThan(String value) {
            addCriterion("sell_four_price >", value, "sellFourPrice");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceGreaterThanOrEqualTo(String value) {
            addCriterion("sell_four_price >=", value, "sellFourPrice");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceLessThan(String value) {
            addCriterion("sell_four_price <", value, "sellFourPrice");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceLessThanOrEqualTo(String value) {
            addCriterion("sell_four_price <=", value, "sellFourPrice");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceLike(String value) {
            addCriterion("sell_four_price like", value, "sellFourPrice");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceNotLike(String value) {
            addCriterion("sell_four_price not like", value, "sellFourPrice");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceIn(List<String> values) {
            addCriterion("sell_four_price in", values, "sellFourPrice");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceNotIn(List<String> values) {
            addCriterion("sell_four_price not in", values, "sellFourPrice");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceBetween(String value1, String value2) {
            addCriterion("sell_four_price between", value1, value2, "sellFourPrice");
            return (Criteria) this;
        }

        public Criteria andSellFourPriceNotBetween(String value1, String value2) {
            addCriterion("sell_four_price not between", value1, value2, "sellFourPrice");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceIsNull() {
            addCriterion("sell_five_price is null");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceIsNotNull() {
            addCriterion("sell_five_price is not null");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceEqualTo(String value) {
            addCriterion("sell_five_price =", value, "sellFivePrice");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceNotEqualTo(String value) {
            addCriterion("sell_five_price <>", value, "sellFivePrice");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceGreaterThan(String value) {
            addCriterion("sell_five_price >", value, "sellFivePrice");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceGreaterThanOrEqualTo(String value) {
            addCriterion("sell_five_price >=", value, "sellFivePrice");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceLessThan(String value) {
            addCriterion("sell_five_price <", value, "sellFivePrice");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceLessThanOrEqualTo(String value) {
            addCriterion("sell_five_price <=", value, "sellFivePrice");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceLike(String value) {
            addCriterion("sell_five_price like", value, "sellFivePrice");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceNotLike(String value) {
            addCriterion("sell_five_price not like", value, "sellFivePrice");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceIn(List<String> values) {
            addCriterion("sell_five_price in", values, "sellFivePrice");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceNotIn(List<String> values) {
            addCriterion("sell_five_price not in", values, "sellFivePrice");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceBetween(String value1, String value2) {
            addCriterion("sell_five_price between", value1, value2, "sellFivePrice");
            return (Criteria) this;
        }

        public Criteria andSellFivePriceNotBetween(String value1, String value2) {
            addCriterion("sell_five_price not between", value1, value2, "sellFivePrice");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }
    }

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