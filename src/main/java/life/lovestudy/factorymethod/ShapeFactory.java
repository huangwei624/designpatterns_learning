package life.lovestudy.factorymethod;

public class ShapeFactory {
	public Shape createShape(ShapeEnum shape){
		if (shape==null){
			throw new RuntimeException("参数不能为空");
		}
		if(shape == ShapeEnum.Circle){
			return new Circle();
		}
		if (shape==ShapeEnum.Rectangle){
			return new Rectangle();
		}
		return new Square();
	}
}
