package life.lovestudy.abstractfactory;

public class ColorFactory extends AbstractFactory {
	
	@Override
	public Color getColor(ColorEnum colorEnum) {
		if(colorEnum==null){
			throw new RuntimeException("参数不能为空");
		}
		if(colorEnum == ColorEnum.Yellow) return new Yellow();
		return new Blue();
	}
}
