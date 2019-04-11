package factory.factory_static;

import factory.Product1;
import factory.factory_method.AProduct1;

/**
 * Author:  andy.xwt
 * Date:    2019-04-11 14:11
 * Description:简单工厂模式（静态工厂模式）
 * 定义：当我们的工厂有且只有一个的时候，那么就简化掉抽象工厂。
 */

public class StaticFactory {

    public static Product1 createProduct() {
        return new AProduct1();
    }
}
