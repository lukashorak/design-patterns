package factory;

public class ShapeFactory {

	public enum ShapeType {
		CIRCLE, SQUARE, RECTANGLE
	};

	public Shape getShape(ShapeType shapeType) {
		if (shapeType == null) {
			return null;
		}

		switch (shapeType) {
		case CIRCLE:
			return new Circle();
		case SQUARE:
			return new Square();
		case RECTANGLE:
			return new Rectangle();
		default:
			return null;
		}

	}

}
