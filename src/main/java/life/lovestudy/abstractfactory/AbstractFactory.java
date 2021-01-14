package life.lovestudy.abstractfactory;

/**
 * 抽象工厂
 */
public interface AbstractFactory {

	Product getProduct();

	/**
	 * 获取产品工厂
	 * @param factoryName
	 * @return
	 */
	static AbstractFactory getFactory(String factoryName) {
		if ("longlife".equals(factoryName)) {
			return new LongLifeProductFactory();
		} else if ("highquality".equals(factoryName)) {
			return new HighQualityProductFactory();
		} else {
			throw new IllegalArgumentException("invalid factory name");
		}
	}

}
