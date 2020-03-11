package life.lovestudy.abstractfactory;

public enum ColorEnum {
	Red(1, "红"),
	Blue(2,"蓝"),
	Yellow(3, "黄")
	;
	
	private int id;
	private String name;
	
	ColorEnum(int id, String name) {
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
