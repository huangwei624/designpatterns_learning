package life.lovestudy.builder;

/**
 * 场景描述：比如说有个农场公司，专门向市场销售各类水果。在这个系统里需要描述下列的水果
 * 葡萄 Grape
 * 草莓 Strawberry
 *
 * 随着农场的不断发展扩大，客户也对你出售的水果有很多不满和建议。你总结了一下，发现客户主要的问题是：
 * 1、水果太脏，不卫生。
 * 2、卖给客户的水果大小不一，外形不好看
 * 3、包装太简陋了
 *
 * 你决心解决这些问题，那就是要清洗水果、挑选优质的水果、给水果进行包装。你决定引进流水线，招人。
 * 1、你要得到的产品：干净、优质、包装过的水果（Product）
 * 2、你招聘了一位工艺师给你制定了水果各个流程工艺（清洗工艺、挑选规则、包装工艺）(Builder)
 * 3、你招聘流水线工人进行各种水果生产(ConcreteBuilder)
 * 4、你制定了生产顺序，决定暂时开两条流水线来生产苹果、葡萄，观察效果如何(Director)
 */
// 如何产生优质的水果，指定了三个规则
public interface FruitBuilder {
	
	// 清洗工艺
	FruitBuilder washFruit();
	
	// 挑选规则
	FruitBuilder selectFruit();
	
	// 包装工艺
	FruitBuilder packagedFruit();
	
	// 创建这样的水果
	Fruit build();
}
