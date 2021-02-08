package com.hlj.spring.service;

import com.hlj.spring.dao.MysqlDaoImpl;
import com.hlj.spring.dao.OracleDaoImpl;
import com.hlj.spring.dao.PersonDao;
import com.hlj.spring.dao.PersonDaoImpl;

/**
 * @author jingzhidematong
 * @date 2021/2/7
 */
public class PersonServiceImpl implements PersonService {

    /**
     * 方式1  创建具体对象 写死
     */
//    private PersonDao personDao = new PersonDaoImpl();
//    private PersonDao personDao = new MysqlDaoImpl();
//    private PersonDao personDao = new OracleDaoImpl();


    /**
     * 方式2  通过set方式  让用户自己传递具体对象进来
     */
    private PersonDao personDao;

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void getPerson() {
        personDao.getPerson();
    }

}