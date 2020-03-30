package life.lovestudy.director;

public class Main {
	public static void main(String[] args){
		Toy toy = new Toy();
		toy.baseFunc();
		System.out.println("----------------");
		// 包装跳舞功能
		DanceFuncDirector danceFuncDirector = new DanceFuncDirector(toy);
		danceFuncDirector.baseFunc();
		System.out.println("------------------");
		// 包装唱歌功能
		SingFuncDirector singFuncDirector = new SingFuncDirector(danceFuncDirector);
		singFuncDirector.baseFunc();
	}
}
