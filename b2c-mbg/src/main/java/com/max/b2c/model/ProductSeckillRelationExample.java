package com.max.b2c.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSeckillRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSeckillRelationExample() {
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

        public Criteria andProduct_spuidIsNull() {
            addCriterion("product_spuid is null");
            return (Criteria) this;
        }

        public Criteria andProduct_spuidIsNotNull() {
            addCriterion("product_spuid is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_spuidEqualTo(Integer value) {
            addCriterion("product_spuid =", value, "product_spuid");
            return (Criteria) this;
        }

        public Criteria andProduct_spuidNotEqualTo(Integer value) {
            addCriterion("product_spuid <>", value, "product_spuid");
            return (Criteria) this;
        }

        public Criteria andProduct_spuidGreaterThan(Integer value) {
            addCriterion("product_spuid >", value, "product_spuid");
            return (Criteria) this;
        }

        public Criteria andProduct_spuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_spuid >=", value, "product_spuid");
            return (Criteria) this;
        }

        public Criteria andProduct_spuidLessThan(Integer value) {
            addCriterion("product_spuid <", value, "product_spuid");
            return (Criteria) this;
        }

        public Criteria andProduct_spuidLessThanOrEqualTo(Integer value) {
            addCriterion("product_spuid <=", value, "product_spuid");
            return (Criteria) this;
        }

        public Criteria andProduct_spuidIn(List<Integer> values) {
            addCriterion("product_spuid in", values, "product_spuid");
            return (Criteria) this;
        }

        public Criteria andProduct_spuidNotIn(List<Integer> values) {
            addCriterion("product_spuid not in", values, "product_spuid");
            return (Criteria) this;
        }

        public Criteria andProduct_spuidBetween(Integer value1, Integer value2) {
            addCriterion("product_spuid between", value1, value2, "product_spuid");
            return (Criteria) this;
        }

        public Criteria andProduct_spuidNotBetween(Integer value1, Integer value2) {
            addCriterion("product_spuid not between", value1, value2, "product_spuid");
            return (Criteria) this;
        }

        public Criteria andProduct_skuidIsNull() {
            addCriterion("product_skuid is null");
            return (Criteria) this;
        }

        public Criteria andProduct_skuidIsNotNull() {
            addCriterion("product_skuid is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_skuidEqualTo(Integer value) {
            addCriterion("product_skuid =", value, "product_skuid");
            return (Criteria) this;
        }

        public Criteria andProduct_skuidNotEqualTo(Integer value) {
            addCriterion("product_skuid <>", value, "product_skuid");
            return (Criteria) this;
        }

        public Criteria andProduct_skuidGreaterThan(Integer value) {
            addCriterion("product_skuid >", value, "product_skuid");
            return (Criteria) this;
        }

        public Criteria andProduct_skuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_skuid >=", value, "product_skuid");
            return (Criteria) this;
        }

        public Criteria andProduct_skuidLessThan(Integer value) {
            addCriterion("product_skuid <", value, "product_skuid");
            return (Criteria) this;
        }

        public Criteria andProduct_skuidLessThanOrEqualTo(Integer value) {
            addCriterion("product_skuid <=", value, "product_skuid");
            return (Criteria) this;
        }

        public Criteria andProduct_skuidIn(List<Integer> values) {
            addCriterion("product_skuid in", values, "product_skuid");
            return (Criteria) this;
        }

        public Criteria andProduct_skuidNotIn(List<Integer> values) {
            addCriterion("product_skuid not in", values, "product_skuid");
            return (Criteria) this;
        }

        public Criteria andProduct_skuidBetween(Integer value1, Integer value2) {
            addCriterion("product_skuid between", value1, value2, "product_skuid");
            return (Criteria) this;
        }

        public Criteria andProduct_skuidNotBetween(Integer value1, Integer value2) {
            addCriterion("product_skuid not between", value1, value2, "product_skuid");
            return (Criteria) this;
        }

        public Criteria andSeckill_idIsNull() {
            addCriterion("seckill_id is null");
            return (Criteria) this;
        }

        public Criteria andSeckill_idIsNotNull() {
            addCriterion("seckill_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeckill_idEqualTo(Integer value) {
            addCriterion("seckill_id =", value, "seckill_id");
            return (Criteria) this;
        }

        public Criteria andSeckill_idNotEqualTo(Integer value) {
            addCriterion("seckill_id <>", value, "seckill_id");
            return (Criteria) this;
        }

        public Criteria andSeckill_idGreaterThan(Integer value) {
            addCriterion("seckill_id >", value, "seckill_id");
            return (Criteria) this;
        }

        public Criteria andSeckill_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("seckill_id >=", value, "seckill_id");
            return (Criteria) this;
        }

        public Criteria andSeckill_idLessThan(Integer value) {
            addCriterion("seckill_id <", value, "seckill_id");
            return (Criteria) this;
        }

        public Criteria andSeckill_idLessThanOrEqualTo(Integer value) {
            addCriterion("seckill_id <=", value, "seckill_id");
            return (Criteria) this;
        }

        public Criteria andSeckill_idIn(List<Integer> values) {
            addCriterion("seckill_id in", values, "seckill_id");
            return (Criteria) this;
        }

        public Criteria andSeckill_idNotIn(List<Integer> values) {
            addCriterion("seckill_id not in", values, "seckill_id");
            return (Criteria) this;
        }

        public Criteria andSeckill_idBetween(Integer value1, Integer value2) {
            addCriterion("seckill_id between", value1, value2, "seckill_id");
            return (Criteria) this;
        }

        public Criteria andSeckill_idNotBetween(Integer value1, Integer value2) {
            addCriterion("seckill_id not between", value1, value2, "seckill_id");
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