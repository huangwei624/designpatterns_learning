package life.lovestudy.proxy;

// 动态代理 ，模拟买房代理
public interface BuyHouse {
	// 买房前需要对地段、价格、房型等信息进行了解，买房后也需要办理一些手续。
	void buy();
}
