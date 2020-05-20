package life.lovestudy.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by huangwei on 2020/5/20 0020
 */
public class ConcreteSubject implements Subject {

    // 观察者集合
    private List<Observer> observers = new ArrayList<>();

    /**
     * 添加一个观察者
     *
     * @param observer
     */
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除一个观察者
     *
     * @param observer
     */
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有的观察者
     */
    @Override
    public void notifyAllObserver() {
        // 通知所有的观察者，每一个观察者执行更新操作
        observers.forEach(Observer::update);
    }
}
