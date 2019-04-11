package factory.factory_method;

import factory.Product1;

/**
 * Author:  andy.xwt
 * Date:    2019-04-11 14:05
 * Description:
 */

public class AFactory extends Factory {
    @Override
    public Product1 createProduct() {
        return new AProduct1();
    }
}
