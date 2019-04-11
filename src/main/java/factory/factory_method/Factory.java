package factory.factory_method;

import factory.Product1;

/**
 * Author:  andy.xwt
 * Date:    2019-03-03 18:21
 * Description: 工厂方法模式
 * 定义：定义一个用于创建对象的接口，让子类决定实例化哪个类。
 */

public abstract class Factory {

    /**
     * 抽象工厂方法，具体生产什么由子类去实现
     */
    public abstract Product1 createProduct();
}
