package com.max.b2c.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSpecsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSpecsExample() {
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

        public Criteria andSpecs_nameIsNull() {
            addCriterion("specs_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecs_nameIsNotNull() {
            addCriterion("specs_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecs_nameEqualTo(String value) {
            addCriterion("specs_name =", value, "specs_name");
            return (Criteria) this;
        }

        public Criteria andSpecs_nameNotEqualTo(String value) {
            addCriterion("specs_name <>", value, "specs_name");
            return (Criteria) this;
        }

        public Criteria andSpecs_nameGreaterThan(String value) {
            addCriterion("specs_name >", value, "specs_name");
            return (Criteria) this;
        }

        public Criteria andSpecs_nameGreaterThanOrEqualTo(String value) {
            addCriterion("specs_name >=", value, "specs_name");
            return (Criteria) this;
        }

        public Criteria andSpecs_nameLessThan(String value) {
            addCriterion("specs_name <", value, "specs_name");
            return (Criteria) this;
        }

        public Criteria andSpecs_nameLessThanOrEqualTo(String value) {
            addCriterion("specs_name <=", value, "specs_name");
            return (Criteria) this;
        }

        public Criteria andSpecs_nameLike(String value) {
            addCriterion("specs_name like", value, "specs_name");
            return (Criteria) this;
        }

        public Criteria andSpecs_nameNotLike(String value) {
            addCriterion("specs_name not like", value, "specs_name");
            return (Criteria) this;
        }

        public Criteria andSpecs_nameIn(List<String> values) {
            addCriterion("specs_name in", values, "specs_name");
            return (Criteria) this;
        }

        public Criteria andSpecs_nameNotIn(List<String> values) {
            addCriterion("specs_name not in", values, "specs_name");
            return (Criteria) this;
        }

        public Criteria andSpecs_nameBetween(String value1, String value2) {
            addCriterion("specs_name between", value1, value2, "specs_name");
            return (Criteria) this;
        }

        public Criteria andSpecs_nameNotBetween(String value1, String value2) {
            addCriterion("specs_name not between", value1, value2, "specs_name");
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

        public Criteria andIs_searchedIsNull() {
            addCriterion("is_searched is null");
            return (Criteria) this;
        }

        public Criteria andIs_searchedIsNotNull() {
            addCriterion("is_searched is not null");
            return (Criteria) this;
        }

        public Criteria andIs_searchedEqualTo(Integer value) {
            addCriterion("is_searched =", value, "is_searched");
            return (Criteria) this;
        }

        public Criteria andIs_searchedNotEqualTo(Integer value) {
            addCriterion("is_searched <>", value, "is_searched");
            return (Criteria) this;
        }

        public Criteria andIs_searchedGreaterThan(Integer value) {
            addCriterion("is_searched >", value, "is_searched");
            return (Criteria) this;
        }

        public Criteria andIs_searchedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_searched >=", value, "is_searched");
            return (Criteria) this;
        }

        public Criteria andIs_searchedLessThan(Integer value) {
            addCriterion("is_searched <", value, "is_searched");
            return (Criteria) this;
        }

        public Criteria andIs_searchedLessThanOrEqualTo(Integer value) {
            addCriterion("is_searched <=", value, "is_searched");
            return (Criteria) this;
        }

        public Criteria andIs_searchedIn(List<Integer> values) {
            addCriterion("is_searched in", values, "is_searched");
            return (Criteria) this;
        }

        public Criteria andIs_searchedNotIn(List<Integer> values) {
            addCriterion("is_searched not in", values, "is_searched");
            return (Criteria) this;
        }

        public Criteria andIs_searchedBetween(Integer value1, Integer value2) {
            addCriterion("is_searched between", value1, value2, "is_searched");
            return (Criteria) this;
        }

        public Criteria andIs_searchedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_searched not between", value1, value2, "is_searched");
            return (Criteria) this;
        }

        public Criteria andIs_saledIsNull() {
            addCriterion("is_saled is null");
            return (Criteria) this;
        }

        public Criteria andIs_saledIsNotNull() {
            addCriterion("is_saled is not null");
            return (Criteria) this;
        }

        public Criteria andIs_saledEqualTo(Integer value) {
            addCriterion("is_saled =", value, "is_saled");
            return (Criteria) this;
        }

        public Criteria andIs_saledNotEqualTo(Integer value) {
            addCriterion("is_saled <>", value, "is_saled");
            return (Criteria) this;
        }

        public Criteria andIs_saledGreaterThan(Integer value) {
            addCriterion("is_saled >", value, "is_saled");
            return (Criteria) this;
        }

        public Criteria andIs_saledGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_saled >=", value, "is_saled");
            return (Criteria) this;
        }

        public Criteria andIs_saledLessThan(Integer value) {
            addCriterion("is_saled <", value, "is_saled");
            return (Criteria) this;
        }

        public Criteria andIs_saledLessThanOrEqualTo(Integer value) {
            addCriterion("is_saled <=", value, "is_saled");
            return (Criteria) this;
        }

        public Criteria andIs_saledIn(List<Integer> values) {
            addCriterion("is_saled in", values, "is_saled");
            return (Criteria) this;
        }

        public Criteria andIs_saledNotIn(List<Integer> values) {
            addCriterion("is_saled not in", values, "is_saled");
            return (Criteria) this;
        }

        public Criteria andIs_saledBetween(Integer value1, Integer value2) {
            addCriterion("is_saled between", value1, value2, "is_saled");
            return (Criteria) this;
        }

        public Criteria andIs_saledNotBetween(Integer value1, Integer value2) {
            addCriterion("is_saled not between", value1, value2, "is_saled");
            return (Criteria) this;
        }

        public Criteria andCategory_idIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory_idIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_idEqualTo(Integer value) {
            addCriterion("category_id =", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idGreaterThan(Integer value) {
            addCriterion("category_id >", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idLessThan(Integer value) {
            addCriterion("category_id <", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idIn(List<Integer> values) {
            addCriterion("category_id in", values, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "category_id");
            return (Criteria) this;
        }

        public Criteria andSortidIsNull() {
            addCriterion("sortid is null");
            return (Criteria) this;
        }

        public Criteria andSortidIsNotNull() {
            addCriterion("sortid is not null");
            return (Criteria) this;
        }

        public Criteria andSortidEqualTo(Integer value) {
            addCriterion("sortid =", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotEqualTo(Integer value) {
            addCriterion("sortid <>", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThan(Integer value) {
            addCriterion("sortid >", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortid >=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThan(Integer value) {
            addCriterion("sortid <", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThanOrEqualTo(Integer value) {
            addCriterion("sortid <=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidIn(List<Integer> values) {
            addCriterion("sortid in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotIn(List<Integer> values) {
            addCriterion("sortid not in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidBetween(Integer value1, Integer value2) {
            addCriterion("sortid between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotBetween(Integer value1, Integer value2) {
            addCriterion("sortid not between", value1, value2, "sortid");
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