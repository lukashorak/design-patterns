package factory;

import factory.ShapeFactory.ShapeType;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		ShapeFactory sf = new ShapeFactory();

		Shape shape1 = sf.getShape(ShapeType.CIRCLE);
		shape1.draw();

		Shape shape2 = sf.getShape(ShapeType.SQUARE);
		shape2.draw();

		Shape shape3 = sf.getShape(ShapeType.RECTANGLE);
		shape3.draw();
	}

}
