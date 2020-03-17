package life.lovestudy.builder;

public class StrawberryBuilder implements FruitBuilder{
	
	private Fruit fruit;
	
	public StrawberryBuilder(Fruit fruit) {
		this.fruit = fruit;
	}
	
	@Override
	public FruitBuilder washFruit() {
		this.fruit.setClean("干净的草莓");
		System.out.println("清洗草莓");
		return this;
	}
	
	@Override
	public FruitBuilder selectFruit() {
		this.fruit.setQuality("优质的草莓");
		System.out.println("挑选优质的草莓");
		return this;
	}
	
	@Override
	public FruitBuilder packagedFruit() {
		this.fruit.setDecoration("包装好的草莓");
		System.out.println("包装草莓");
		return this;
	}
	
	@Override
	public Fruit build() {
		return this.fruit;
	}
}
