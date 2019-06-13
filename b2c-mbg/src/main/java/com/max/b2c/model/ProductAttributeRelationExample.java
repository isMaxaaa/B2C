package com.max.b2c.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductAttributeRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductAttributeRelationExample() {
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

        public Criteria andAttribute_idIsNull() {
            addCriterion("attribute_id is null");
            return (Criteria) this;
        }

        public Criteria andAttribute_idIsNotNull() {
            addCriterion("attribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute_idEqualTo(Integer value) {
            addCriterion("attribute_id =", value, "attribute_id");
            return (Criteria) this;
        }

        public Criteria andAttribute_idNotEqualTo(Integer value) {
            addCriterion("attribute_id <>", value, "attribute_id");
            return (Criteria) this;
        }

        public Criteria andAttribute_idGreaterThan(Integer value) {
            addCriterion("attribute_id >", value, "attribute_id");
            return (Criteria) this;
        }

        public Criteria andAttribute_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("attribute_id >=", value, "attribute_id");
            return (Criteria) this;
        }

        public Criteria andAttribute_idLessThan(Integer value) {
            addCriterion("attribute_id <", value, "attribute_id");
            return (Criteria) this;
        }

        public Criteria andAttribute_idLessThanOrEqualTo(Integer value) {
            addCriterion("attribute_id <=", value, "attribute_id");
            return (Criteria) this;
        }

        public Criteria andAttribute_idIn(List<Integer> values) {
            addCriterion("attribute_id in", values, "attribute_id");
            return (Criteria) this;
        }

        public Criteria andAttribute_idNotIn(List<Integer> values) {
            addCriterion("attribute_id not in", values, "attribute_id");
            return (Criteria) this;
        }

        public Criteria andAttribute_idBetween(Integer value1, Integer value2) {
            addCriterion("attribute_id between", value1, value2, "attribute_id");
            return (Criteria) this;
        }

        public Criteria andAttribute_idNotBetween(Integer value1, Integer value2) {
            addCriterion("attribute_id not between", value1, value2, "attribute_id");
            return (Criteria) this;
        }

        public Criteria andProductspu_idIsNull() {
            addCriterion("productspu_id is null");
            return (Criteria) this;
        }

        public Criteria andProductspu_idIsNotNull() {
            addCriterion("productspu_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductspu_idEqualTo(Integer value) {
            addCriterion("productspu_id =", value, "productspu_id");
            return (Criteria) this;
        }

        public Criteria andProductspu_idNotEqualTo(Integer value) {
            addCriterion("productspu_id <>", value, "productspu_id");
            return (Criteria) this;
        }

        public Criteria andProductspu_idGreaterThan(Integer value) {
            addCriterion("productspu_id >", value, "productspu_id");
            return (Criteria) this;
        }

        public Criteria andProductspu_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("productspu_id >=", value, "productspu_id");
            return (Criteria) this;
        }

        public Criteria andProductspu_idLessThan(Integer value) {
            addCriterion("productspu_id <", value, "productspu_id");
            return (Criteria) this;
        }

        public Criteria andProductspu_idLessThanOrEqualTo(Integer value) {
            addCriterion("productspu_id <=", value, "productspu_id");
            return (Criteria) this;
        }

        public Criteria andProductspu_idIn(List<Integer> values) {
            addCriterion("productspu_id in", values, "productspu_id");
            return (Criteria) this;
        }

        public Criteria andProductspu_idNotIn(List<Integer> values) {
            addCriterion("productspu_id not in", values, "productspu_id");
            return (Criteria) this;
        }

        public Criteria andProductspu_idBetween(Integer value1, Integer value2) {
            addCriterion("productspu_id between", value1, value2, "productspu_id");
            return (Criteria) this;
        }

        public Criteria andProductspu_idNotBetween(Integer value1, Integer value2) {
            addCriterion("productspu_id not between", value1, value2, "productspu_id");
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

        public Criteria andAttributevalue_idIsNull() {
            addCriterion("attributevalue_id is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue_idIsNotNull() {
            addCriterion("attributevalue_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalue_idEqualTo(Integer value) {
            addCriterion("attributevalue_id =", value, "attributevalue_id");
            return (Criteria) this;
        }

        public Criteria andAttributevalue_idNotEqualTo(Integer value) {
            addCriterion("attributevalue_id <>", value, "attributevalue_id");
            return (Criteria) this;
        }

        public Criteria andAttributevalue_idGreaterThan(Integer value) {
            addCriterion("attributevalue_id >", value, "attributevalue_id");
            return (Criteria) this;
        }

        public Criteria andAttributevalue_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("attributevalue_id >=", value, "attributevalue_id");
            return (Criteria) this;
        }

        public Criteria andAttributevalue_idLessThan(Integer value) {
            addCriterion("attributevalue_id <", value, "attributevalue_id");
            return (Criteria) this;
        }

        public Criteria andAttributevalue_idLessThanOrEqualTo(Integer value) {
            addCriterion("attributevalue_id <=", value, "attributevalue_id");
            return (Criteria) this;
        }

        public Criteria andAttributevalue_idIn(List<Integer> values) {
            addCriterion("attributevalue_id in", values, "attributevalue_id");
            return (Criteria) this;
        }

        public Criteria andAttributevalue_idNotIn(List<Integer> values) {
            addCriterion("attributevalue_id not in", values, "attributevalue_id");
            return (Criteria) this;
        }

        public Criteria andAttributevalue_idBetween(Integer value1, Integer value2) {
            addCriterion("attributevalue_id between", value1, value2, "attributevalue_id");
            return (Criteria) this;
        }

        public Criteria andAttributevalue_idNotBetween(Integer value1, Integer value2) {
            addCriterion("attributevalue_id not between", value1, value2, "attributevalue_id");
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