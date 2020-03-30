package life.lovestudy.director;

// 使用装饰者设计模式，把一个只有 运动 基础功能的玩具进行装饰，让它带有唱歌， 跳舞的功能
public interface ToyRule {
	// 具有基础功能的 toy规则
	default void baseFunc() {}
}
