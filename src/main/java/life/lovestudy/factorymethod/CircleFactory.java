package life.lovestudy.factorymethod;

/**
 * @title 圆创建工厂
 * @description
 * @author huangwei
 * @createDate 2021/1/13
 * @version 1.0
 */
public class CircleFactory {

    /**
     * 创建
     * @return
     */
    public Circle getCircle() {
        return new Circle();
    }

}
