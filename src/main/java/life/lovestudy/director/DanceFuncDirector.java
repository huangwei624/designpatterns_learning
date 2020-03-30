package life.lovestudy.director;

public class DanceFuncDirector extends DirectorRule {
	
	public DanceFuncDirector(ToyRule toy) {
		super(toy);
	}
	
	@Override
	public void baseFunc() {
		// 基础功能
		super.baseFunc();
		// 附加功能
		dance();
	}
	
	private void dance(){
		System.out.println("添加了附加功能-------dance");
	}
}
