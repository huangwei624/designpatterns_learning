package life.lovestudy.prototype;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 访问类
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		String[] courses = {"数学", "英语", "语文"};
		//List<String> collect = Arrays.stream(courses).collect(Collectors.toList());
		Student stu1 = new Student("张三", Arrays.asList(courses));
		// 浅克隆
		Student stu2 = stu1.weekClone();
		System.out.println(stu1 == stu2);   // false
		System.out.println(stu1.getCourses() == stu2.getCourses()); // true
		stu2.setName("李四");
		System.out.println(stu1.getName().equals(stu2.getName()));  // false
		
		// 深克隆
		Student stu3 = stu1.deepClone();
		System.out.println(stu1 == stu3);   // false
		System.out.println(stu1.getCourses() == stu3.getCourses());     // false
	}
}
