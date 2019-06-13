package com.max.b2c.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductImgExample() {
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

        public Criteria andImg_idIsNull() {
            addCriterion("img_id is null");
            return (Criteria) this;
        }

        public Criteria andImg_idIsNotNull() {
            addCriterion("img_id is not null");
            return (Criteria) this;
        }

        public Criteria andImg_idEqualTo(Integer value) {
            addCriterion("img_id =", value, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idNotEqualTo(Integer value) {
            addCriterion("img_id <>", value, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idGreaterThan(Integer value) {
            addCriterion("img_id >", value, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_id >=", value, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idLessThan(Integer value) {
            addCriterion("img_id <", value, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idLessThanOrEqualTo(Integer value) {
            addCriterion("img_id <=", value, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idIn(List<Integer> values) {
            addCriterion("img_id in", values, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idNotIn(List<Integer> values) {
            addCriterion("img_id not in", values, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idBetween(Integer value1, Integer value2) {
            addCriterion("img_id between", value1, value2, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idNotBetween(Integer value1, Integer value2) {
            addCriterion("img_id not between", value1, value2, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_urlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImg_urlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImg_urlEqualTo(String value) {
            addCriterion("img_url =", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlGreaterThan(String value) {
            addCriterion("img_url >", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlLessThan(String value) {
            addCriterion("img_url <", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlLike(String value) {
            addCriterion("img_url like", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotLike(String value) {
            addCriterion("img_url not like", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlIn(List<String> values) {
            addCriterion("img_url in", values, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "img_url");
            return (Criteria) this;
        }

        public Criteria andIs_mainimgIsNull() {
            addCriterion("is_mainimg is null");
            return (Criteria) this;
        }

        public Criteria andIs_mainimgIsNotNull() {
            addCriterion("is_mainimg is not null");
            return (Criteria) this;
        }

        public Criteria andIs_mainimgEqualTo(Integer value) {
            addCriterion("is_mainimg =", value, "is_mainimg");
            return (Criteria) this;
        }

        public Criteria andIs_mainimgNotEqualTo(Integer value) {
            addCriterion("is_mainimg <>", value, "is_mainimg");
            return (Criteria) this;
        }

        public Criteria andIs_mainimgGreaterThan(Integer value) {
            addCriterion("is_mainimg >", value, "is_mainimg");
            return (Criteria) this;
        }

        public Criteria andIs_mainimgGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_mainimg >=", value, "is_mainimg");
            return (Criteria) this;
        }

        public Criteria andIs_mainimgLessThan(Integer value) {
            addCriterion("is_mainimg <", value, "is_mainimg");
            return (Criteria) this;
        }

        public Criteria andIs_mainimgLessThanOrEqualTo(Integer value) {
            addCriterion("is_mainimg <=", value, "is_mainimg");
            return (Criteria) this;
        }

        public Criteria andIs_mainimgIn(List<Integer> values) {
            addCriterion("is_mainimg in", values, "is_mainimg");
            return (Criteria) this;
        }

        public Criteria andIs_mainimgNotIn(List<Integer> values) {
            addCriterion("is_mainimg not in", values, "is_mainimg");
            return (Criteria) this;
        }

        public Criteria andIs_mainimgBetween(Integer value1, Integer value2) {
            addCriterion("is_mainimg between", value1, value2, "is_mainimg");
            return (Criteria) this;
        }

        public Criteria andIs_mainimgNotBetween(Integer value1, Integer value2) {
            addCriterion("is_mainimg not between", value1, value2, "is_mainimg");
            return (Criteria) this;
        }

        public Criteria andSpu_idIsNull() {
            addCriterion("spu_id is null");
            return (Criteria) this;
        }

        public Criteria andSpu_idIsNotNull() {
            addCriterion("spu_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpu_idEqualTo(Integer value) {
            addCriterion("spu_id =", value, "spu_id");
            return (Criteria) this;
        }

        public Criteria andSpu_idNotEqualTo(Integer value) {
            addCriterion("spu_id <>", value, "spu_id");
            return (Criteria) this;
        }

        public Criteria andSpu_idGreaterThan(Integer value) {
            addCriterion("spu_id >", value, "spu_id");
            return (Criteria) this;
        }

        public Criteria andSpu_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("spu_id >=", value, "spu_id");
            return (Criteria) this;
        }

        public Criteria andSpu_idLessThan(Integer value) {
            addCriterion("spu_id <", value, "spu_id");
            return (Criteria) this;
        }

        public Criteria andSpu_idLessThanOrEqualTo(Integer value) {
            addCriterion("spu_id <=", value, "spu_id");
            return (Criteria) this;
        }

        public Criteria andSpu_idIn(List<Integer> values) {
            addCriterion("spu_id in", values, "spu_id");
            return (Criteria) this;
        }

        public Criteria andSpu_idNotIn(List<Integer> values) {
            addCriterion("spu_id not in", values, "spu_id");
            return (Criteria) this;
        }

        public Criteria andSpu_idBetween(Integer value1, Integer value2) {
            addCriterion("spu_id between", value1, value2, "spu_id");
            return (Criteria) this;
        }

        public Criteria andSpu_idNotBetween(Integer value1, Integer value2) {
            addCriterion("spu_id not between", value1, value2, "spu_id");
            return (Criteria) this;
        }

        public Criteria andSku_idIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSku_idIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSku_idEqualTo(Integer value) {
            addCriterion("sku_id =", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idNotEqualTo(Integer value) {
            addCriterion("sku_id <>", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idGreaterThan(Integer value) {
            addCriterion("sku_id >", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_id >=", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idLessThan(Integer value) {
            addCriterion("sku_id <", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idLessThanOrEqualTo(Integer value) {
            addCriterion("sku_id <=", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idIn(List<Integer> values) {
            addCriterion("sku_id in", values, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idNotIn(List<Integer> values) {
            addCriterion("sku_id not in", values, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idBetween(Integer value1, Integer value2) {
            addCriterion("sku_id between", value1, value2, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_id not between", value1, value2, "sku_id");
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