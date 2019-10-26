package com.service.mapper;

import com.service.entity.FcnSubject;
import com.service.entity.FcnSubjectExample;
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

public interface FcnSubjectMapper {
    @SelectProvider(type=FcnSubjectSqlProvider.class, method="countByExample")
    int countByExample(FcnSubjectExample example);

    @DeleteProvider(type=FcnSubjectSqlProvider.class, method="deleteByExample")
    int deleteByExample(FcnSubjectExample example);

    @Delete({
        "delete from [fcn_subject]",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into [fcn_subject] (train_name, create_date, ",
        "update_date, is_valid, ",
        "average_score)",
        "values (#{trainName,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{isValid,jdbcType=SMALLINT}, ",
        "#{averageScore,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="select @@IDENTITY", keyProperty="id", before=false, resultType=Integer.class)
    int insert(FcnSubject record);

    @InsertProvider(type=FcnSubjectSqlProvider.class, method="insertSelective")
    @SelectKey(statement="select @@IDENTITY", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(FcnSubject record);

    @SelectProvider(type=FcnSubjectSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="train_name", property="trainName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_valid", property="isValid", jdbcType=JdbcType.SMALLINT),
        @Result(column="average_score", property="averageScore", jdbcType=JdbcType.VARCHAR)
    })
    List<FcnSubject> selectByExample(FcnSubjectExample example);

    @Select({
        "select",
        "id, train_name, create_date, update_date, is_valid, average_score",
        "from [fcn_subject]",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="train_name", property="trainName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_valid", property="isValid", jdbcType=JdbcType.SMALLINT),
        @Result(column="average_score", property="averageScore", jdbcType=JdbcType.VARCHAR)
    })
    FcnSubject selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FcnSubjectSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FcnSubject record, @Param("example") FcnSubjectExample example);

    @UpdateProvider(type=FcnSubjectSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FcnSubject record, @Param("example") FcnSubjectExample example);

    @UpdateProvider(type=FcnSubjectSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FcnSubject record);

    @Update({
        "update [fcn_subject]",
        "set train_name = #{trainName,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "is_valid = #{isValid,jdbcType=SMALLINT},",
          "average_score = #{averageScore,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FcnSubject record);

    @Select(
            "SELECT\n" +
                    "s.id,\n" +
                    "s.train_name trainName,\n" +
                    "s.create_date createDate,\n" +
                    "s.update_date updateDate,\n" +
                    "s.is_valid isValid,\n" +
                    "s.average_score averageScore\n" +
                    "\n" +
                    "FROM\n" +
                    "[dbo].[fcn_subject] AS s\n" +
                    "WHERE\n" +
                    "s.is_valid = 1"
    )
    FcnSubject selectByValid();
}