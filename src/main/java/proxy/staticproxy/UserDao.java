package proxy.staticproxy;

/**
 * @Author luoch
 * @Date 2018-08-10 10:19
 * @Desc 目标对象
 */
public class UserDao implements IUserDao {
    public void save() {
        System.out.println("--保存数据--");
    }
}
