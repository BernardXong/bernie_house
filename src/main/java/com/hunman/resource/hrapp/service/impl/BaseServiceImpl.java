package com.hunman.resource.hrapp.service.impl;

import com.hunman.resource.hrapp.dao.BaseDao;
import com.hunman.resource.hrapp.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: UserInfoServiceImpl
 * @Description 服务层实现类
 * @author BernieXiong
 * @company co.,ltd.tellyes
 * @Email xiongyun100@163.com
 * @Date 2017年8月30日 上午10:41:04
 * @version 1.0
 */
@Component
public class BaseServiceImpl implements BaseService {
    @Autowired
    private BaseDao baseDao;
    @Override
    public List<Map<String, Object>> findAllUser() throws Exception {
        return baseDao.find();
    }
}
