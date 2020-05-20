package life.lovestudy.observer;

/**
 * Create by huangwei on 2020/5/20 0020
 */
public interface Subject {
    /**
     * 添加一个观察者
     *
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 删除一个观察者
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知所有的观察者
     */
    void notifyAllObserver();
}
