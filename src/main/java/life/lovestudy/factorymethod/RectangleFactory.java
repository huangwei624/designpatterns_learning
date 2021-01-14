package life.lovestudy.factorymethod;

/**
 * @title 长方向创建工厂
 * @description
 * @author huangwei
 * @createDate 2021/1/13
 * @version 1.0
 */
public class RectangleFactory {

    /**
     * 创建
     * @return
     */
    public Rectangle getRectangle() {
        return new Rectangle();
    }
}
