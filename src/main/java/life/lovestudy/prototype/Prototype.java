package life.lovestudy.prototype;

import java.io.IOException;

// 抽象原型接口
public interface Prototype<T> {
	
	// 浅克隆
	T weekClone() throws CloneNotSupportedException;
	
	// 深克隆
	T deepClone() throws IOException, ClassNotFoundException;
	
}
