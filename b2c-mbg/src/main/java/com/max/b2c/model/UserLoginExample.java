package com.max.b2c.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLoginExample() {
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

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordEqualTo(String value) {
            addCriterion("user_password =", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThan(String value) {
            addCriterion("user_password >", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThan(String value) {
            addCriterion("user_password <", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLike(String value) {
            addCriterion("user_password like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotLike(String value) {
            addCriterion("user_password not like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIn(List<String> values) {
            addCriterion("user_password in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_emailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUser_emailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUser_emailEqualTo(String value) {
            addCriterion("user_email =", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailGreaterThan(String value) {
            addCriterion("user_email >", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailLessThan(String value) {
            addCriterion("user_email <", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailLike(String value) {
            addCriterion("user_email like", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotLike(String value) {
            addCriterion("user_email not like", value, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailIn(List<String> values) {
            addCriterion("user_email in", values, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_emailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "user_email");
            return (Criteria) this;
        }

        public Criteria andUser_phoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUser_phoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUser_phoneEqualTo(String value) {
            addCriterion("user_phone =", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneLessThan(String value) {
            addCriterion("user_phone <", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneLike(String value) {
            addCriterion("user_phone like", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotLike(String value) {
            addCriterion("user_phone not like", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneIn(List<String> values) {
            addCriterion("user_phone in", values, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "user_phone");
            return (Criteria) this;
        }

        public Criteria andIs_loggedIsNull() {
            addCriterion("is_logged is null");
            return (Criteria) this;
        }

        public Criteria andIs_loggedIsNotNull() {
            addCriterion("is_logged is not null");
            return (Criteria) this;
        }

        public Criteria andIs_loggedEqualTo(Integer value) {
            addCriterion("is_logged =", value, "is_logged");
            return (Criteria) this;
        }

        public Criteria andIs_loggedNotEqualTo(Integer value) {
            addCriterion("is_logged <>", value, "is_logged");
            return (Criteria) this;
        }

        public Criteria andIs_loggedGreaterThan(Integer value) {
            addCriterion("is_logged >", value, "is_logged");
            return (Criteria) this;
        }

        public Criteria andIs_loggedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_logged >=", value, "is_logged");
            return (Criteria) this;
        }

        public Criteria andIs_loggedLessThan(Integer value) {
            addCriterion("is_logged <", value, "is_logged");
            return (Criteria) this;
        }

        public Criteria andIs_loggedLessThanOrEqualTo(Integer value) {
            addCriterion("is_logged <=", value, "is_logged");
            return (Criteria) this;
        }

        public Criteria andIs_loggedIn(List<Integer> values) {
            addCriterion("is_logged in", values, "is_logged");
            return (Criteria) this;
        }

        public Criteria andIs_loggedNotIn(List<Integer> values) {
            addCriterion("is_logged not in", values, "is_logged");
            return (Criteria) this;
        }

        public Criteria andIs_loggedBetween(Integer value1, Integer value2) {
            addCriterion("is_logged between", value1, value2, "is_logged");
            return (Criteria) this;
        }

        public Criteria andIs_loggedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_logged not between", value1, value2, "is_logged");
            return (Criteria) this;
        }

        public Criteria andLogging_ipIsNull() {
            addCriterion("logging_ip is null");
            return (Criteria) this;
        }

        public Criteria andLogging_ipIsNotNull() {
            addCriterion("logging_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLogging_ipEqualTo(Integer value) {
            addCriterion("logging_ip =", value, "logging_ip");
            return (Criteria) this;
        }

        public Criteria andLogging_ipNotEqualTo(Integer value) {
            addCriterion("logging_ip <>", value, "logging_ip");
            return (Criteria) this;
        }

        public Criteria andLogging_ipGreaterThan(Integer value) {
            addCriterion("logging_ip >", value, "logging_ip");
            return (Criteria) this;
        }

        public Criteria andLogging_ipGreaterThanOrEqualTo(Integer value) {
            addCriterion("logging_ip >=", value, "logging_ip");
            return (Criteria) this;
        }

        public Criteria andLogging_ipLessThan(Integer value) {
            addCriterion("logging_ip <", value, "logging_ip");
            return (Criteria) this;
        }

        public Criteria andLogging_ipLessThanOrEqualTo(Integer value) {
            addCriterion("logging_ip <=", value, "logging_ip");
            return (Criteria) this;
        }

        public Criteria andLogging_ipIn(List<Integer> values) {
            addCriterion("logging_ip in", values, "logging_ip");
            return (Criteria) this;
        }

        public Criteria andLogging_ipNotIn(List<Integer> values) {
            addCriterion("logging_ip not in", values, "logging_ip");
            return (Criteria) this;
        }

        public Criteria andLogging_ipBetween(Integer value1, Integer value2) {
            addCriterion("logging_ip between", value1, value2, "logging_ip");
            return (Criteria) this;
        }

        public Criteria andLogging_ipNotBetween(Integer value1, Integer value2) {
            addCriterion("logging_ip not between", value1, value2, "logging_ip");
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

        public Criteria andUser_roleIsNull() {
            addCriterion("user_role is null");
            return (Criteria) this;
        }

        public Criteria andUser_roleIsNotNull() {
            addCriterion("user_role is not null");
            return (Criteria) this;
        }

        public Criteria andUser_roleEqualTo(Integer value) {
            addCriterion("user_role =", value, "user_role");
            return (Criteria) this;
        }

        public Criteria andUser_roleNotEqualTo(Integer value) {
            addCriterion("user_role <>", value, "user_role");
            return (Criteria) this;
        }

        public Criteria andUser_roleGreaterThan(Integer value) {
            addCriterion("user_role >", value, "user_role");
            return (Criteria) this;
        }

        public Criteria andUser_roleGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_role >=", value, "user_role");
            return (Criteria) this;
        }

        public Criteria andUser_roleLessThan(Integer value) {
            addCriterion("user_role <", value, "user_role");
            return (Criteria) this;
        }

        public Criteria andUser_roleLessThanOrEqualTo(Integer value) {
            addCriterion("user_role <=", value, "user_role");
            return (Criteria) this;
        }

        public Criteria andUser_roleIn(List<Integer> values) {
            addCriterion("user_role in", values, "user_role");
            return (Criteria) this;
        }

        public Criteria andUser_roleNotIn(List<Integer> values) {
            addCriterion("user_role not in", values, "user_role");
            return (Criteria) this;
        }

        public Criteria andUser_roleBetween(Integer value1, Integer value2) {
            addCriterion("user_role between", value1, value2, "user_role");
            return (Criteria) this;
        }

        public Criteria andUser_roleNotBetween(Integer value1, Integer value2) {
            addCriterion("user_role not between", value1, value2, "user_role");
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