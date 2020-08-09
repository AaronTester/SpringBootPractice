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
public interface EmployeeMapper {

    public Employee queryById(Integer id) ;

    public List<Employee> queryAll() ;

    public boolean deleteEmp(Integer id);

    public Integer addEmp(Employee employee);

    public boolean modifyEmp(Employee employee);
}
