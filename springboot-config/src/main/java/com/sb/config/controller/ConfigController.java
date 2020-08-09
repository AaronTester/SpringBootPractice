package com.sb.config.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author Aaron
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2020/8/4
 */
@RestController
@Slf4j
public class ConfigController {

    @Autowired
    DataSource dataSource;

    @GetMapping("hello")
    public String hello() {
        log.info("****"+dataSource);
        return "hello";
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("query")
    public List<Map<String, Object>> query() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from tbl_employee");
        return maps;
    }
}
