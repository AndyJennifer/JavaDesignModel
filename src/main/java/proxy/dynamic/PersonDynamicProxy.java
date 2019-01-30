package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author:  andy.xwt
 * Date:    2019/1/29 11:26
 * Description:动态代理模式
 */


public class PersonDynamicProxy {

    @SuppressWarnings("unchecked")
    public <T> T create(Class<T> service) {
        return (T) Proxy.newProxyInstance(service.getClassLoader(), new Class<?>[]{service}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().contains("laugh")) {
                    System.out.println("dynamic proxy---->laugh");
                } else {
                    System.out.println("dynamic proxy---->run");
                }
                return null;
            }
        });

    }
}
