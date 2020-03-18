package life.lovestudy.prototype;

import java.io.*;
import java.util.List;

// 具体原型类
public class Student implements Cloneable, Prototype<Student>, Serializable{
	private String name;
	private List<String> courses;   // 课程
	
	public Student(String name, List<String> courses) {
		this.name = name;
		this.courses = courses;
	}
	
	@Override
	public Student weekClone() throws CloneNotSupportedException {
		return (Student) super.clone();
	}
	
	@Override
	public Student deepClone() throws IOException, ClassNotFoundException {
		// 对象输出流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		// 对象输入流
		ByteArrayInputStream bai = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bai);
		return (Student) ois.readObject();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getCourses() {
		return courses;
	}
	
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
}
