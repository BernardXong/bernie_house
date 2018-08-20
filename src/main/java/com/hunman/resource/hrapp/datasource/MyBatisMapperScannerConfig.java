package com.hunman.resource.hrapp.datasource;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MyBatisMapperScannerConfig
 * @Description MyBatisMapper扫描类
 * @author BernieXiong
 * @company co.,ltd.tellyes
 * @Email xiongyun100@163.com
 * @Date 2017年9月15日 上午9:52:10
 * @version 1.0
 */
@Configuration
// 因为这个对象的扫描，需要在MyBatisConfig的后面注入，所以加上下面的注解
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //获取之前注入的beanName为sqlSessionFactory的对象
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        //指定xml配置文件的路径
        mapperScannerConfigurer.setBasePackage("com.framework.msg.mapper");
        return mapperScannerConfigurer;
    }
}
