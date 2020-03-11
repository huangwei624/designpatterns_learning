package life.lovestudy.abstractfactory;

public class Main {
	public static void main(String[] args){
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape rectangle = shapeFactory.getShape(ShapeEnum.Rectangle);
		rectangle.draw();
		
		ColorFactory colorFactory = new ColorFactory();
		Color yellow = colorFactory.getColor(ColorEnum.Yellow);
		yellow.show();
	}
}
