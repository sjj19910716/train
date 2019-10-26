package com.service.entity;

import java.util.ArrayList;
import java.util.List;

public class FcnScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FcnScoreExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStaffIsNull() {
            addCriterion("staff is null");
            return (Criteria) this;
        }

        public Criteria andStaffIsNotNull() {
            addCriterion("staff is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEqualTo(String value) {
            addCriterion("staff =", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotEqualTo(String value) {
            addCriterion("staff <>", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffGreaterThan(String value) {
            addCriterion("staff >", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffGreaterThanOrEqualTo(String value) {
            addCriterion("staff >=", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffLessThan(String value) {
            addCriterion("staff <", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffLessThanOrEqualTo(String value) {
            addCriterion("staff <=", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffLike(String value) {
            addCriterion("staff like", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotLike(String value) {
            addCriterion("staff not like", value, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffIn(List<String> values) {
            addCriterion("staff in", values, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotIn(List<String> values) {
            addCriterion("staff not in", values, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffBetween(String value1, String value2) {
            addCriterion("staff between", value1, value2, "staff");
            return (Criteria) this;
        }

        public Criteria andStaffNotBetween(String value1, String value2) {
            addCriterion("staff not between", value1, value2, "staff");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andScore1IsNull() {
            addCriterion("score1 is null");
            return (Criteria) this;
        }

        public Criteria andScore1IsNotNull() {
            addCriterion("score1 is not null");
            return (Criteria) this;
        }

        public Criteria andScore1EqualTo(String value) {
            addCriterion("score1 =", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotEqualTo(String value) {
            addCriterion("score1 <>", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThan(String value) {
            addCriterion("score1 >", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1GreaterThanOrEqualTo(String value) {
            addCriterion("score1 >=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThan(String value) {
            addCriterion("score1 <", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1LessThanOrEqualTo(String value) {
            addCriterion("score1 <=", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1Like(String value) {
            addCriterion("score1 like", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotLike(String value) {
            addCriterion("score1 not like", value, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1In(List<String> values) {
            addCriterion("score1 in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotIn(List<String> values) {
            addCriterion("score1 not in", values, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1Between(String value1, String value2) {
            addCriterion("score1 between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andScore1NotBetween(String value1, String value2) {
            addCriterion("score1 not between", value1, value2, "score1");
            return (Criteria) this;
        }

        public Criteria andScore2IsNull() {
            addCriterion("score2 is null");
            return (Criteria) this;
        }

        public Criteria andScore2IsNotNull() {
            addCriterion("score2 is not null");
            return (Criteria) this;
        }

        public Criteria andScore2EqualTo(String value) {
            addCriterion("score2 =", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotEqualTo(String value) {
            addCriterion("score2 <>", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThan(String value) {
            addCriterion("score2 >", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2GreaterThanOrEqualTo(String value) {
            addCriterion("score2 >=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThan(String value) {
            addCriterion("score2 <", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2LessThanOrEqualTo(String value) {
            addCriterion("score2 <=", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2Like(String value) {
            addCriterion("score2 like", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotLike(String value) {
            addCriterion("score2 not like", value, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2In(List<String> values) {
            addCriterion("score2 in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotIn(List<String> values) {
            addCriterion("score2 not in", values, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2Between(String value1, String value2) {
            addCriterion("score2 between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore2NotBetween(String value1, String value2) {
            addCriterion("score2 not between", value1, value2, "score2");
            return (Criteria) this;
        }

        public Criteria andScore3IsNull() {
            addCriterion("score3 is null");
            return (Criteria) this;
        }

        public Criteria andScore3IsNotNull() {
            addCriterion("score3 is not null");
            return (Criteria) this;
        }

        public Criteria andScore3EqualTo(String value) {
            addCriterion("score3 =", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotEqualTo(String value) {
            addCriterion("score3 <>", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThan(String value) {
            addCriterion("score3 >", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3GreaterThanOrEqualTo(String value) {
            addCriterion("score3 >=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThan(String value) {
            addCriterion("score3 <", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3LessThanOrEqualTo(String value) {
            addCriterion("score3 <=", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3Like(String value) {
            addCriterion("score3 like", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotLike(String value) {
            addCriterion("score3 not like", value, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3In(List<String> values) {
            addCriterion("score3 in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotIn(List<String> values) {
            addCriterion("score3 not in", values, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3Between(String value1, String value2) {
            addCriterion("score3 between", value1, value2, "score3");
            return (Criteria) this;
        }

        public Criteria andScore3NotBetween(String value1, String value2) {
            addCriterion("score3 not between", value1, value2, "score3");
            return (Criteria) this;
        }

        public Criteria andScore4IsNull() {
            addCriterion("score4 is null");
            return (Criteria) this;
        }

        public Criteria andScore4IsNotNull() {
            addCriterion("score4 is not null");
            return (Criteria) this;
        }

        public Criteria andScore4EqualTo(String value) {
            addCriterion("score4 =", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotEqualTo(String value) {
            addCriterion("score4 <>", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4GreaterThan(String value) {
            addCriterion("score4 >", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4GreaterThanOrEqualTo(String value) {
            addCriterion("score4 >=", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4LessThan(String value) {
            addCriterion("score4 <", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4LessThanOrEqualTo(String value) {
            addCriterion("score4 <=", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4Like(String value) {
            addCriterion("score4 like", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotLike(String value) {
            addCriterion("score4 not like", value, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4In(List<String> values) {
            addCriterion("score4 in", values, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotIn(List<String> values) {
            addCriterion("score4 not in", values, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4Between(String value1, String value2) {
            addCriterion("score4 between", value1, value2, "score4");
            return (Criteria) this;
        }

        public Criteria andScore4NotBetween(String value1, String value2) {
            addCriterion("score4 not between", value1, value2, "score4");
            return (Criteria) this;
        }

        public Criteria andScore5IsNull() {
            addCriterion("score5 is null");
            return (Criteria) this;
        }

        public Criteria andScore5IsNotNull() {
            addCriterion("score5 is not null");
            return (Criteria) this;
        }

        public Criteria andScore5EqualTo(String value) {
            addCriterion("score5 =", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotEqualTo(String value) {
            addCriterion("score5 <>", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5GreaterThan(String value) {
            addCriterion("score5 >", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5GreaterThanOrEqualTo(String value) {
            addCriterion("score5 >=", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5LessThan(String value) {
            addCriterion("score5 <", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5LessThanOrEqualTo(String value) {
            addCriterion("score5 <=", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5Like(String value) {
            addCriterion("score5 like", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotLike(String value) {
            addCriterion("score5 not like", value, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5In(List<String> values) {
            addCriterion("score5 in", values, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotIn(List<String> values) {
            addCriterion("score5 not in", values, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5Between(String value1, String value2) {
            addCriterion("score5 between", value1, value2, "score5");
            return (Criteria) this;
        }

        public Criteria andScore5NotBetween(String value1, String value2) {
            addCriterion("score5 not between", value1, value2, "score5");
            return (Criteria) this;
        }

        public Criteria andScore6IsNull() {
            addCriterion("score6 is null");
            return (Criteria) this;
        }

        public Criteria andScore6IsNotNull() {
            addCriterion("score6 is not null");
            return (Criteria) this;
        }

        public Criteria andScore6EqualTo(String value) {
            addCriterion("score6 =", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotEqualTo(String value) {
            addCriterion("score6 <>", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6GreaterThan(String value) {
            addCriterion("score6 >", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6GreaterThanOrEqualTo(String value) {
            addCriterion("score6 >=", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6LessThan(String value) {
            addCriterion("score6 <", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6LessThanOrEqualTo(String value) {
            addCriterion("score6 <=", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6Like(String value) {
            addCriterion("score6 like", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotLike(String value) {
            addCriterion("score6 not like", value, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6In(List<String> values) {
            addCriterion("score6 in", values, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotIn(List<String> values) {
            addCriterion("score6 not in", values, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6Between(String value1, String value2) {
            addCriterion("score6 between", value1, value2, "score6");
            return (Criteria) this;
        }

        public Criteria andScore6NotBetween(String value1, String value2) {
            addCriterion("score6 not between", value1, value2, "score6");
            return (Criteria) this;
        }

        public Criteria andScore7IsNull() {
            addCriterion("score7 is null");
            return (Criteria) this;
        }

        public Criteria andScore7IsNotNull() {
            addCriterion("score7 is not null");
            return (Criteria) this;
        }

        public Criteria andScore7EqualTo(String value) {
            addCriterion("score7 =", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7NotEqualTo(String value) {
            addCriterion("score7 <>", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7GreaterThan(String value) {
            addCriterion("score7 >", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7GreaterThanOrEqualTo(String value) {
            addCriterion("score7 >=", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7LessThan(String value) {
            addCriterion("score7 <", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7LessThanOrEqualTo(String value) {
            addCriterion("score7 <=", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7Like(String value) {
            addCriterion("score7 like", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7NotLike(String value) {
            addCriterion("score7 not like", value, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7In(List<String> values) {
            addCriterion("score7 in", values, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7NotIn(List<String> values) {
            addCriterion("score7 not in", values, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7Between(String value1, String value2) {
            addCriterion("score7 between", value1, value2, "score7");
            return (Criteria) this;
        }

        public Criteria andScore7NotBetween(String value1, String value2) {
            addCriterion("score7 not between", value1, value2, "score7");
            return (Criteria) this;
        }

        public Criteria andScore8IsNull() {
            addCriterion("score8 is null");
            return (Criteria) this;
        }

        public Criteria andScore8IsNotNull() {
            addCriterion("score8 is not null");
            return (Criteria) this;
        }

        public Criteria andScore8EqualTo(String value) {
            addCriterion("score8 =", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8NotEqualTo(String value) {
            addCriterion("score8 <>", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8GreaterThan(String value) {
            addCriterion("score8 >", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8GreaterThanOrEqualTo(String value) {
            addCriterion("score8 >=", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8LessThan(String value) {
            addCriterion("score8 <", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8LessThanOrEqualTo(String value) {
            addCriterion("score8 <=", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8Like(String value) {
            addCriterion("score8 like", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8NotLike(String value) {
            addCriterion("score8 not like", value, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8In(List<String> values) {
            addCriterion("score8 in", values, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8NotIn(List<String> values) {
            addCriterion("score8 not in", values, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8Between(String value1, String value2) {
            addCriterion("score8 between", value1, value2, "score8");
            return (Criteria) this;
        }

        public Criteria andScore8NotBetween(String value1, String value2) {
            addCriterion("score8 not between", value1, value2, "score8");
            return (Criteria) this;
        }

        public Criteria andScore9IsNull() {
            addCriterion("score9 is null");
            return (Criteria) this;
        }

        public Criteria andScore9IsNotNull() {
            addCriterion("score9 is not null");
            return (Criteria) this;
        }

        public Criteria andScore9EqualTo(String value) {
            addCriterion("score9 =", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9NotEqualTo(String value) {
            addCriterion("score9 <>", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9GreaterThan(String value) {
            addCriterion("score9 >", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9GreaterThanOrEqualTo(String value) {
            addCriterion("score9 >=", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9LessThan(String value) {
            addCriterion("score9 <", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9LessThanOrEqualTo(String value) {
            addCriterion("score9 <=", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9Like(String value) {
            addCriterion("score9 like", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9NotLike(String value) {
            addCriterion("score9 not like", value, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9In(List<String> values) {
            addCriterion("score9 in", values, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9NotIn(List<String> values) {
            addCriterion("score9 not in", values, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9Between(String value1, String value2) {
            addCriterion("score9 between", value1, value2, "score9");
            return (Criteria) this;
        }

        public Criteria andScore9NotBetween(String value1, String value2) {
            addCriterion("score9 not between", value1, value2, "score9");
            return (Criteria) this;
        }

        public Criteria andScore10IsNull() {
            addCriterion("score10 is null");
            return (Criteria) this;
        }

        public Criteria andScore10IsNotNull() {
            addCriterion("score10 is not null");
            return (Criteria) this;
        }

        public Criteria andScore10EqualTo(String value) {
            addCriterion("score10 =", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10NotEqualTo(String value) {
            addCriterion("score10 <>", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10GreaterThan(String value) {
            addCriterion("score10 >", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10GreaterThanOrEqualTo(String value) {
            addCriterion("score10 >=", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10LessThan(String value) {
            addCriterion("score10 <", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10LessThanOrEqualTo(String value) {
            addCriterion("score10 <=", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10Like(String value) {
            addCriterion("score10 like", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10NotLike(String value) {
            addCriterion("score10 not like", value, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10In(List<String> values) {
            addCriterion("score10 in", values, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10NotIn(List<String> values) {
            addCriterion("score10 not in", values, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10Between(String value1, String value2) {
            addCriterion("score10 between", value1, value2, "score10");
            return (Criteria) this;
        }

        public Criteria andScore10NotBetween(String value1, String value2) {
            addCriterion("score10 not between", value1, value2, "score10");
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