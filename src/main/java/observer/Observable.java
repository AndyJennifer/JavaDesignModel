package observer;

/**
 * Author:  andy.xwt
 * Date:    2019-04-11 14:50
 * Description: 观察者模式
 * 定义：对象间一种一对多的依赖关系(注意是一对多，而不是我们之前的一般回调)，使得每当一个对象改变状态，则所有依赖它的对象都会得到通知并自动更新
 */

public class Observable extends java.util.Observable {


    public void postEvent(String content) {
        setChanged();
        notifyObservers(content);
    }

}
