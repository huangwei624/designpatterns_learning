package life.lovestudy.builder;

public class MainTest {
	
	public static void main(String[] args){
		// 生产合格的葡萄
		Fruit Grape = FruitDirector.constructFruit(new GrapeBuilder(new Fruit()));
		System.out.println(Grape.getClean());
		System.out.println(Grape.getQuality());
		System.out.println(Grape.getDecoration());
		
		// 生产合格的草莓
		Fruit Strawberry = FruitDirector.constructFruit(new StrawberryBuilder(new Fruit()));
		System.out.println(Strawberry.getClean());
		System.out.println(Strawberry.getQuality());
		System.out.println(Strawberry.getDecoration());
	}
	
}
