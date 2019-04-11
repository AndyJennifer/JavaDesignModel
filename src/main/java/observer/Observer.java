package observer;

import java.util.Observable;

/**
 * Author:  andy.xwt
 * Date:    2019-04-11 15:47
 * Description:
 */

public class Observer implements java.util.Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("跟新" + arg);
    }
}
