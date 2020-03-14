package creational.factory;

public class PolygonFactory {

    public Polygon getPolygon(int sides) {
        Polygon polygon = null;

        switch (sides) {
            case 3:
                polygon = new Triangle();
                break;
            case 4:
                polygon = new Square();
                break;
            case 5:
                polygon = new Pentagon();
                break;
            default:
                polygon = null;
                break;
        }

        return polygon;
    }

}
