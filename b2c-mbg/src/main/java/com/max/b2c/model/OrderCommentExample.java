package com.max.b2c.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderCommentExample() {
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

        public Criteria andComment_idIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andComment_idIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andComment_idEqualTo(Integer value) {
            addCriterion("comment_id =", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idLessThan(Integer value) {
            addCriterion("comment_id <", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idIn(List<Integer> values) {
            addCriterion("comment_id in", values, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "comment_id");
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

        public Criteria andComment_detailIsNull() {
            addCriterion("comment_detail is null");
            return (Criteria) this;
        }

        public Criteria andComment_detailIsNotNull() {
            addCriterion("comment_detail is not null");
            return (Criteria) this;
        }

        public Criteria andComment_detailEqualTo(String value) {
            addCriterion("comment_detail =", value, "comment_detail");
            return (Criteria) this;
        }

        public Criteria andComment_detailNotEqualTo(String value) {
            addCriterion("comment_detail <>", value, "comment_detail");
            return (Criteria) this;
        }

        public Criteria andComment_detailGreaterThan(String value) {
            addCriterion("comment_detail >", value, "comment_detail");
            return (Criteria) this;
        }

        public Criteria andComment_detailGreaterThanOrEqualTo(String value) {
            addCriterion("comment_detail >=", value, "comment_detail");
            return (Criteria) this;
        }

        public Criteria andComment_detailLessThan(String value) {
            addCriterion("comment_detail <", value, "comment_detail");
            return (Criteria) this;
        }

        public Criteria andComment_detailLessThanOrEqualTo(String value) {
            addCriterion("comment_detail <=", value, "comment_detail");
            return (Criteria) this;
        }

        public Criteria andComment_detailLike(String value) {
            addCriterion("comment_detail like", value, "comment_detail");
            return (Criteria) this;
        }

        public Criteria andComment_detailNotLike(String value) {
            addCriterion("comment_detail not like", value, "comment_detail");
            return (Criteria) this;
        }

        public Criteria andComment_detailIn(List<String> values) {
            addCriterion("comment_detail in", values, "comment_detail");
            return (Criteria) this;
        }

        public Criteria andComment_detailNotIn(List<String> values) {
            addCriterion("comment_detail not in", values, "comment_detail");
            return (Criteria) this;
        }

        public Criteria andComment_detailBetween(String value1, String value2) {
            addCriterion("comment_detail between", value1, value2, "comment_detail");
            return (Criteria) this;
        }

        public Criteria andComment_detailNotBetween(String value1, String value2) {
            addCriterion("comment_detail not between", value1, value2, "comment_detail");
            return (Criteria) this;
        }

        public Criteria andService_scoreIsNull() {
            addCriterion("service_score is null");
            return (Criteria) this;
        }

        public Criteria andService_scoreIsNotNull() {
            addCriterion("service_score is not null");
            return (Criteria) this;
        }

        public Criteria andService_scoreEqualTo(Integer value) {
            addCriterion("service_score =", value, "service_score");
            return (Criteria) this;
        }

        public Criteria andService_scoreNotEqualTo(Integer value) {
            addCriterion("service_score <>", value, "service_score");
            return (Criteria) this;
        }

        public Criteria andService_scoreGreaterThan(Integer value) {
            addCriterion("service_score >", value, "service_score");
            return (Criteria) this;
        }

        public Criteria andService_scoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_score >=", value, "service_score");
            return (Criteria) this;
        }

        public Criteria andService_scoreLessThan(Integer value) {
            addCriterion("service_score <", value, "service_score");
            return (Criteria) this;
        }

        public Criteria andService_scoreLessThanOrEqualTo(Integer value) {
            addCriterion("service_score <=", value, "service_score");
            return (Criteria) this;
        }

        public Criteria andService_scoreIn(List<Integer> values) {
            addCriterion("service_score in", values, "service_score");
            return (Criteria) this;
        }

        public Criteria andService_scoreNotIn(List<Integer> values) {
            addCriterion("service_score not in", values, "service_score");
            return (Criteria) this;
        }

        public Criteria andService_scoreBetween(Integer value1, Integer value2) {
            addCriterion("service_score between", value1, value2, "service_score");
            return (Criteria) this;
        }

        public Criteria andService_scoreNotBetween(Integer value1, Integer value2) {
            addCriterion("service_score not between", value1, value2, "service_score");
            return (Criteria) this;
        }

        public Criteria andQuality_scoreIsNull() {
            addCriterion("quality_score is null");
            return (Criteria) this;
        }

        public Criteria andQuality_scoreIsNotNull() {
            addCriterion("quality_score is not null");
            return (Criteria) this;
        }

        public Criteria andQuality_scoreEqualTo(Integer value) {
            addCriterion("quality_score =", value, "quality_score");
            return (Criteria) this;
        }

        public Criteria andQuality_scoreNotEqualTo(Integer value) {
            addCriterion("quality_score <>", value, "quality_score");
            return (Criteria) this;
        }

        public Criteria andQuality_scoreGreaterThan(Integer value) {
            addCriterion("quality_score >", value, "quality_score");
            return (Criteria) this;
        }

        public Criteria andQuality_scoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_score >=", value, "quality_score");
            return (Criteria) this;
        }

        public Criteria andQuality_scoreLessThan(Integer value) {
            addCriterion("quality_score <", value, "quality_score");
            return (Criteria) this;
        }

        public Criteria andQuality_scoreLessThanOrEqualTo(Integer value) {
            addCriterion("quality_score <=", value, "quality_score");
            return (Criteria) this;
        }

        public Criteria andQuality_scoreIn(List<Integer> values) {
            addCriterion("quality_score in", values, "quality_score");
            return (Criteria) this;
        }

        public Criteria andQuality_scoreNotIn(List<Integer> values) {
            addCriterion("quality_score not in", values, "quality_score");
            return (Criteria) this;
        }

        public Criteria andQuality_scoreBetween(Integer value1, Integer value2) {
            addCriterion("quality_score between", value1, value2, "quality_score");
            return (Criteria) this;
        }

        public Criteria andQuality_scoreNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_score not between", value1, value2, "quality_score");
            return (Criteria) this;
        }

        public Criteria andlogistics_scoreIsNull() {
            addCriterion("\" logistics_score\" is null");
            return (Criteria) this;
        }

        public Criteria andlogistics_scoreIsNotNull() {
            addCriterion("\" logistics_score\" is not null");
            return (Criteria) this;
        }

        public Criteria andlogistics_scoreEqualTo(Integer value) {
            addCriterion("\" logistics_score\" =", value, " logistics_score");
            return (Criteria) this;
        }

        public Criteria andlogistics_scoreNotEqualTo(Integer value) {
            addCriterion("\" logistics_score\" <>", value, " logistics_score");
            return (Criteria) this;
        }

        public Criteria andlogistics_scoreGreaterThan(Integer value) {
            addCriterion("\" logistics_score\" >", value, " logistics_score");
            return (Criteria) this;
        }

        public Criteria andlogistics_scoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("\" logistics_score\" >=", value, " logistics_score");
            return (Criteria) this;
        }

        public Criteria andlogistics_scoreLessThan(Integer value) {
            addCriterion("\" logistics_score\" <", value, " logistics_score");
            return (Criteria) this;
        }

        public Criteria andlogistics_scoreLessThanOrEqualTo(Integer value) {
            addCriterion("\" logistics_score\" <=", value, " logistics_score");
            return (Criteria) this;
        }

        public Criteria andlogistics_scoreIn(List<Integer> values) {
            addCriterion("\" logistics_score\" in", values, " logistics_score");
            return (Criteria) this;
        }

        public Criteria andlogistics_scoreNotIn(List<Integer> values) {
            addCriterion("\" logistics_score\" not in", values, " logistics_score");
            return (Criteria) this;
        }

        public Criteria andlogistics_scoreBetween(Integer value1, Integer value2) {
            addCriterion("\" logistics_score\" between", value1, value2, " logistics_score");
            return (Criteria) this;
        }

        public Criteria andlogistics_scoreNotBetween(Integer value1, Integer value2) {
            addCriterion("\" logistics_score\" not between", value1, value2, " logistics_score");
            return (Criteria) this;
        }

        public Criteria andComment_urlIsNull() {
            addCriterion("comment_url is null");
            return (Criteria) this;
        }

        public Criteria andComment_urlIsNotNull() {
            addCriterion("comment_url is not null");
            return (Criteria) this;
        }

        public Criteria andComment_urlEqualTo(String value) {
            addCriterion("comment_url =", value, "comment_url");
            return (Criteria) this;
        }

        public Criteria andComment_urlNotEqualTo(String value) {
            addCriterion("comment_url <>", value, "comment_url");
            return (Criteria) this;
        }

        public Criteria andComment_urlGreaterThan(String value) {
            addCriterion("comment_url >", value, "comment_url");
            return (Criteria) this;
        }

        public Criteria andComment_urlGreaterThanOrEqualTo(String value) {
            addCriterion("comment_url >=", value, "comment_url");
            return (Criteria) this;
        }

        public Criteria andComment_urlLessThan(String value) {
            addCriterion("comment_url <", value, "comment_url");
            return (Criteria) this;
        }

        public Criteria andComment_urlLessThanOrEqualTo(String value) {
            addCriterion("comment_url <=", value, "comment_url");
            return (Criteria) this;
        }

        public Criteria andComment_urlLike(String value) {
            addCriterion("comment_url like", value, "comment_url");
            return (Criteria) this;
        }

        public Criteria andComment_urlNotLike(String value) {
            addCriterion("comment_url not like", value, "comment_url");
            return (Criteria) this;
        }

        public Criteria andComment_urlIn(List<String> values) {
            addCriterion("comment_url in", values, "comment_url");
            return (Criteria) this;
        }

        public Criteria andComment_urlNotIn(List<String> values) {
            addCriterion("comment_url not in", values, "comment_url");
            return (Criteria) this;
        }

        public Criteria andComment_urlBetween(String value1, String value2) {
            addCriterion("comment_url between", value1, value2, "comment_url");
            return (Criteria) this;
        }

        public Criteria andComment_urlNotBetween(String value1, String value2) {
            addCriterion("comment_url not between", value1, value2, "comment_url");
            return (Criteria) this;
        }

        public Criteria andComment_mp4IsNull() {
            addCriterion("comment_mp4 is null");
            return (Criteria) this;
        }

        public Criteria andComment_mp4IsNotNull() {
            addCriterion("comment_mp4 is not null");
            return (Criteria) this;
        }

        public Criteria andComment_mp4EqualTo(String value) {
            addCriterion("comment_mp4 =", value, "comment_mp4");
            return (Criteria) this;
        }

        public Criteria andComment_mp4NotEqualTo(String value) {
            addCriterion("comment_mp4 <>", value, "comment_mp4");
            return (Criteria) this;
        }

        public Criteria andComment_mp4GreaterThan(String value) {
            addCriterion("comment_mp4 >", value, "comment_mp4");
            return (Criteria) this;
        }

        public Criteria andComment_mp4GreaterThanOrEqualTo(String value) {
            addCriterion("comment_mp4 >=", value, "comment_mp4");
            return (Criteria) this;
        }

        public Criteria andComment_mp4LessThan(String value) {
            addCriterion("comment_mp4 <", value, "comment_mp4");
            return (Criteria) this;
        }

        public Criteria andComment_mp4LessThanOrEqualTo(String value) {
            addCriterion("comment_mp4 <=", value, "comment_mp4");
            return (Criteria) this;
        }

        public Criteria andComment_mp4Like(String value) {
            addCriterion("comment_mp4 like", value, "comment_mp4");
            return (Criteria) this;
        }

        public Criteria andComment_mp4NotLike(String value) {
            addCriterion("comment_mp4 not like", value, "comment_mp4");
            return (Criteria) this;
        }

        public Criteria andComment_mp4In(List<String> values) {
            addCriterion("comment_mp4 in", values, "comment_mp4");
            return (Criteria) this;
        }

        public Criteria andComment_mp4NotIn(List<String> values) {
            addCriterion("comment_mp4 not in", values, "comment_mp4");
            return (Criteria) this;
        }

        public Criteria andComment_mp4Between(String value1, String value2) {
            addCriterion("comment_mp4 between", value1, value2, "comment_mp4");
            return (Criteria) this;
        }

        public Criteria andComment_mp4NotBetween(String value1, String value2) {
            addCriterion("comment_mp4 not between", value1, value2, "comment_mp4");
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