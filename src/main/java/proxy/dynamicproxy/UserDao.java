package proxy.dynamicproxy;

/**
 * @Author luoch
 * @Date 2018-08-10 10:36
 * @Desc 目标角色
 */
public class UserDao implements IUserDao{
    public void save() {
        System.out.println("--存入数据--");
    }
}
