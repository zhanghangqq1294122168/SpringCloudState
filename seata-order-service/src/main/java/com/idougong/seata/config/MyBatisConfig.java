package com.idougong.seata.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 */
@Configuration
@MapperScan({"com.idougong.seata.dao"})
public class MyBatisConfig {
}
