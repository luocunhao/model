package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author luoch
 * @Date 2018-08-10 11:02
 * @Desc 代理工厂类
 */
public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target){
        this.target = target;
    }
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("--before--");
                        Object retValue = method.invoke(target,args);
                        System.out.println("--after--");
                        return retValue;
                    }
                }
        );
    }
}

