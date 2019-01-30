package proxy.normal;

import proxy.Person;

/**
 * Author:  andy.xwt
 * Date:    2019/1/29 11:20
 * Description:
 */


public class Man implements Person {

    @Override
    public void laugh() {
        System.out.println("man laugh");
    }

    @Override
    public void run() {
        System.out.println("man run");
    }
}
