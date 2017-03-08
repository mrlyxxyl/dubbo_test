package com.yx.controller;

import com.yx.model.Person;
import com.yx.service.DemoService;
import com.yx.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @Resource
    private PersonService personService;

    @RequestMapping(value = "test")
    @ResponseBody
    public Map<String, Object> test() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("say", demoService.sayHello("jack"));
        map.put("users", demoService.getUsers());
        return map;
    }

    @RequestMapping(value = "person")
    @ResponseBody
    public Map<String, Object> person() {
        Map<String, Object> map = new HashMap<String, Object>();
        personService.save(new Person(3, "a", 45));
        map.put("person", personService.getPerson());
        return map;
    }
}