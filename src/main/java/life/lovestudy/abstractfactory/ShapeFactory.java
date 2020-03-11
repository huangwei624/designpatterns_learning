package life.lovestudy.abstractfactory;

public class ShapeFactory extends AbstractFactory{
	
	@Override
	public Shape getShape(ShapeEnum shapeEnum) {
		if (shapeEnum==null){
			throw new RuntimeException("参数不能为空");
		}
		if(shapeEnum == ShapeEnum.Circle){
			return new Circle();
		}
		return new Square();
	}
}
