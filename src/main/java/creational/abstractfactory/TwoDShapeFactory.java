package creational.abstractfactory;

public class TwoDShapeFactory extends AbstractShapeFactory<TwoDShape>{

    @Override
    public  TwoDShape getShape(Shapes shape) {

        TwoDShape twoDShape = null;

        switch (shape) {
            case Line:
                twoDShape = new Line();
                break;
            case Rectangle:
                twoDShape = new Rectangle();
                break;
            default:
                break;
        }
        return twoDShape;

    }
}
