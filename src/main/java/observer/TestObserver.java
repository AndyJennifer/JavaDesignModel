package observer;

/**
 * Author:  andy.xwt
 * Date:    2019-04-11 14:48
 * Description:
 */

public class TestObserver {

    public static void main(String[] args) {
        //创建被观察者
        Observable observable = new Observable();
        //创建观察者
        Observer observer1 = new Observer();
        Observer observer2 = new Observer();
        Observer observer3 = new Observer();
        Observer observer4 = new Observer();
        Observer observer5 = new Observer();
        //注册观察者
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);
        observable.addObserver(observer4);
        observable.addObserver(observer5);

        observable.postEvent("xixi");

    }
}
