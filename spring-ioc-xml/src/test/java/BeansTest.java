import com.hlj.spring.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jingzhidematong
 * @date 2021/2/8
 */
public class BeansTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        PersonService personService = (PersonService) context.getBean("personService");
        personService.getPerson();
    }

}
