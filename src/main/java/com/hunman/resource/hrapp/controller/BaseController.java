package com.hunman.resource.hrapp.controller;

import com.hunman.resource.hrapp.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BaseController {

    @Autowired
    private BaseService baseService;

    @RequestMapping("/hi")
    public String sayHi(){
        List<Map<String, Object>> users = null;
        try {
            users = baseService.findAllUser();
            if(null!=users) {
                for(Map<String,Object> m : users){
                    m.forEach((K,V) -> System.out.println("key:"+K+",value:"+V));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "hi,i am bernie ,this is my first time working with idea!";
    }
}
