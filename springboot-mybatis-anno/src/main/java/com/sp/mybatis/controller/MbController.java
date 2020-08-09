package com.sp.mybatis.controller;

import com.sp.mybatis.entry.Employee;
import com.sp.mybatis.mapper.MbMapper;
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
public class MbController {

    @Autowired
    MbMapper mbMapper;

    @GetMapping("queryById/{id}")
    public Employee queryById(@PathVariable("id") Integer id) {
        return mbMapper.queryById(id);
    }

    @GetMapping("queryAll")
    public List<Employee> queryAll() {
        return mbMapper.queryAll();
    }

    @PostMapping("addEmp")
    public Integer addEmp(@RequestBody Employee employee) {
        return mbMapper.addEmp(employee);
    }

    @DeleteMapping("deleteEmp/{id}")
    public boolean deleteEmp(@PathVariable("id") Integer id) {
        return mbMapper.deleteEmp(id);
    }

    @PutMapping("modifyEmp")
    public boolean modifyEmp(@RequestBody Employee employee) {
        return mbMapper.modifyEmp(employee);
    }
}
