package com.idougong.seata.dao;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author zhanghang
 */
public interface AccountDao {
    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
