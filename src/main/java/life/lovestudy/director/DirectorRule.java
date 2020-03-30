package life.lovestudy.director;

// 装饰者规范
public class DirectorRule implements ToyRule{
	
	ToyRule toy;
	
	public DirectorRule(ToyRule toy) {
		this.toy = toy;
	}
	
	// 要对哪个功能进行装饰
	@Override
	public void baseFunc() {
		// 这里可以做基础操作
		toy.baseFunc();
	}
}
