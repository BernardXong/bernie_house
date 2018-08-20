package com.hunman.resource.hrapp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author Bernie Xiong【xiongyun100@163.com】
 * @Date 2018/8/8 22:44
 */
@Mapper
public interface BaseDao {

    /**
     * @Title: find
     * @Description: DAO层查询方法
     * @return List<Map<String,Object>>    返回类型
     * @throws
     */
    @Select("select * from city")
    List<Map<String,Object>> find();
}
