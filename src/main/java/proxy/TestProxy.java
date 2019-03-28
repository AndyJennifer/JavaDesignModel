package proxy;

import proxy.dynamic.PersonDynamicProxy;
import proxy.normal.Man;
import proxy.normal.PersonNormalProxy;

/**
 * Author:  andy.xwt
 * Date:    2019/1/29 11:23
 * Description:
 *
 * 代理模式的使用场景：
 * 当无法或不想直接访问某个对象，或者访问某个对象存在困难时，就可以通过一个代理对象来间接访问，
 * 为了保证科幻的使用的透明性，委托对象与代理对象需要实现相同的接口。
 *
 * 静态代理与动态代理的区别：
 * 静态代理：在我们的代码运行前，代理类的class文件就已经存在。
 * 动态代理：通过反射机制动态的生成代理者的对象，也就是说代理谁（生成谁的代理对象）我们会在执行阶段决定
 *
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
