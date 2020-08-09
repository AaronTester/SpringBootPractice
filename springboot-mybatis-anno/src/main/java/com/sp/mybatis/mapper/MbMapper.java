package com.sp.mybatis.mapper;

import com.sp.mybatis.entry.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/8/8
 */
@Mapper
public interface MbMapper {

    @Select("select * from tbl_employee where id = #{id}")
    public Employee queryById(Integer id) ;

    @Select("select * from tbl_employee ")
    public List<Employee> queryAll() ;

    @Delete("delete from tbl_employee where id = #{id}")
    public boolean deleteEmp(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into tbl_employee(empName,email,address,gender,deptId) values (#{empName},#{email},#{address},#{gender},#{deptId})")
    public Integer addEmp(Employee employee);

    @Update("update tbl_employee set address = #{address} where id = #{id}")
    public boolean modifyEmp(Employee employee);
}
