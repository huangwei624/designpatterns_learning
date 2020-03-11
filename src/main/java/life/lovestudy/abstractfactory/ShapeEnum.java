package life.lovestudy.abstractfactory;

public enum ShapeEnum {
	Circle(1, "圆"),
	Square(2,"正方形"),
	Rectangle(3, "长方形")
	;
	
	private int id;
	private String name;
	
	ShapeEnum(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
