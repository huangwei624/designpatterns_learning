package life.lovestudy.abstractfactory;

import javax.sound.sampled.Port;

/**
 * @title
 * @description
 * @author huangwei
 * @createDate 2021/1/13
 * @version 1.0
 */
public class HighQualityProduct implements Product{

    @Override
    public void showProductDes() {
        System.out.println("高质量产品");
    }
}
