package com.max.b2c.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellerShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellerShopExample() {
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

        public Criteria andShop_idIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShop_idIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShop_idEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idLessThan(Integer value) {
            addCriterion("shop_id <", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shop_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSeller_idIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeller_idEqualTo(Integer value) {
            addCriterion("seller_id =", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThan(Integer value) {
            addCriterion("seller_id <", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idIn(List<Integer> values) {
            addCriterion("seller_id in", values, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "seller_id");
            return (Criteria) this;
        }

        public Criteria andSeller_idNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "seller_id");
            return (Criteria) this;
        }

        public Criteria andShop_nameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShop_nameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShop_nameEqualTo(String value) {
            addCriterion("shop_name =", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameLessThan(String value) {
            addCriterion("shop_name <", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameLike(String value) {
            addCriterion("shop_name like", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameNotLike(String value) {
            addCriterion("shop_name not like", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameIn(List<String> values) {
            addCriterion("shop_name in", values, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_addrIsNull() {
            addCriterion("shop_addr is null");
            return (Criteria) this;
        }

        public Criteria andShop_addrIsNotNull() {
            addCriterion("shop_addr is not null");
            return (Criteria) this;
        }

        public Criteria andShop_addrEqualTo(String value) {
            addCriterion("shop_addr =", value, "shop_addr");
            return (Criteria) this;
        }

        public Criteria andShop_addrNotEqualTo(String value) {
            addCriterion("shop_addr <>", value, "shop_addr");
            return (Criteria) this;
        }

        public Criteria andShop_addrGreaterThan(String value) {
            addCriterion("shop_addr >", value, "shop_addr");
            return (Criteria) this;
        }

        public Criteria andShop_addrGreaterThanOrEqualTo(String value) {
            addCriterion("shop_addr >=", value, "shop_addr");
            return (Criteria) this;
        }

        public Criteria andShop_addrLessThan(String value) {
            addCriterion("shop_addr <", value, "shop_addr");
            return (Criteria) this;
        }

        public Criteria andShop_addrLessThanOrEqualTo(String value) {
            addCriterion("shop_addr <=", value, "shop_addr");
            return (Criteria) this;
        }

        public Criteria andShop_addrLike(String value) {
            addCriterion("shop_addr like", value, "shop_addr");
            return (Criteria) this;
        }

        public Criteria andShop_addrNotLike(String value) {
            addCriterion("shop_addr not like", value, "shop_addr");
            return (Criteria) this;
        }

        public Criteria andShop_addrIn(List<String> values) {
            addCriterion("shop_addr in", values, "shop_addr");
            return (Criteria) this;
        }

        public Criteria andShop_addrNotIn(List<String> values) {
            addCriterion("shop_addr not in", values, "shop_addr");
            return (Criteria) this;
        }

        public Criteria andShop_addrBetween(String value1, String value2) {
            addCriterion("shop_addr between", value1, value2, "shop_addr");
            return (Criteria) this;
        }

        public Criteria andShop_addrNotBetween(String value1, String value2) {
            addCriterion("shop_addr not between", value1, value2, "shop_addr");
            return (Criteria) this;
        }

        public Criteria andShop_styleIsNull() {
            addCriterion("shop_style is null");
            return (Criteria) this;
        }

        public Criteria andShop_styleIsNotNull() {
            addCriterion("shop_style is not null");
            return (Criteria) this;
        }

        public Criteria andShop_styleEqualTo(Integer value) {
            addCriterion("shop_style =", value, "shop_style");
            return (Criteria) this;
        }

        public Criteria andShop_styleNotEqualTo(Integer value) {
            addCriterion("shop_style <>", value, "shop_style");
            return (Criteria) this;
        }

        public Criteria andShop_styleGreaterThan(Integer value) {
            addCriterion("shop_style >", value, "shop_style");
            return (Criteria) this;
        }

        public Criteria andShop_styleGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_style >=", value, "shop_style");
            return (Criteria) this;
        }

        public Criteria andShop_styleLessThan(Integer value) {
            addCriterion("shop_style <", value, "shop_style");
            return (Criteria) this;
        }

        public Criteria andShop_styleLessThanOrEqualTo(Integer value) {
            addCriterion("shop_style <=", value, "shop_style");
            return (Criteria) this;
        }

        public Criteria andShop_styleIn(List<Integer> values) {
            addCriterion("shop_style in", values, "shop_style");
            return (Criteria) this;
        }

        public Criteria andShop_styleNotIn(List<Integer> values) {
            addCriterion("shop_style not in", values, "shop_style");
            return (Criteria) this;
        }

        public Criteria andShop_styleBetween(Integer value1, Integer value2) {
            addCriterion("shop_style between", value1, value2, "shop_style");
            return (Criteria) this;
        }

        public Criteria andShop_styleNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_style not between", value1, value2, "shop_style");
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

        public Criteria andSale_categoryIsNull() {
            addCriterion("sale_category is null");
            return (Criteria) this;
        }

        public Criteria andSale_categoryIsNotNull() {
            addCriterion("sale_category is not null");
            return (Criteria) this;
        }

        public Criteria andSale_categoryEqualTo(Integer value) {
            addCriterion("sale_category =", value, "sale_category");
            return (Criteria) this;
        }

        public Criteria andSale_categoryNotEqualTo(Integer value) {
            addCriterion("sale_category <>", value, "sale_category");
            return (Criteria) this;
        }

        public Criteria andSale_categoryGreaterThan(Integer value) {
            addCriterion("sale_category >", value, "sale_category");
            return (Criteria) this;
        }

        public Criteria andSale_categoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_category >=", value, "sale_category");
            return (Criteria) this;
        }

        public Criteria andSale_categoryLessThan(Integer value) {
            addCriterion("sale_category <", value, "sale_category");
            return (Criteria) this;
        }

        public Criteria andSale_categoryLessThanOrEqualTo(Integer value) {
            addCriterion("sale_category <=", value, "sale_category");
            return (Criteria) this;
        }

        public Criteria andSale_categoryIn(List<Integer> values) {
            addCriterion("sale_category in", values, "sale_category");
            return (Criteria) this;
        }

        public Criteria andSale_categoryNotIn(List<Integer> values) {
            addCriterion("sale_category not in", values, "sale_category");
            return (Criteria) this;
        }

        public Criteria andSale_categoryBetween(Integer value1, Integer value2) {
            addCriterion("sale_category between", value1, value2, "sale_category");
            return (Criteria) this;
        }

        public Criteria andSale_categoryNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_category not between", value1, value2, "sale_category");
            return (Criteria) this;
        }

        public Criteria andIs_inblacklistIsNull() {
            addCriterion("is_inblacklist is null");
            return (Criteria) this;
        }

        public Criteria andIs_inblacklistIsNotNull() {
            addCriterion("is_inblacklist is not null");
            return (Criteria) this;
        }

        public Criteria andIs_inblacklistEqualTo(Integer value) {
            addCriterion("is_inblacklist =", value, "is_inblacklist");
            return (Criteria) this;
        }

        public Criteria andIs_inblacklistNotEqualTo(Integer value) {
            addCriterion("is_inblacklist <>", value, "is_inblacklist");
            return (Criteria) this;
        }

        public Criteria andIs_inblacklistGreaterThan(Integer value) {
            addCriterion("is_inblacklist >", value, "is_inblacklist");
            return (Criteria) this;
        }

        public Criteria andIs_inblacklistGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_inblacklist >=", value, "is_inblacklist");
            return (Criteria) this;
        }

        public Criteria andIs_inblacklistLessThan(Integer value) {
            addCriterion("is_inblacklist <", value, "is_inblacklist");
            return (Criteria) this;
        }

        public Criteria andIs_inblacklistLessThanOrEqualTo(Integer value) {
            addCriterion("is_inblacklist <=", value, "is_inblacklist");
            return (Criteria) this;
        }

        public Criteria andIs_inblacklistIn(List<Integer> values) {
            addCriterion("is_inblacklist in", values, "is_inblacklist");
            return (Criteria) this;
        }

        public Criteria andIs_inblacklistNotIn(List<Integer> values) {
            addCriterion("is_inblacklist not in", values, "is_inblacklist");
            return (Criteria) this;
        }

        public Criteria andIs_inblacklistBetween(Integer value1, Integer value2) {
            addCriterion("is_inblacklist between", value1, value2, "is_inblacklist");
            return (Criteria) this;
        }

        public Criteria andIs_inblacklistNotBetween(Integer value1, Integer value2) {
            addCriterion("is_inblacklist not between", value1, value2, "is_inblacklist");
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