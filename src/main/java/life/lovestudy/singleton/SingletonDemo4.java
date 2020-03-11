package life.lovestudy.singleton;

// 懒汉式：内部类，静态内部类不随着外部类的加载而加载
public class SingletonDemo4 {

	private SingletonDemo4(){};
	
	public SingletonDemo4 getInstance(){
		return InstanceClass.singletonDemo4;
	}
	
	private static class InstanceClass{
		static SingletonDemo4 singletonDemo4 = new SingletonDemo4();
	}
}
