package life.lovestudy.strategy;

/**
 * Create by huangwei on 2020/5/20 0020
 */
public class Main {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        TrainTravelStrategy trainTravelStrategy = new TrainTravelStrategy();
        AirTravelStrategy airTravelStrategy = new AirTravelStrategy();
        traveler.setTravelStrategy(trainTravelStrategy);
        traveler.travel();
        traveler.setTravelStrategy(airTravelStrategy);
        traveler.travel();
    }
}
