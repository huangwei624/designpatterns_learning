package life.lovestudy.singleton;

// 懒汉式：双从判断+synchronized，线程安全，提倡使用这种方式
public class SingletonDemo3 {
	private static SingletonDemo3 instance;
	private SingletonDemo3(){};
	
	public static SingletonDemo3 getInstance(){
		if (instance==null) {
			synchronized (SingletonDemo3.class) {
				if(instance == null){
					instance = new SingletonDemo3();
				}
			}
		}
		return instance;
	}
}
