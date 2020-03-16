package creational.abstractfactory;

public class FactoryProvider {

    public static AbstractShapeFactory getFactory(ShapeType shapeType) {
        AbstractShapeFactory shapeFactory = null;
        switch (shapeType) {
            case TwoD:
                shapeFactory = new TwoDShapeFactory();
                break;
            case ThreeD:
                shapeFactory = new ThreeDShapeFactory();
                break;
            default:
                break;
        }
        return shapeFactory;
    }
}
