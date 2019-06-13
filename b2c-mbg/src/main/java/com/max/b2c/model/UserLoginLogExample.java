package com.max.b2c.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLoginLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLoginLogExample() {
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

        public Criteria andLog_idIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLog_idIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLog_idEqualTo(Integer value) {
            addCriterion("log_id =", value, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idGreaterThan(Integer value) {
            addCriterion("log_id >", value, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idLessThan(Integer value) {
            addCriterion("log_id <", value, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idIn(List<Integer> values) {
            addCriterion("log_id in", values, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "log_id");
            return (Criteria) this;
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

        public Criteria andLogin_timeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLogin_timeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogin_timeEqualTo(Date value) {
            addCriterion("login_time =", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeGreaterThan(Date value) {
            addCriterion("login_time >", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeLessThan(Date value) {
            addCriterion("login_time <", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeIn(List<Date> values) {
            addCriterion("login_time in", values, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogin_timeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "login_time");
            return (Criteria) this;
        }

        public Criteria andLogout_timeIsNull() {
            addCriterion("logout_time is null");
            return (Criteria) this;
        }

        public Criteria andLogout_timeIsNotNull() {
            addCriterion("logout_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogout_timeEqualTo(Date value) {
            addCriterion("logout_time =", value, "logout_time");
            return (Criteria) this;
        }

        public Criteria andLogout_timeNotEqualTo(Date value) {
            addCriterion("logout_time <>", value, "logout_time");
            return (Criteria) this;
        }

        public Criteria andLogout_timeGreaterThan(Date value) {
            addCriterion("logout_time >", value, "logout_time");
            return (Criteria) this;
        }

        public Criteria andLogout_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("logout_time >=", value, "logout_time");
            return (Criteria) this;
        }

        public Criteria andLogout_timeLessThan(Date value) {
            addCriterion("logout_time <", value, "logout_time");
            return (Criteria) this;
        }

        public Criteria andLogout_timeLessThanOrEqualTo(Date value) {
            addCriterion("logout_time <=", value, "logout_time");
            return (Criteria) this;
        }

        public Criteria andLogout_timeIn(List<Date> values) {
            addCriterion("logout_time in", values, "logout_time");
            return (Criteria) this;
        }

        public Criteria andLogout_timeNotIn(List<Date> values) {
            addCriterion("logout_time not in", values, "logout_time");
            return (Criteria) this;
        }

        public Criteria andLogout_timeBetween(Date value1, Date value2) {
            addCriterion("logout_time between", value1, value2, "logout_time");
            return (Criteria) this;
        }

        public Criteria andLogout_timeNotBetween(Date value1, Date value2) {
            addCriterion("logout_time not between", value1, value2, "logout_time");
            return (Criteria) this;
        }

        public Criteria andLogin_ipIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLogin_ipIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLogin_ipEqualTo(Integer value) {
            addCriterion("login_ip =", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipNotEqualTo(Integer value) {
            addCriterion("login_ip <>", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipGreaterThan(Integer value) {
            addCriterion("login_ip >", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_ip >=", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipLessThan(Integer value) {
            addCriterion("login_ip <", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipLessThanOrEqualTo(Integer value) {
            addCriterion("login_ip <=", value, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipIn(List<Integer> values) {
            addCriterion("login_ip in", values, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipNotIn(List<Integer> values) {
            addCriterion("login_ip not in", values, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipBetween(Integer value1, Integer value2) {
            addCriterion("login_ip between", value1, value2, "login_ip");
            return (Criteria) this;
        }

        public Criteria andLogin_ipNotBetween(Integer value1, Integer value2) {
            addCriterion("login_ip not between", value1, value2, "login_ip");
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