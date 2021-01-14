package life.lovestudy.abstractfactory;

/**
 * @title
 * @description
 * @author huangwei
 * @createDate 2021/1/13
 * @version 1.0
 */
public class LongLifeProductFactory implements AbstractFactory {

    @Override
    public Product getProduct() {
        return new LongLifeProduct();
    }
}
