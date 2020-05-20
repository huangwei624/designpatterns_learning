package life.lovestudy.strategy;

/**
 * Create by huangwei on 2020/5/20 0020
 */
public class AirTravelStrategy implements TravelStrategy {
    /**
     * 旅行策略
     */
    @Override
    public void travelPlay() {
        System.out.println("乘飞机去旅行。。。");
    }
}
