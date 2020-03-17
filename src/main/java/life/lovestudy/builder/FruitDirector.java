package life.lovestudy.builder;

public class FruitDirector {
	
	public static Fruit constructFruit(FruitBuilder fruitBuilder){
		return fruitBuilder.washFruit()    // 清洗
				.selectFruit()      // 挑选
				.packagedFruit()    // 打包
				.build();           // 构建
	}

}
