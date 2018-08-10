package proxy.dynamicproxy;

/**
 * @Author luoch
 * @Date 2018-08-10 11:14
 * @Desc
 */
public class Client {
    public static void main(String[] args) {
        IUserDao target = new UserDao();
        System.out.println(target.getClass());
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.save();
    }
}
