package com.max.b2c.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductSpuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductSpuExample() {
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

        public Criteria andProduce_codeIsNull() {
            addCriterion("produce_code is null");
            return (Criteria) this;
        }

        public Criteria andProduce_codeIsNotNull() {
            addCriterion("produce_code is not null");
            return (Criteria) this;
        }

        public Criteria andProduce_codeEqualTo(String value) {
            addCriterion("produce_code =", value, "produce_code");
            return (Criteria) this;
        }

        public Criteria andProduce_codeNotEqualTo(String value) {
            addCriterion("produce_code <>", value, "produce_code");
            return (Criteria) this;
        }

        public Criteria andProduce_codeGreaterThan(String value) {
            addCriterion("produce_code >", value, "produce_code");
            return (Criteria) this;
        }

        public Criteria andProduce_codeGreaterThanOrEqualTo(String value) {
            addCriterion("produce_code >=", value, "produce_code");
            return (Criteria) this;
        }

        public Criteria andProduce_codeLessThan(String value) {
            addCriterion("produce_code <", value, "produce_code");
            return (Criteria) this;
        }

        public Criteria andProduce_codeLessThanOrEqualTo(String value) {
            addCriterion("produce_code <=", value, "produce_code");
            return (Criteria) this;
        }

        public Criteria andProduce_codeLike(String value) {
            addCriterion("produce_code like", value, "produce_code");
            return (Criteria) this;
        }

        public Criteria andProduce_codeNotLike(String value) {
            addCriterion("produce_code not like", value, "produce_code");
            return (Criteria) this;
        }

        public Criteria andProduce_codeIn(List<String> values) {
            addCriterion("produce_code in", values, "produce_code");
            return (Criteria) this;
        }

        public Criteria andProduce_codeNotIn(List<String> values) {
            addCriterion("produce_code not in", values, "produce_code");
            return (Criteria) this;
        }

        public Criteria andProduce_codeBetween(String value1, String value2) {
            addCriterion("produce_code between", value1, value2, "produce_code");
            return (Criteria) this;
        }

        public Criteria andProduce_codeNotBetween(String value1, String value2) {
            addCriterion("produce_code not between", value1, value2, "produce_code");
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

        public Criteria andBrand_idIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrand_idIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrand_idEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idLessThan(Integer value) {
            addCriterion("brand_id <", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brand_id");
            return (Criteria) this;
        }

        public Criteria andIs_free_postageIsNull() {
            addCriterion("is_free_postage is null");
            return (Criteria) this;
        }

        public Criteria andIs_free_postageIsNotNull() {
            addCriterion("is_free_postage is not null");
            return (Criteria) this;
        }

        public Criteria andIs_free_postageEqualTo(Integer value) {
            addCriterion("is_free_postage =", value, "is_free_postage");
            return (Criteria) this;
        }

        public Criteria andIs_free_postageNotEqualTo(Integer value) {
            addCriterion("is_free_postage <>", value, "is_free_postage");
            return (Criteria) this;
        }

        public Criteria andIs_free_postageGreaterThan(Integer value) {
            addCriterion("is_free_postage >", value, "is_free_postage");
            return (Criteria) this;
        }

        public Criteria andIs_free_postageGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_free_postage >=", value, "is_free_postage");
            return (Criteria) this;
        }

        public Criteria andIs_free_postageLessThan(Integer value) {
            addCriterion("is_free_postage <", value, "is_free_postage");
            return (Criteria) this;
        }

        public Criteria andIs_free_postageLessThanOrEqualTo(Integer value) {
            addCriterion("is_free_postage <=", value, "is_free_postage");
            return (Criteria) this;
        }

        public Criteria andIs_free_postageIn(List<Integer> values) {
            addCriterion("is_free_postage in", values, "is_free_postage");
            return (Criteria) this;
        }

        public Criteria andIs_free_postageNotIn(List<Integer> values) {
            addCriterion("is_free_postage not in", values, "is_free_postage");
            return (Criteria) this;
        }

        public Criteria andIs_free_postageBetween(Integer value1, Integer value2) {
            addCriterion("is_free_postage between", value1, value2, "is_free_postage");
            return (Criteria) this;
        }

        public Criteria andIs_free_postageNotBetween(Integer value1, Integer value2) {
            addCriterion("is_free_postage not between", value1, value2, "is_free_postage");
            return (Criteria) this;
        }

        public Criteria andIs_seckillIsNull() {
            addCriterion("is_seckill is null");
            return (Criteria) this;
        }

        public Criteria andIs_seckillIsNotNull() {
            addCriterion("is_seckill is not null");
            return (Criteria) this;
        }

        public Criteria andIs_seckillEqualTo(Integer value) {
            addCriterion("is_seckill =", value, "is_seckill");
            return (Criteria) this;
        }

        public Criteria andIs_seckillNotEqualTo(Integer value) {
            addCriterion("is_seckill <>", value, "is_seckill");
            return (Criteria) this;
        }

        public Criteria andIs_seckillGreaterThan(Integer value) {
            addCriterion("is_seckill >", value, "is_seckill");
            return (Criteria) this;
        }

        public Criteria andIs_seckillGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_seckill >=", value, "is_seckill");
            return (Criteria) this;
        }

        public Criteria andIs_seckillLessThan(Integer value) {
            addCriterion("is_seckill <", value, "is_seckill");
            return (Criteria) this;
        }

        public Criteria andIs_seckillLessThanOrEqualTo(Integer value) {
            addCriterion("is_seckill <=", value, "is_seckill");
            return (Criteria) this;
        }

        public Criteria andIs_seckillIn(List<Integer> values) {
            addCriterion("is_seckill in", values, "is_seckill");
            return (Criteria) this;
        }

        public Criteria andIs_seckillNotIn(List<Integer> values) {
            addCriterion("is_seckill not in", values, "is_seckill");
            return (Criteria) this;
        }

        public Criteria andIs_seckillBetween(Integer value1, Integer value2) {
            addCriterion("is_seckill between", value1, value2, "is_seckill");
            return (Criteria) this;
        }

        public Criteria andIs_seckillNotBetween(Integer value1, Integer value2) {
            addCriterion("is_seckill not between", value1, value2, "is_seckill");
            return (Criteria) this;
        }

        public Criteria andPublish_statusIsNull() {
            addCriterion("publish_status is null");
            return (Criteria) this;
        }

        public Criteria andPublish_statusIsNotNull() {
            addCriterion("publish_status is not null");
            return (Criteria) this;
        }

        public Criteria andPublish_statusEqualTo(Integer value) {
            addCriterion("publish_status =", value, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusNotEqualTo(Integer value) {
            addCriterion("publish_status <>", value, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusGreaterThan(Integer value) {
            addCriterion("publish_status >", value, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_status >=", value, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusLessThan(Integer value) {
            addCriterion("publish_status <", value, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusLessThanOrEqualTo(Integer value) {
            addCriterion("publish_status <=", value, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusIn(List<Integer> values) {
            addCriterion("publish_status in", values, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusNotIn(List<Integer> values) {
            addCriterion("publish_status not in", values, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusBetween(Integer value1, Integer value2) {
            addCriterion("publish_status between", value1, value2, "publish_status");
            return (Criteria) this;
        }

        public Criteria andPublish_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_status not between", value1, value2, "publish_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusIsNull() {
            addCriterion("recommand_status is null");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusIsNotNull() {
            addCriterion("recommand_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusEqualTo(Integer value) {
            addCriterion("recommand_status =", value, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusNotEqualTo(Integer value) {
            addCriterion("recommand_status <>", value, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusGreaterThan(Integer value) {
            addCriterion("recommand_status >", value, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommand_status >=", value, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusLessThan(Integer value) {
            addCriterion("recommand_status <", value, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusLessThanOrEqualTo(Integer value) {
            addCriterion("recommand_status <=", value, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusIn(List<Integer> values) {
            addCriterion("recommand_status in", values, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusNotIn(List<Integer> values) {
            addCriterion("recommand_status not in", values, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusBetween(Integer value1, Integer value2) {
            addCriterion("recommand_status between", value1, value2, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andRecommand_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("recommand_status not between", value1, value2, "recommand_status");
            return (Criteria) this;
        }

        public Criteria andVerity_statusIsNull() {
            addCriterion("verity_status is null");
            return (Criteria) this;
        }

        public Criteria andVerity_statusIsNotNull() {
            addCriterion("verity_status is not null");
            return (Criteria) this;
        }

        public Criteria andVerity_statusEqualTo(Integer value) {
            addCriterion("verity_status =", value, "verity_status");
            return (Criteria) this;
        }

        public Criteria andVerity_statusNotEqualTo(Integer value) {
            addCriterion("verity_status <>", value, "verity_status");
            return (Criteria) this;
        }

        public Criteria andVerity_statusGreaterThan(Integer value) {
            addCriterion("verity_status >", value, "verity_status");
            return (Criteria) this;
        }

        public Criteria andVerity_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("verity_status >=", value, "verity_status");
            return (Criteria) this;
        }

        public Criteria andVerity_statusLessThan(Integer value) {
            addCriterion("verity_status <", value, "verity_status");
            return (Criteria) this;
        }

        public Criteria andVerity_statusLessThanOrEqualTo(Integer value) {
            addCriterion("verity_status <=", value, "verity_status");
            return (Criteria) this;
        }

        public Criteria andVerity_statusIn(List<Integer> values) {
            addCriterion("verity_status in", values, "verity_status");
            return (Criteria) this;
        }

        public Criteria andVerity_statusNotIn(List<Integer> values) {
            addCriterion("verity_status not in", values, "verity_status");
            return (Criteria) this;
        }

        public Criteria andVerity_statusBetween(Integer value1, Integer value2) {
            addCriterion("verity_status between", value1, value2, "verity_status");
            return (Criteria) this;
        }

        public Criteria andVerity_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("verity_status not between", value1, value2, "verity_status");
            return (Criteria) this;
        }

        public Criteria andSaleIsNull() {
            addCriterion("sale is null");
            return (Criteria) this;
        }

        public Criteria andSaleIsNotNull() {
            addCriterion("sale is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEqualTo(Integer value) {
            addCriterion("sale =", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotEqualTo(Integer value) {
            addCriterion("sale <>", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThan(Integer value) {
            addCriterion("sale >", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale >=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThan(Integer value) {
            addCriterion("sale <", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThanOrEqualTo(Integer value) {
            addCriterion("sale <=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleIn(List<Integer> values) {
            addCriterion("sale in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotIn(List<Integer> values) {
            addCriterion("sale not in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleBetween(Integer value1, Integer value2) {
            addCriterion("sale between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("sale not between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceIsNull() {
            addCriterion("promotion_price is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceIsNotNull() {
            addCriterion("promotion_price is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceEqualTo(String value) {
            addCriterion("promotion_price =", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceNotEqualTo(String value) {
            addCriterion("promotion_price <>", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceGreaterThan(String value) {
            addCriterion("promotion_price >", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_price >=", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceLessThan(String value) {
            addCriterion("promotion_price <", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceLessThanOrEqualTo(String value) {
            addCriterion("promotion_price <=", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceLike(String value) {
            addCriterion("promotion_price like", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceNotLike(String value) {
            addCriterion("promotion_price not like", value, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceIn(List<String> values) {
            addCriterion("promotion_price in", values, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceNotIn(List<String> values) {
            addCriterion("promotion_price not in", values, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceBetween(String value1, String value2) {
            addCriterion("promotion_price between", value1, value2, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andPromotion_priceNotBetween(String value1, String value2) {
            addCriterion("promotion_price not between", value1, value2, "promotion_price");
            return (Criteria) this;
        }

        public Criteria andSub_titleIsNull() {
            addCriterion("sub_title is null");
            return (Criteria) this;
        }

        public Criteria andSub_titleIsNotNull() {
            addCriterion("sub_title is not null");
            return (Criteria) this;
        }

        public Criteria andSub_titleEqualTo(String value) {
            addCriterion("sub_title =", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleNotEqualTo(String value) {
            addCriterion("sub_title <>", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleGreaterThan(String value) {
            addCriterion("sub_title >", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleGreaterThanOrEqualTo(String value) {
            addCriterion("sub_title >=", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleLessThan(String value) {
            addCriterion("sub_title <", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleLessThanOrEqualTo(String value) {
            addCriterion("sub_title <=", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleLike(String value) {
            addCriterion("sub_title like", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleNotLike(String value) {
            addCriterion("sub_title not like", value, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleIn(List<String> values) {
            addCriterion("sub_title in", values, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleNotIn(List<String> values) {
            addCriterion("sub_title not in", values, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleBetween(String value1, String value2) {
            addCriterion("sub_title between", value1, value2, "sub_title");
            return (Criteria) this;
        }

        public Criteria andSub_titleNotBetween(String value1, String value2) {
            addCriterion("sub_title not between", value1, value2, "sub_title");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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