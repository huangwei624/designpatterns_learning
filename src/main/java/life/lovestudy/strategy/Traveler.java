package life.lovestudy.strategy;

/**
 * Create by huangwei on 2020/5/20 0020
 */
public class Traveler {
    private TravelStrategy travelStrategy;

    public TravelStrategy getTravelStrategy() {
        return travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    /**
     * 执行旅行策略
     */
    public void travel(){
        this.travelStrategy.travelPlay();
    }
}
