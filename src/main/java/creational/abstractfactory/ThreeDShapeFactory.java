package creational.abstractfactory;

public class ThreeDShapeFactory extends AbstractShapeFactory<ThreeDShape>{

    @Override
    public  ThreeDShape getShape(Shapes shape){

        ThreeDShape threeDShape = null;

        switch (shape){
            case Cylinder:
                threeDShape = new Cylinder();
                break;
            case Cuboid:
                threeDShape = new Cuboid();
                break;
            default:
                break;
        }
        return  threeDShape;

    }
}
