package life.lovestudy.singleton;

// 懒汉式：线程不安全，
public class SingletonDemo2 {
	private static SingletonDemo2 instance;
	private SingletonDemo2(){};
	
	public SingletonDemo2 getInstance(){
		if(instance == null){   // 这里线程不安全
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
