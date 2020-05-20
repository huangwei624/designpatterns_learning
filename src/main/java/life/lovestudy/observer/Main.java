package life.lovestudy.observer;

/**
 * Create by huangwei on 2020/5/20 0020
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver1 observer1 = new ConcreteObserver1("观察者1");
        ConcreteObserver2 observer2 = new ConcreteObserver2("观察者2");
        subject.attach(observer1);
        subject.attach(observer2);
        subject.notifyAllObserver();
        System.out.println("====================");
        subject.detach(observer1);
        subject.notifyAllObserver();
    }
}
