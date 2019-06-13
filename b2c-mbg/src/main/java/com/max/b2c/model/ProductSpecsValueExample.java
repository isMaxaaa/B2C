package com.max.b2c.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSpecsValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSpecsValueExample() {
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

        public Criteria andValue_idIsNull() {
            addCriterion("value_id is null");
            return (Criteria) this;
        }

        public Criteria andValue_idIsNotNull() {
            addCriterion("value_id is not null");
            return (Criteria) this;
        }

        public Criteria andValue_idEqualTo(Integer value) {
            addCriterion("value_id =", value, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idNotEqualTo(Integer value) {
            addCriterion("value_id <>", value, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idGreaterThan(Integer value) {
            addCriterion("value_id >", value, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("value_id >=", value, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idLessThan(Integer value) {
            addCriterion("value_id <", value, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idLessThanOrEqualTo(Integer value) {
            addCriterion("value_id <=", value, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idIn(List<Integer> values) {
            addCriterion("value_id in", values, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idNotIn(List<Integer> values) {
            addCriterion("value_id not in", values, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idBetween(Integer value1, Integer value2) {
            addCriterion("value_id between", value1, value2, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idNotBetween(Integer value1, Integer value2) {
            addCriterion("value_id not between", value1, value2, "value_id");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueIsNull() {
            addCriterion("specs_value is null");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueIsNotNull() {
            addCriterion("specs_value is not null");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueEqualTo(String value) {
            addCriterion("specs_value =", value, "specs_value");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueNotEqualTo(String value) {
            addCriterion("specs_value <>", value, "specs_value");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueGreaterThan(String value) {
            addCriterion("specs_value >", value, "specs_value");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueGreaterThanOrEqualTo(String value) {
            addCriterion("specs_value >=", value, "specs_value");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueLessThan(String value) {
            addCriterion("specs_value <", value, "specs_value");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueLessThanOrEqualTo(String value) {
            addCriterion("specs_value <=", value, "specs_value");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueLike(String value) {
            addCriterion("specs_value like", value, "specs_value");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueNotLike(String value) {
            addCriterion("specs_value not like", value, "specs_value");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueIn(List<String> values) {
            addCriterion("specs_value in", values, "specs_value");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueNotIn(List<String> values) {
            addCriterion("specs_value not in", values, "specs_value");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueBetween(String value1, String value2) {
            addCriterion("specs_value between", value1, value2, "specs_value");
            return (Criteria) this;
        }

        public Criteria andSpecs_valueNotBetween(String value1, String value2) {
            addCriterion("specs_value not between", value1, value2, "specs_value");
            return (Criteria) this;
        }

        public Criteria andProduct_idIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProduct_idIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_idEqualTo(Integer value) {
            addCriterion("product_id =", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThan(Integer value) {
            addCriterion("product_id >", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThan(Integer value) {
            addCriterion("product_id <", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idIn(List<Integer> values) {
            addCriterion("product_id in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andSpecs_idIsNull() {
            addCriterion("specs_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecs_idIsNotNull() {
            addCriterion("specs_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecs_idEqualTo(Integer value) {
            addCriterion("specs_id =", value, "specs_id");
            return (Criteria) this;
        }

        public Criteria andSpecs_idNotEqualTo(Integer value) {
            addCriterion("specs_id <>", value, "specs_id");
            return (Criteria) this;
        }

        public Criteria andSpecs_idGreaterThan(Integer value) {
            addCriterion("specs_id >", value, "specs_id");
            return (Criteria) this;
        }

        public Criteria andSpecs_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("specs_id >=", value, "specs_id");
            return (Criteria) this;
        }

        public Criteria andSpecs_idLessThan(Integer value) {
            addCriterion("specs_id <", value, "specs_id");
            return (Criteria) this;
        }

        public Criteria andSpecs_idLessThanOrEqualTo(Integer value) {
            addCriterion("specs_id <=", value, "specs_id");
            return (Criteria) this;
        }

        public Criteria andSpecs_idIn(List<Integer> values) {
            addCriterion("specs_id in", values, "specs_id");
            return (Criteria) this;
        }

        public Criteria andSpecs_idNotIn(List<Integer> values) {
            addCriterion("specs_id not in", values, "specs_id");
            return (Criteria) this;
        }

        public Criteria andSpecs_idBetween(Integer value1, Integer value2) {
            addCriterion("specs_id between", value1, value2, "specs_id");
            return (Criteria) this;
        }

        public Criteria andSpecs_idNotBetween(Integer value1, Integer value2) {
            addCriterion("specs_id not between", value1, value2, "specs_id");
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

        public Criteria andIs_skuIsNull() {
            addCriterion("is_sku is null");
            return (Criteria) this;
        }

        public Criteria andIs_skuIsNotNull() {
            addCriterion("is_sku is not null");
            return (Criteria) this;
        }

        public Criteria andIs_skuEqualTo(Integer value) {
            addCriterion("is_sku =", value, "is_sku");
            return (Criteria) this;
        }

        public Criteria andIs_skuNotEqualTo(Integer value) {
            addCriterion("is_sku <>", value, "is_sku");
            return (Criteria) this;
        }

        public Criteria andIs_skuGreaterThan(Integer value) {
            addCriterion("is_sku >", value, "is_sku");
            return (Criteria) this;
        }

        public Criteria andIs_skuGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_sku >=", value, "is_sku");
            return (Criteria) this;
        }

        public Criteria andIs_skuLessThan(Integer value) {
            addCriterion("is_sku <", value, "is_sku");
            return (Criteria) this;
        }

        public Criteria andIs_skuLessThanOrEqualTo(Integer value) {
            addCriterion("is_sku <=", value, "is_sku");
            return (Criteria) this;
        }

        public Criteria andIs_skuIn(List<Integer> values) {
            addCriterion("is_sku in", values, "is_sku");
            return (Criteria) this;
        }

        public Criteria andIs_skuNotIn(List<Integer> values) {
            addCriterion("is_sku not in", values, "is_sku");
            return (Criteria) this;
        }

        public Criteria andIs_skuBetween(Integer value1, Integer value2) {
            addCriterion("is_sku between", value1, value2, "is_sku");
            return (Criteria) this;
        }

        public Criteria andIs_skuNotBetween(Integer value1, Integer value2) {
            addCriterion("is_sku not between", value1, value2, "is_sku");
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