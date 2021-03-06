package com.spring.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 程泰恒
 * @date: 2019/3/12 19:47
 */
@RestController
@RefreshScope
@RequestMapping("/consumer")
public class ConsumerController {

    @Value("${com.contextual.model}")
    private String contextualModel;

    @Value("${com.guangu.first.name}")
    private String firstName;

    @Value("${com.guangu.last.name}")
    private String lastName;

    @Value("${com.guangu.age}")
    private Integer age;

    @GetMapping
    public Map getConfig() {
        HashMap<Object, Object> map = new HashMap();

        map.put("contextualModel", contextualModel);
        map.put("firstName", firstName);
        map.put("lastName", lastName);
        map.put("age", age);

        return map;
    }
}
