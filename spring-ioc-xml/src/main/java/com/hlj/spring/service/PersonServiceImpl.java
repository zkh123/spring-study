package com.hlj.spring.service;

import com.hlj.spring.dao.PersonDao;

/**
 * @author jingzhidematong
 * @date 2021/2/7
 */
public class PersonServiceImpl implements PersonService {

    private PersonDao personDao;

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void getPerson() {
        personDao.getPerson();
    }

}