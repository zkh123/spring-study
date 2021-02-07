package service;

import dao.PersonDao;
import dao.PersonDaoImpl;

/**
 * @author jingzhidematong
 * @date 2021/2/7
 */
public class PersonServiceImpl implements PersonService {

    private PersonDao personDao = new PersonDaoImpl();

    public void getPerson() {
        personDao.getPerson();
    }
}
