package life.lovestudy.proxy;

import java.lang.reflect.Proxy;

// 测试类
public class Main {
	public static void main(String[] args){
		BuyHouseImpl buyHouse = new BuyHouseImpl();
		BuyHouse bh = (BuyHouse) Proxy.newProxyInstance(Main.class.getClassLoader(), buyHouse.getClass().getInterfaces(),
				new BuyHouseProxy(buyHouse));
		bh.buy();
	}
}
