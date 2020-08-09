package com.sp.mybatis.controller;

import com.sp.mybatis.entry.Employee;
import com.sp.mybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/8/8
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("queryById/{id}")
    public Employee queryById(@PathVariable("id") Integer id) {
        return employeeMapper.queryById(id);
    }

    @GetMapping("queryAll")
    public List<Employee> queryAll() {
        return employeeMapper.queryAll();
    }

    @PostMapping("addEmp")
    public Integer addEmp(@RequestBody Employee employee) {
        return employeeMapper.addEmp(employee);
    }

    @DeleteMapping("deleteEmp/{id}")
    public boolean deleteEmp(@PathVariable("id") Integer id) {
        return employeeMapper.deleteEmp(id);
    }

    @PutMapping("modifyEmp")
    public boolean modifyEmp(@RequestBody Employee employee) {
        return employeeMapper.modifyEmp(employee);
    }
}
