package com.lovegu.springframework.service;


import com.lovegu.springframework.jdbc.support.JdbcTemplate;

import java.sql.SQLException;

/**
 * @author zhangdd on 2022/2/15
 */
public interface JdbcService {

    void saveDataWithTranslation() throws SQLException;


    void saveData(JdbcTemplate jdbcTemplate) ;
}
