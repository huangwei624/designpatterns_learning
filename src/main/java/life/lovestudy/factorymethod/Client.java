package life.lovestudy.factorymethod;

public class Client {
	public static void main(String[] args){
		CircleFactory circleFactory = new CircleFactory();
		Circle circle = circleFactory.getCircle();
		circle.draw();

		RectangleFactory rectangleFactory = new RectangleFactory();
		Rectangle rectangle = rectangleFactory.getRectangle();
		rectangle.draw();
	}
}
