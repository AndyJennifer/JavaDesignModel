package factory;

import factory.factory_method.AFactory;

/**
 * Author:  andy.xwt
 * Date:    2019-04-11 14:07
 * Description:
 */

public class TestFactory {

    public static void main(String[] args) {
        AFactory aFactory = new AFactory();
        Product1 product1 = aFactory.createProduct();
        product1.method();
    }
}
