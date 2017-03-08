package com.yx.service.impl;

import com.yx.model.Person;
import com.yx.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * User: LiWenC
 * Date: 17-3-8
 */
@Service(value = "personService")
public class PersonServiceImpl implements PersonService {
    @Override
    public void save(Person person) {
        System.out.println("person save");
        System.out.println(person);
    }

    @Override
    public Person getPerson() {
        return new Person(1, "a", 26);
    }
}
