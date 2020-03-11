package life.lovestudy.factorymethod;

public class Main {
	public static void main(String[] args){
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape rectangle = shapeFactory.createShape(ShapeEnum.Rectangle);
		rectangle.draw();
		Shape circle = shapeFactory.createShape(ShapeEnum.Circle);
		circle.draw();
		Shape square = shapeFactory.createShape(ShapeEnum.Square);
		square.draw();
	}
}
