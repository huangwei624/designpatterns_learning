package life.lovestudy.director;

public class SingFuncDirector extends DirectorRule {
	
	public SingFuncDirector(ToyRule toy) {
		super(toy);
	}
	
	@Override
	public void baseFunc() {
		// 基础功能
		super.baseFunc();
		// 附加功能
		sing();
	}
	
	private void sing(){
		System.out.println("添加了附加功能-------唱歌");
	}
}
