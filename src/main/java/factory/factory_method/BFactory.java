package factory.factory_method;

import factory.Product1;
import factory.factory_method.BProduct1;
import factory.factory_method.Factory;

/**
 * Author:  andy.xwt
 * Date:    2019-04-11 14:05
 * Description:
 */

public class BFactory extends Factory {
    @Override
    public Product1 createProduct() {
        return new BProduct1();
    }
}
