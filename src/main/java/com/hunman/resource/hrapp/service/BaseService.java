package com.hunman.resource.hrapp.service;

import java.util.List;
import java.util.Map;

/**
 * @Author Bernie Xiong【xiongyun100@163.com】
 * @Date 2018/8/8 22:37
 */
public interface BaseService {
    /**
     * @Title: findAllUser
     * @Description: 接口定义的方法
     * @return List<Map<String,Object>>    返回类型
     * @throws
     */
    List<Map<String,Object>> findAllUser() throws Exception;
}
