package com.yx.service;

import com.yx.model.Person;

/**
 * User: LiWenC
 * Date: 17-3-8
 */
public interface PersonService {

    void save(Person person);

    Person getPerson();
}
