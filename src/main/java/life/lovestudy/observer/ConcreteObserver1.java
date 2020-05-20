package life.lovestudy.observer;

/**
 * Create by huangwei on 2020/5/20 0020
 */
public class ConcreteObserver1 implements Observer {

    // 该观察者扮演的角色
    private String role;

    public ConcreteObserver1(String role) {
        this.role = role;
    }

    /**
     * 观察者在接收到更改通知后， 执行这个方法
     */
    @Override
    public void update() {
        System.out.println(this.role + "收到了通知， 可以执行更新操作，。。。");
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
