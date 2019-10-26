package com.service.mapper;

import com.service.entity.FcnScore;
import com.service.entity.FcnScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface FcnScoreMapper {
    @SelectProvider(type=FcnScoreSqlProvider.class, method="countByExample")
    int countByExample(FcnScoreExample example);

    @DeleteProvider(type=FcnScoreSqlProvider.class, method="deleteByExample")
    int deleteByExample(FcnScoreExample example);

    @Delete({
        "delete from fcn_score",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into [fcn_score] (id, staff, ",
        "subject_id, score1, ",
        "score2, score3, ",
        "score4, score5, ",
        "score6, score7, ",
        "score8, score9, ",
        "score10)",
        "values (#{id,jdbcType=BIGINT}, #{staff,jdbcType=NVARCHAR}, ",
        "#{subjectId,jdbcType=INTEGER}, #{score1,jdbcType=VARCHAR}, ",
        "#{score2,jdbcType=VARCHAR}, #{score3,jdbcType=VARCHAR}, ",
        "#{score4,jdbcType=VARCHAR}, #{score5,jdbcType=VARCHAR}, ",
        "#{score6,jdbcType=VARCHAR}, #{score7,jdbcType=VARCHAR}, ",
        "#{score8,jdbcType=VARCHAR}, #{score9,jdbcType=VARCHAR}, ",
        "#{score10,jdbcType=VARCHAR})"
    })
    int insert(FcnScore record);

    @InsertProvider(type=FcnScoreSqlProvider.class, method="insertSelective")
    int insertSelective(FcnScore record);

    @SelectProvider(type=FcnScoreSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="staff", property="staff", jdbcType=JdbcType.NVARCHAR),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.INTEGER),
        @Result(column="score1", property="score1", jdbcType=JdbcType.VARCHAR),
        @Result(column="score2", property="score2", jdbcType=JdbcType.VARCHAR),
        @Result(column="score3", property="score3", jdbcType=JdbcType.VARCHAR),
        @Result(column="score4", property="score4", jdbcType=JdbcType.VARCHAR),
        @Result(column="score5", property="score5", jdbcType=JdbcType.VARCHAR),
        @Result(column="score6", property="score6", jdbcType=JdbcType.VARCHAR),
        @Result(column="score7", property="score7", jdbcType=JdbcType.VARCHAR),
        @Result(column="score8", property="score8", jdbcType=JdbcType.VARCHAR),
        @Result(column="score9", property="score9", jdbcType=JdbcType.VARCHAR),
        @Result(column="score10", property="score10", jdbcType=JdbcType.VARCHAR)
    })
    List<FcnScore> selectByExample(FcnScoreExample example);

    @Select({
        "select",
        "id, staff, subject_id, score1, score2, score3, score4, score5, score6, score7, ",
        "score8, score9, score10",
        "from [fcn_score]",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="staff", property="staff", jdbcType=JdbcType.NVARCHAR),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.INTEGER),
        @Result(column="score1", property="score1", jdbcType=JdbcType.VARCHAR),
        @Result(column="score2", property="score2", jdbcType=JdbcType.VARCHAR),
        @Result(column="score3", property="score3", jdbcType=JdbcType.VARCHAR),
        @Result(column="score4", property="score4", jdbcType=JdbcType.VARCHAR),
        @Result(column="score5", property="score5", jdbcType=JdbcType.VARCHAR),
        @Result(column="score6", property="score6", jdbcType=JdbcType.VARCHAR),
        @Result(column="score7", property="score7", jdbcType=JdbcType.VARCHAR),
        @Result(column="score8", property="score8", jdbcType=JdbcType.VARCHAR),
        @Result(column="score9", property="score9", jdbcType=JdbcType.VARCHAR),
        @Result(column="score10", property="score10", jdbcType=JdbcType.VARCHAR)
    })
    FcnScore selectByPrimaryKey(Long id);

    @UpdateProvider(type=FcnScoreSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FcnScore record, @Param("example") FcnScoreExample example);

    @UpdateProvider(type=FcnScoreSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FcnScore record, @Param("example") FcnScoreExample example);

    @UpdateProvider(type=FcnScoreSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FcnScore record);

    @Update({
        "update [fcn_score]",
        "set staff = #{staff,jdbcType=NVARCHAR},",
          "subject_id = #{subjectId,jdbcType=INTEGER},",
          "score1 = #{score1,jdbcType=VARCHAR},",
          "score2 = #{score2,jdbcType=VARCHAR},",
          "score3 = #{score3,jdbcType=VARCHAR},",
          "score4 = #{score4,jdbcType=VARCHAR},",
          "score5 = #{score5,jdbcType=VARCHAR},",
          "score6 = #{score6,jdbcType=VARCHAR},",
          "score7 = #{score7,jdbcType=VARCHAR},",
          "score8 = #{score8,jdbcType=VARCHAR},",
          "score9 = #{score9,jdbcType=VARCHAR},",
          "score10 = #{score10,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(FcnScore record);
}