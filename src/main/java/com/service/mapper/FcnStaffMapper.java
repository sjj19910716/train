package com.service.mapper;

import com.service.entity.FcnStaff;
import com.service.entity.FcnStaffExample;
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

public interface FcnStaffMapper {
    @SelectProvider(type=FcnStaffSqlProvider.class, method="countByExample")
    int countByExample(FcnStaffExample example);

    @DeleteProvider(type=FcnStaffSqlProvider.class, method="deleteByExample")
    int deleteByExample(FcnStaffExample example);

    @Delete({
        "delete from [fcn_staff]",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into [fcn_staff] (id, work_number, ",
        "name, dept_id)",
        "values (#{id,jdbcType=BIGINT}, #{workNumber,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{deptId,jdbcType=INTEGER})"
    })
    int insert(FcnStaff record);

    @InsertProvider(type=FcnStaffSqlProvider.class, method="insertSelective")
    int insertSelective(FcnStaff record);

    @SelectProvider(type=FcnStaffSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="work_number", property="workNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.INTEGER)
    })
    List<FcnStaff> selectByExample(FcnStaffExample example);

    @Select({
        "select",
        "id, work_number, name, dept_id",
        "from [fcn_staff]",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="work_number", property="workNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.INTEGER)
    })
    FcnStaff selectByPrimaryKey(Long id);

    @UpdateProvider(type=FcnStaffSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FcnStaff record, @Param("example") FcnStaffExample example);

    @UpdateProvider(type=FcnStaffSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FcnStaff record, @Param("example") FcnStaffExample example);

    @UpdateProvider(type=FcnStaffSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FcnStaff record);

    @Update({
        "update [fcn_staff]",
        "set work_number = #{workNumber,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "dept_id = #{deptId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(FcnStaff record);

    @Select(
            "SELECT\n" +
                    "s.id,\n" +
                    "s.work_number workNumber,\n" +
                    "s.name,\n" +
                    "s.dept_id deptId\n" +
                    "\n" +
                    "FROM\n" +
                    "[dbo].[fcn_staff] AS s\n" +
                    "WHERE\n" +
                    "s.work_number = #{num,jdbcType=VARCHAR}"
    )
    FcnStaff selectStaffByNum(@Param("num") String num);
}