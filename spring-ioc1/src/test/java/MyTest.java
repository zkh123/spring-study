import service.UserService;
import service.UserServiceImpl;

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
