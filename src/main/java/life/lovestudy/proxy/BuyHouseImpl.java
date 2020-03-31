package life.lovestudy.proxy;

public class BuyHouseImpl implements BuyHouse {
	@Override
	public void buy() {
		System.out.println("前期准备工作已经完成，开始买房！");
	}
}
