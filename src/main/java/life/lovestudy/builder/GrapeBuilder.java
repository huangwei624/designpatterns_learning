package life.lovestudy.builder;

public class GrapeBuilder implements FruitBuilder {
	
	private Fruit fruit;
	
	public GrapeBuilder(Fruit fruit) {
		this.fruit = fruit;
	}
	
	@Override
	public FruitBuilder washFruit() {
		this.fruit.setClean("干净的葡萄");
		System.out.println("清洗葡萄");
		return this;
	}
	
	@Override
	public FruitBuilder selectFruit() {
		this.fruit.setQuality("优质的葡萄");
		System.out.println("挑选优质的葡萄");
		return this;
	}
	
	@Override
	public FruitBuilder packagedFruit() {
		this.fruit.setDecoration("包装好的葡萄");
		System.out.println("包装葡萄");
		return this;
	}
	
	@Override
	public Fruit build() {
		return this.fruit;
	}
}
