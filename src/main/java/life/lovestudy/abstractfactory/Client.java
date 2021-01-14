package life.lovestudy.abstractfactory;

/**
 * @title
 * @description
 * @author huangwei
 * @createDate 2021/1/13
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory longlifeFactory = AbstractFactory.getFactory("longlife");
        Product product = longlifeFactory.getProduct();
        product.showProductDes();

        AbstractFactory highqualityFactory = AbstractFactory.getFactory("highquality");
        Product product2 = highqualityFactory.getProduct();
        product2.showProductDes();
    }

}
