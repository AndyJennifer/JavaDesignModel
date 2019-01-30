package proxy;

import proxy.dynamic.PersonDynamicProxy;
import proxy.normal.Man;
import proxy.normal.PersonNormalProxy;

/**
 * Author:  andy.xwt
 * Date:    2019/1/29 11:23
 * Description:
 */


class TestProxy {

    public static void main(String[] args) {
        //静态代理
        PersonNormalProxy personNormalProxy = new PersonNormalProxy(new Man());
        personNormalProxy.laugh();
        personNormalProxy.run();
        System.out.println("----------------------");
        //动态代理
        Person person = new PersonDynamicProxy().create(Person.class);
        person.laugh();
        person.run();
    }
}
