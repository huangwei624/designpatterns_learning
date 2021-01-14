package life.lovestudy.abstractfactory;

/**
 * @title
 * @description
 * @author huangwei
 * @createDate 2021/1/13
 * @version 1.0
 */
public class LongLifeProduct implements Product {

    @Override
    public void showProductDes() {
        System.out.println("长寿命产品");
    }
}
