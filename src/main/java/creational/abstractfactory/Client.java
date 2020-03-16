package creational.abstractfactory;

public class Client {

    public static void main(String[] args) {

        AbstractShapeFactory<ThreeDShape> factory = FactoryProvider.getFactory(ShapeType.ThreeD);
        ThreeDShape shape = factory.getShape(Shapes.Cuboid);
        System.out.println(shape.get3DShape());

    }

}
