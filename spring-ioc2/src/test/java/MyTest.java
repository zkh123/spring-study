import service.PersonService;
import service.PersonServiceImpl;

/**
 * @author jingzhidematong
 * @date 2021/2/7
 */
public class MyTest {

    public static void main(String[] args) {
        PersonService personService = new PersonServiceImpl();
        personService.getPerson();
    }

}
