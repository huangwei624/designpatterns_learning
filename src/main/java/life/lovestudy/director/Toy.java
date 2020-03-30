package life.lovestudy.director;

public class Toy implements ToyRule {
	@Override
	public void baseFunc() {
		System.out.println("这个玩具只具有基础功能 ----- 运动");
	}
}
