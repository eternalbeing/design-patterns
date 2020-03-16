package creational.abstractfactory;

public abstract class AbstractShapeFactory<T> {

    abstract T getShape(Shapes shape);

}
