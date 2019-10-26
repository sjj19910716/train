package com.service.mapper;

import com.service.entity.FcnDept;
import com.service.entity.FcnDeptExample;
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

public interface FcnDeptMapper {
    @SelectProvider(type=FcnDeptSqlProvider.class, method="countByExample")
    int countByExample(FcnDeptExample example);

    @DeleteProvider(type=FcnDeptSqlProvider.class, method="deleteByExample")
    int deleteByExample(FcnDeptExample example);

    @Delete({
        "delete from [fcn_dept]",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into [fcn_dept] (id, deptName)",
        "values (#{id,jdbcType=INTEGER}, #{deptname,jdbcType=VARCHAR})"
    })
    int insert(FcnDept record);

    @InsertProvider(type=FcnDeptSqlProvider.class, method="insertSelective")
    int insertSelective(FcnDept record);

    @SelectProvider(type=FcnDeptSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="deptName", property="deptname", jdbcType=JdbcType.VARCHAR)
    })
    List<FcnDept> selectByExample(FcnDeptExample example);

    @Select({
        "select",
        "id, deptName",
        "from [fcn_dept]",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="deptName", property="deptname", jdbcType=JdbcType.VARCHAR)
    })
    FcnDept selectByPrimaryKey(Integer id);

    @UpdateProvider(type=FcnDeptSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FcnDept record, @Param("example") FcnDeptExample example);

    @UpdateProvider(type=FcnDeptSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FcnDept record, @Param("example") FcnDeptExample example);

    @UpdateProvider(type=FcnDeptSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FcnDept record);

    @Update({
        "update [fcn_dept]",
        "set deptName = #{deptname,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FcnDept record);
}