package com.police.app02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller01 {


    public static final String HELLO_SERVICE_APP03 =  "http://APP03APPLICATION/app03/hello?name={name}";

//    public static final String HELLO_SERVICE_APP04 =  "http://APP03APPLICATION/app04/hello?name={name}";

    @Autowired
    private RestTemplate restTemplate;
    //@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloApp03(@RequestParam String name){
//        return "Hello" + name;
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", name);
        return restTemplate.getForObject(HELLO_SERVICE_APP03,String.class,params).toString();
    }
}
