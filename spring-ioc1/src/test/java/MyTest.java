import com.hlj.spring.service.UserService;
import com.hlj.spring.service.UserServiceImpl;

/**
 * @author jingzhidematong
 * @date 2021/2/7
 */
public class MyTest {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }

}
