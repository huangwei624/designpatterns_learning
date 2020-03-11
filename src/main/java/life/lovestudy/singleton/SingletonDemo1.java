package life.lovestudy.singleton;

// 饿汉式：线程安全，实现简单； 当类被加载和初始化的时候这个单例就会被分配存储空间，
public class SingletonDemo1 {
	
	private static SingletonDemo1 instance = new SingletonDemo1();
	private SingletonDemo1(){}
	
	public SingletonDemo1 getInstance(){return instance;}
	
}
