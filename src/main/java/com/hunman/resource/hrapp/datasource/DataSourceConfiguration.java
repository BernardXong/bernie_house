package com.hunman.resource.hrapp.datasource;

import com.hunman.resource.hrapp.properties.PropConf;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: DataSourceConfiguration
 * @Description 持久层获取数据源对象
 * @author BernieXiong
 * @company co.,ltd.tellyes
 * @Email xiongyun100@163.com
 * @Date 2018/8/8 22:33
 * @version 1.0
 */
@Configuration
public class DataSourceConfiguration {

    @Autowired
    private PropConf propConf;

    @Bean
    public BasicDataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(propConf.getDriver());
        dataSource.setUrl(propConf.getUrl());
        dataSource.setUsername(propConf.getUsername());
        dataSource.setPassword(propConf.getPassword());
        dataSource.setMaxTotal(propConf.getMaxActive());
        dataSource.setMaxIdle(propConf.getMaxIdel());
        dataSource.setMaxWaitMillis(propConf.getMaxWait());
        dataSource.setValidationQuery("SELECT 1");
        dataSource.setTestOnBorrow(true);
        return dataSource;
    }
}
