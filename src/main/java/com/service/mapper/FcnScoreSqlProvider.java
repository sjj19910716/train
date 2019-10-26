package com.service.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.service.entity.FcnScore;
import com.service.entity.FcnScoreExample.Criteria;
import com.service.entity.FcnScoreExample.Criterion;
import com.service.entity.FcnScoreExample;
import java.util.List;
import java.util.Map;

public class FcnScoreSqlProvider {

    public String countByExample(FcnScoreExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("[fcn_score]");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(FcnScoreExample example) {
        BEGIN();
        DELETE_FROM("[fcn_score]");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(FcnScore record) {
        BEGIN();
        INSERT_INTO("[fcn_score]");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getStaff() != null) {
            VALUES("staff", "#{staff,jdbcType=NVARCHAR}");
        }
        
        if (record.getSubjectId() != null) {
            VALUES("subject_id", "#{subjectId,jdbcType=INTEGER}");
        }
        
        if (record.getScore1() != null) {
            VALUES("score1", "#{score1,jdbcType=VARCHAR}");
        }
        
        if (record.getScore2() != null) {
            VALUES("score2", "#{score2,jdbcType=VARCHAR}");
        }
        
        if (record.getScore3() != null) {
            VALUES("score3", "#{score3,jdbcType=VARCHAR}");
        }
        
        if (record.getScore4() != null) {
            VALUES("score4", "#{score4,jdbcType=VARCHAR}");
        }
        
        if (record.getScore5() != null) {
            VALUES("score5", "#{score5,jdbcType=VARCHAR}");
        }
        
        if (record.getScore6() != null) {
            VALUES("score6", "#{score6,jdbcType=VARCHAR}");
        }
        
        if (record.getScore7() != null) {
            VALUES("score7", "#{score7,jdbcType=VARCHAR}");
        }
        
        if (record.getScore8() != null) {
            VALUES("score8", "#{score8,jdbcType=VARCHAR}");
        }
        
        if (record.getScore9() != null) {
            VALUES("score9", "#{score9,jdbcType=VARCHAR}");
        }
        
        if (record.getScore10() != null) {
            VALUES("score10", "#{score10,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    public String selectByExample(FcnScoreExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("staff");
        SELECT("subject_id");
        SELECT("score1");
        SELECT("score2");
        SELECT("score3");
        SELECT("score4");
        SELECT("score5");
        SELECT("score6");
        SELECT("score7");
        SELECT("score8");
        SELECT("score9");
        SELECT("score10");
        FROM("[fcn_score]");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        FcnScore record = (FcnScore) parameter.get("record");
        FcnScoreExample example = (FcnScoreExample) parameter.get("example");
        
        BEGIN();
        UPDATE("[fcn_score]");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getStaff() != null) {
            SET("staff = #{record.staff,jdbcType=NVARCHAR}");
        }
        
        if (record.getSubjectId() != null) {
            SET("subject_id = #{record.subjectId,jdbcType=INTEGER}");
        }
        
        if (record.getScore1() != null) {
            SET("score1 = #{record.score1,jdbcType=VARCHAR}");
        }
        
        if (record.getScore2() != null) {
            SET("score2 = #{record.score2,jdbcType=VARCHAR}");
        }
        
        if (record.getScore3() != null) {
            SET("score3 = #{record.score3,jdbcType=VARCHAR}");
        }
        
        if (record.getScore4() != null) {
            SET("score4 = #{record.score4,jdbcType=VARCHAR}");
        }
        
        if (record.getScore5() != null) {
            SET("score5 = #{record.score5,jdbcType=VARCHAR}");
        }
        
        if (record.getScore6() != null) {
            SET("score6 = #{record.score6,jdbcType=VARCHAR}");
        }
        
        if (record.getScore7() != null) {
            SET("score7 = #{record.score7,jdbcType=VARCHAR}");
        }
        
        if (record.getScore8() != null) {
            SET("score8 = #{record.score8,jdbcType=VARCHAR}");
        }
        
        if (record.getScore9() != null) {
            SET("score9 = #{record.score9,jdbcType=VARCHAR}");
        }
        
        if (record.getScore10() != null) {
            SET("score10 = #{record.score10,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("[fcn_score]");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("staff = #{record.staff,jdbcType=NVARCHAR}");
        SET("subject_id = #{record.subjectId,jdbcType=INTEGER}");
        SET("score1 = #{record.score1,jdbcType=VARCHAR}");
        SET("score2 = #{record.score2,jdbcType=VARCHAR}");
        SET("score3 = #{record.score3,jdbcType=VARCHAR}");
        SET("score4 = #{record.score4,jdbcType=VARCHAR}");
        SET("score5 = #{record.score5,jdbcType=VARCHAR}");
        SET("score6 = #{record.score6,jdbcType=VARCHAR}");
        SET("score7 = #{record.score7,jdbcType=VARCHAR}");
        SET("score8 = #{record.score8,jdbcType=VARCHAR}");
        SET("score9 = #{record.score9,jdbcType=VARCHAR}");
        SET("score10 = #{record.score10,jdbcType=VARCHAR}");
        
        FcnScoreExample example = (FcnScoreExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(FcnScore record) {
        BEGIN();
        UPDATE("[fcn_score]");
        
        if (record.getStaff() != null) {
            SET("staff = #{staff,jdbcType=NVARCHAR}");
        }
        
        if (record.getSubjectId() != null) {
            SET("subject_id = #{subjectId,jdbcType=INTEGER}");
        }
        
        if (record.getScore1() != null) {
            SET("score1 = #{score1,jdbcType=VARCHAR}");
        }
        
        if (record.getScore2() != null) {
            SET("score2 = #{score2,jdbcType=VARCHAR}");
        }
        
        if (record.getScore3() != null) {
            SET("score3 = #{score3,jdbcType=VARCHAR}");
        }
        
        if (record.getScore4() != null) {
            SET("score4 = #{score4,jdbcType=VARCHAR}");
        }
        
        if (record.getScore5() != null) {
            SET("score5 = #{score5,jdbcType=VARCHAR}");
        }
        
        if (record.getScore6() != null) {
            SET("score6 = #{score6,jdbcType=VARCHAR}");
        }
        
        if (record.getScore7() != null) {
            SET("score7 = #{score7,jdbcType=VARCHAR}");
        }
        
        if (record.getScore8() != null) {
            SET("score8 = #{score8,jdbcType=VARCHAR}");
        }
        
        if (record.getScore9() != null) {
            SET("score9 = #{score9,jdbcType=VARCHAR}");
        }
        
        if (record.getScore10() != null) {
            SET("score10 = #{score10,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(FcnScoreExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}