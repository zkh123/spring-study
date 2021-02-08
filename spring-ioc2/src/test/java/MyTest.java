import com.hlj.spring.dao.*;
import com.hlj.spring.service.PersonService;
import com.hlj.spring.service.PersonServiceImpl;

/**
 * @author jingzhidematong
 * @date 2021/2/7
 */
public class MyTest {

    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test2(){
        PersonService personService = new PersonServiceImpl();
//        ((PersonServiceImpl) personService).setPersonDao(new PersonDaoImpl());
//        ((PersonServiceImpl) personService).setPersonDao(new MysqlDaoImpl());
        ((PersonServiceImpl) personService).setPersonDao(new OracleDaoImpl());
//        ((PersonServiceImpl) personService).setPersonDao(new SqlServerDaoImpl());
        personService.getPerson();
    }

    private static void test1(){
        PersonService personService = new PersonServiceImpl();
        personService.getPerson();
    }

}