package com.service.mapper;

import com.service.entity.FcnQuestion;
import com.service.entity.FcnQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface FcnQuestionMapper {
    @SelectProvider(type=FcnQuestionSqlProvider.class, method="countByExample")
    int countByExample(FcnQuestionExample example);

    @DeleteProvider(type=FcnQuestionSqlProvider.class, method="deleteByExample")
    int deleteByExample(FcnQuestionExample example);

    @Delete({
        "delete from [fcn_question]",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into [fcn_question] (number, description, ",
        "subject_id)",
        "values (#{number,jdbcType=TINYINT}, #{description,jdbcType=NVARCHAR}, ",
        "#{subjectId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="id", before=false, resultType=Long.class)
    int insert(FcnQuestion record);

    @InsertProvider(type=FcnQuestionSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(FcnQuestion record);

    @SelectProvider(type=FcnQuestionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="number", property="number", jdbcType=JdbcType.TINYINT),
        @Result(column="description", property="description", jdbcType=JdbcType.NVARCHAR),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.INTEGER)
    })
    List<FcnQuestion> selectByExample(FcnQuestionExample example);

    @Select({
        "select",
        "id, number, description, subject_id",
        "from [fcn_question]",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="number", property="number", jdbcType=JdbcType.TINYINT),
        @Result(column="description", property="description", jdbcType=JdbcType.NVARCHAR),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.INTEGER)
    })
    FcnQuestion selectByPrimaryKey(Long id);

    @UpdateProvider(type=FcnQuestionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FcnQuestion record, @Param("example") FcnQuestionExample example);

    @UpdateProvider(type=FcnQuestionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FcnQuestion record, @Param("example") FcnQuestionExample example);

    @UpdateProvider(type=FcnQuestionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FcnQuestion record);

    @Update({
        "update [fcn_question]",
        "set number = #{number,jdbcType=TINYINT},",
          "description = #{description,jdbcType=NVARCHAR},",
          "subject_id = #{subjectId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(FcnQuestion record);
}