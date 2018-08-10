package proxy.staticproxy;

/**
 * @Author luoch
 * @Date 2018-08-10 10:20
 * @Desc 代理对象
 */
public class UserDaoProxy implements IUserDao {
    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    public void save() {
        System.out.println("before");
        target.save();
        System.out.println("after");
    }
}
