package com.principle.command;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 类描述:
 *
 * @author 陈恩惠
 * @since 2019年08月08日 16:52:00
 */
@Mapper
public interface Cmapper {

    @Select("select * from t_abnormal_order")
    List<Map<String, Object>> findList();
}
