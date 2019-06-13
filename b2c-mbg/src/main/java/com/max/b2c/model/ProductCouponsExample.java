package com.max.b2c.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductCouponsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductCouponsExample() {
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

        public Criteria andCoupon_idIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_idIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_idEqualTo(Integer value) {
            addCriterion("coupon_id =", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idNotEqualTo(Integer value) {
            addCriterion("coupon_id <>", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idGreaterThan(Integer value) {
            addCriterion("coupon_id >", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_id >=", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idLessThan(Integer value) {
            addCriterion("coupon_id <", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_id <=", value, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idIn(List<Integer> values) {
            addCriterion("coupon_id in", values, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idNotIn(List<Integer> values) {
            addCriterion("coupon_id not in", values, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id between", value1, value2, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_idNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id not between", value1, value2, "coupon_id");
            return (Criteria) this;
        }

        public Criteria andCoupon_typeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_typeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_typeEqualTo(Integer value) {
            addCriterion("coupon_type =", value, "coupon_type");
            return (Criteria) this;
        }

        public Criteria andCoupon_typeNotEqualTo(Integer value) {
            addCriterion("coupon_type <>", value, "coupon_type");
            return (Criteria) this;
        }

        public Criteria andCoupon_typeGreaterThan(Integer value) {
            addCriterion("coupon_type >", value, "coupon_type");
            return (Criteria) this;
        }

        public Criteria andCoupon_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_type >=", value, "coupon_type");
            return (Criteria) this;
        }

        public Criteria andCoupon_typeLessThan(Integer value) {
            addCriterion("coupon_type <", value, "coupon_type");
            return (Criteria) this;
        }

        public Criteria andCoupon_typeLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_type <=", value, "coupon_type");
            return (Criteria) this;
        }

        public Criteria andCoupon_typeIn(List<Integer> values) {
            addCriterion("coupon_type in", values, "coupon_type");
            return (Criteria) this;
        }

        public Criteria andCoupon_typeNotIn(List<Integer> values) {
            addCriterion("coupon_type not in", values, "coupon_type");
            return (Criteria) this;
        }

        public Criteria andCoupon_typeBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type between", value1, value2, "coupon_type");
            return (Criteria) this;
        }

        public Criteria andCoupon_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type not between", value1, value2, "coupon_type");
            return (Criteria) this;
        }

        public Criteria andIsfor_productIsNull() {
            addCriterion("isfor_product is null");
            return (Criteria) this;
        }

        public Criteria andIsfor_productIsNotNull() {
            addCriterion("isfor_product is not null");
            return (Criteria) this;
        }

        public Criteria andIsfor_productEqualTo(Integer value) {
            addCriterion("isfor_product =", value, "isfor_product");
            return (Criteria) this;
        }

        public Criteria andIsfor_productNotEqualTo(Integer value) {
            addCriterion("isfor_product <>", value, "isfor_product");
            return (Criteria) this;
        }

        public Criteria andIsfor_productGreaterThan(Integer value) {
            addCriterion("isfor_product >", value, "isfor_product");
            return (Criteria) this;
        }

        public Criteria andIsfor_productGreaterThanOrEqualTo(Integer value) {
            addCriterion("isfor_product >=", value, "isfor_product");
            return (Criteria) this;
        }

        public Criteria andIsfor_productLessThan(Integer value) {
            addCriterion("isfor_product <", value, "isfor_product");
            return (Criteria) this;
        }

        public Criteria andIsfor_productLessThanOrEqualTo(Integer value) {
            addCriterion("isfor_product <=", value, "isfor_product");
            return (Criteria) this;
        }

        public Criteria andIsfor_productIn(List<Integer> values) {
            addCriterion("isfor_product in", values, "isfor_product");
            return (Criteria) this;
        }

        public Criteria andIsfor_productNotIn(List<Integer> values) {
            addCriterion("isfor_product not in", values, "isfor_product");
            return (Criteria) this;
        }

        public Criteria andIsfor_productBetween(Integer value1, Integer value2) {
            addCriterion("isfor_product between", value1, value2, "isfor_product");
            return (Criteria) this;
        }

        public Criteria andIsfor_productNotBetween(Integer value1, Integer value2) {
            addCriterion("isfor_product not between", value1, value2, "isfor_product");
            return (Criteria) this;
        }

        public Criteria andIsfor_shopIsNull() {
            addCriterion("isfor_shop is null");
            return (Criteria) this;
        }

        public Criteria andIsfor_shopIsNotNull() {
            addCriterion("isfor_shop is not null");
            return (Criteria) this;
        }

        public Criteria andIsfor_shopEqualTo(Integer value) {
            addCriterion("isfor_shop =", value, "isfor_shop");
            return (Criteria) this;
        }

        public Criteria andIsfor_shopNotEqualTo(Integer value) {
            addCriterion("isfor_shop <>", value, "isfor_shop");
            return (Criteria) this;
        }

        public Criteria andIsfor_shopGreaterThan(Integer value) {
            addCriterion("isfor_shop >", value, "isfor_shop");
            return (Criteria) this;
        }

        public Criteria andIsfor_shopGreaterThanOrEqualTo(Integer value) {
            addCriterion("isfor_shop >=", value, "isfor_shop");
            return (Criteria) this;
        }

        public Criteria andIsfor_shopLessThan(Integer value) {
            addCriterion("isfor_shop <", value, "isfor_shop");
            return (Criteria) this;
        }

        public Criteria andIsfor_shopLessThanOrEqualTo(Integer value) {
            addCriterion("isfor_shop <=", value, "isfor_shop");
            return (Criteria) this;
        }

        public Criteria andIsfor_shopIn(List<Integer> values) {
            addCriterion("isfor_shop in", values, "isfor_shop");
            return (Criteria) this;
        }

        public Criteria andIsfor_shopNotIn(List<Integer> values) {
            addCriterion("isfor_shop not in", values, "isfor_shop");
            return (Criteria) this;
        }

        public Criteria andIsfor_shopBetween(Integer value1, Integer value2) {
            addCriterion("isfor_shop between", value1, value2, "isfor_shop");
            return (Criteria) this;
        }

        public Criteria andIsfor_shopNotBetween(Integer value1, Integer value2) {
            addCriterion("isfor_shop not between", value1, value2, "isfor_shop");
            return (Criteria) this;
        }

        public Criteria andIsfor_allIsNull() {
            addCriterion("isfor_all is null");
            return (Criteria) this;
        }

        public Criteria andIsfor_allIsNotNull() {
            addCriterion("isfor_all is not null");
            return (Criteria) this;
        }

        public Criteria andIsfor_allEqualTo(String value) {
            addCriterion("isfor_all =", value, "isfor_all");
            return (Criteria) this;
        }

        public Criteria andIsfor_allNotEqualTo(String value) {
            addCriterion("isfor_all <>", value, "isfor_all");
            return (Criteria) this;
        }

        public Criteria andIsfor_allGreaterThan(String value) {
            addCriterion("isfor_all >", value, "isfor_all");
            return (Criteria) this;
        }

        public Criteria andIsfor_allGreaterThanOrEqualTo(String value) {
            addCriterion("isfor_all >=", value, "isfor_all");
            return (Criteria) this;
        }

        public Criteria andIsfor_allLessThan(String value) {
            addCriterion("isfor_all <", value, "isfor_all");
            return (Criteria) this;
        }

        public Criteria andIsfor_allLessThanOrEqualTo(String value) {
            addCriterion("isfor_all <=", value, "isfor_all");
            return (Criteria) this;
        }

        public Criteria andIsfor_allLike(String value) {
            addCriterion("isfor_all like", value, "isfor_all");
            return (Criteria) this;
        }

        public Criteria andIsfor_allNotLike(String value) {
            addCriterion("isfor_all not like", value, "isfor_all");
            return (Criteria) this;
        }

        public Criteria andIsfor_allIn(List<String> values) {
            addCriterion("isfor_all in", values, "isfor_all");
            return (Criteria) this;
        }

        public Criteria andIsfor_allNotIn(List<String> values) {
            addCriterion("isfor_all not in", values, "isfor_all");
            return (Criteria) this;
        }

        public Criteria andIsfor_allBetween(String value1, String value2) {
            addCriterion("isfor_all between", value1, value2, "isfor_all");
            return (Criteria) this;
        }

        public Criteria andIsfor_allNotBetween(String value1, String value2) {
            addCriterion("isfor_all not between", value1, value2, "isfor_all");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameEqualTo(String value) {
            addCriterion("coupon_name =", value, "coupon_name");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "coupon_name");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "coupon_name");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "coupon_name");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameLessThan(String value) {
            addCriterion("coupon_name <", value, "coupon_name");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "coupon_name");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameLike(String value) {
            addCriterion("coupon_name like", value, "coupon_name");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameNotLike(String value) {
            addCriterion("coupon_name not like", value, "coupon_name");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameIn(List<String> values) {
            addCriterion("coupon_name in", values, "coupon_name");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "coupon_name");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "coupon_name");
            return (Criteria) this;
        }

        public Criteria andCoupon_nameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "coupon_name");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailIsNull() {
            addCriterion("coupon_detail is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailIsNotNull() {
            addCriterion("coupon_detail is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailEqualTo(String value) {
            addCriterion("coupon_detail =", value, "coupon_detail");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailNotEqualTo(String value) {
            addCriterion("coupon_detail <>", value, "coupon_detail");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailGreaterThan(String value) {
            addCriterion("coupon_detail >", value, "coupon_detail");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_detail >=", value, "coupon_detail");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailLessThan(String value) {
            addCriterion("coupon_detail <", value, "coupon_detail");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailLessThanOrEqualTo(String value) {
            addCriterion("coupon_detail <=", value, "coupon_detail");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailLike(String value) {
            addCriterion("coupon_detail like", value, "coupon_detail");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailNotLike(String value) {
            addCriterion("coupon_detail not like", value, "coupon_detail");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailIn(List<String> values) {
            addCriterion("coupon_detail in", values, "coupon_detail");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailNotIn(List<String> values) {
            addCriterion("coupon_detail not in", values, "coupon_detail");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailBetween(String value1, String value2) {
            addCriterion("coupon_detail between", value1, value2, "coupon_detail");
            return (Criteria) this;
        }

        public Criteria andCoupon_detailNotBetween(String value1, String value2) {
            addCriterion("coupon_detail not between", value1, value2, "coupon_detail");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceIsNull() {
            addCriterion("coupon_price is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceIsNotNull() {
            addCriterion("coupon_price is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceEqualTo(Integer value) {
            addCriterion("coupon_price =", value, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceNotEqualTo(Integer value) {
            addCriterion("coupon_price <>", value, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceGreaterThan(Integer value) {
            addCriterion("coupon_price >", value, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_price >=", value, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceLessThan(Integer value) {
            addCriterion("coupon_price <", value, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_price <=", value, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceIn(List<Integer> values) {
            addCriterion("coupon_price in", values, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceNotIn(List<Integer> values) {
            addCriterion("coupon_price not in", values, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceBetween(Integer value1, Integer value2) {
            addCriterion("coupon_price between", value1, value2, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_priceNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_price not between", value1, value2, "coupon_price");
            return (Criteria) this;
        }

        public Criteria andCoupon_quantityIsNull() {
            addCriterion("coupon_quantity is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_quantityIsNotNull() {
            addCriterion("coupon_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_quantityEqualTo(Integer value) {
            addCriterion("coupon_quantity =", value, "coupon_quantity");
            return (Criteria) this;
        }

        public Criteria andCoupon_quantityNotEqualTo(Integer value) {
            addCriterion("coupon_quantity <>", value, "coupon_quantity");
            return (Criteria) this;
        }

        public Criteria andCoupon_quantityGreaterThan(Integer value) {
            addCriterion("coupon_quantity >", value, "coupon_quantity");
            return (Criteria) this;
        }

        public Criteria andCoupon_quantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_quantity >=", value, "coupon_quantity");
            return (Criteria) this;
        }

        public Criteria andCoupon_quantityLessThan(Integer value) {
            addCriterion("coupon_quantity <", value, "coupon_quantity");
            return (Criteria) this;
        }

        public Criteria andCoupon_quantityLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_quantity <=", value, "coupon_quantity");
            return (Criteria) this;
        }

        public Criteria andCoupon_quantityIn(List<Integer> values) {
            addCriterion("coupon_quantity in", values, "coupon_quantity");
            return (Criteria) this;
        }

        public Criteria andCoupon_quantityNotIn(List<Integer> values) {
            addCriterion("coupon_quantity not in", values, "coupon_quantity");
            return (Criteria) this;
        }

        public Criteria andCoupon_quantityBetween(Integer value1, Integer value2) {
            addCriterion("coupon_quantity between", value1, value2, "coupon_quantity");
            return (Criteria) this;
        }

        public Criteria andCoupon_quantityNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_quantity not between", value1, value2, "coupon_quantity");
            return (Criteria) this;
        }

        public Criteria andCoupon_starttimeIsNull() {
            addCriterion("coupon_starttime is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_starttimeIsNotNull() {
            addCriterion("coupon_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_starttimeEqualTo(Date value) {
            addCriterion("coupon_starttime =", value, "coupon_starttime");
            return (Criteria) this;
        }

        public Criteria andCoupon_starttimeNotEqualTo(Date value) {
            addCriterion("coupon_starttime <>", value, "coupon_starttime");
            return (Criteria) this;
        }

        public Criteria andCoupon_starttimeGreaterThan(Date value) {
            addCriterion("coupon_starttime >", value, "coupon_starttime");
            return (Criteria) this;
        }

        public Criteria andCoupon_starttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_starttime >=", value, "coupon_starttime");
            return (Criteria) this;
        }

        public Criteria andCoupon_starttimeLessThan(Date value) {
            addCriterion("coupon_starttime <", value, "coupon_starttime");
            return (Criteria) this;
        }

        public Criteria andCoupon_starttimeLessThanOrEqualTo(Date value) {
            addCriterion("coupon_starttime <=", value, "coupon_starttime");
            return (Criteria) this;
        }

        public Criteria andCoupon_starttimeIn(List<Date> values) {
            addCriterion("coupon_starttime in", values, "coupon_starttime");
            return (Criteria) this;
        }

        public Criteria andCoupon_starttimeNotIn(List<Date> values) {
            addCriterion("coupon_starttime not in", values, "coupon_starttime");
            return (Criteria) this;
        }

        public Criteria andCoupon_starttimeBetween(Date value1, Date value2) {
            addCriterion("coupon_starttime between", value1, value2, "coupon_starttime");
            return (Criteria) this;
        }

        public Criteria andCoupon_starttimeNotBetween(Date value1, Date value2) {
            addCriterion("coupon_starttime not between", value1, value2, "coupon_starttime");
            return (Criteria) this;
        }

        public Criteria andCoupon_endtimeIsNull() {
            addCriterion("coupon_endtime is null");
            return (Criteria) this;
        }

        public Criteria andCoupon_endtimeIsNotNull() {
            addCriterion("coupon_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andCoupon_endtimeEqualTo(Date value) {
            addCriterion("coupon_endtime =", value, "coupon_endtime");
            return (Criteria) this;
        }

        public Criteria andCoupon_endtimeNotEqualTo(Date value) {
            addCriterion("coupon_endtime <>", value, "coupon_endtime");
            return (Criteria) this;
        }

        public Criteria andCoupon_endtimeGreaterThan(Date value) {
            addCriterion("coupon_endtime >", value, "coupon_endtime");
            return (Criteria) this;
        }

        public Criteria andCoupon_endtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_endtime >=", value, "coupon_endtime");
            return (Criteria) this;
        }

        public Criteria andCoupon_endtimeLessThan(Date value) {
            addCriterion("coupon_endtime <", value, "coupon_endtime");
            return (Criteria) this;
        }

        public Criteria andCoupon_endtimeLessThanOrEqualTo(Date value) {
            addCriterion("coupon_endtime <=", value, "coupon_endtime");
            return (Criteria) this;
        }

        public Criteria andCoupon_endtimeIn(List<Date> values) {
            addCriterion("coupon_endtime in", values, "coupon_endtime");
            return (Criteria) this;
        }

        public Criteria andCoupon_endtimeNotIn(List<Date> values) {
            addCriterion("coupon_endtime not in", values, "coupon_endtime");
            return (Criteria) this;
        }

        public Criteria andCoupon_endtimeBetween(Date value1, Date value2) {
            addCriterion("coupon_endtime between", value1, value2, "coupon_endtime");
            return (Criteria) this;
        }

        public Criteria andCoupon_endtimeNotBetween(Date value1, Date value2) {
            addCriterion("coupon_endtime not between", value1, value2, "coupon_endtime");
            return (Criteria) this;
        }

        public Criteria andGmt_createIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmt_createIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmt_createEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_createNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmt_create");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmt_modified");
            return (Criteria) this;
        }

        public Criteria andGmt_modifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmt_modified");
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