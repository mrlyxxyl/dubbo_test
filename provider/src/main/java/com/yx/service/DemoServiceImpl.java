package com.yx.service;

import com.yx.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "demoService")
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public List getUsers() {
        List list = new ArrayList();
        Person u1 = new Person(1, "a", 25);
        Person u2 = new Person(1, "a", 25);
        Person u3 = new Person(1, "a", 25);

        list.add(u1);
        list.add(u2);
        list.add(u3);
        return list;
    }
}  