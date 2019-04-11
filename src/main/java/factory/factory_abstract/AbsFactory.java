package factory.factory_abstract;

import factory.Product1;
import factory.Product2;

/**
 * Author:  andy.xwt
 * Date:    2019-04-11 14:23
 * Description:抽象工厂模式
 * 定义：创建一组相关或者是相互依赖的对象提供一个接口，而不需要指定他们的具体类。
 * <p>
 * 抽象工厂与工厂方法的区别为以下两点：
 * 1.抽象产品
 * 工厂方法只有一个抽象产品，而抽象工厂模式有多个。
 * 2.创建产品的接口
 * 工厂方法只有一个，而抽象工厂模式有多个。
 */

public abstract class AbsFactory {

    /**
     * 产品1
     */
    public abstract Product1 createProduct1();

    /**
     * 产品2
     */
    public abstract Product2 createProduct2();
}
