package com.idougong.seata.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

/**
 * @author zhanghang
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     */
    @Update("UPDATE account SET residue = residue - #{money},used  = used + #{money} WHERE user_id = #{userId};")
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
