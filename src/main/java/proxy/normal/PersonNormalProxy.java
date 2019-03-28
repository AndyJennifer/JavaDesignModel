package proxy.normal;


import proxy.Person;

/**
 * Author:  andy.xwt
 * Date:    2019/1/29 11:19
 * Description:传统代理模式，代理类需要继承或实现被代理类相同的父类或接口
 */


public class PersonNormalProxy implements Person {

    private Man mMan;//持有被代理对象的引用

    public PersonNormalProxy(Man man) {
        mMan = man;
    }

    @Override
    public void laugh() {
        System.out.println("normal proxy--->");
        mMan.laugh();
    }

    @Override
    public void run() {
        System.out.println("normal proxy--->");
        mMan.run();
    }
}
