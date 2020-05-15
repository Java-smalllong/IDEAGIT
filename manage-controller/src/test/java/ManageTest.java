import com.liuxiaochang.pojo.Users;
import com.liuxiaochang.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Auther: 刘小长
 * @Date: 2020/5/15
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-trans.xml")
public class ManageTest {
    @Autowired
    private UsersService usersServiceImpl;
    @Test
    public void mapperTest(){
        List<Users> list = this.usersServiceImpl.findAllUsers();
        for (Users users:list) {
            System.out.println(users);
        }
    }
}
