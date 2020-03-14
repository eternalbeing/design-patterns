package creational.factory;

public class Client {
    public static void main(String[] args) {
        PolygonFactory factory = new PolygonFactory();
        Polygon polygon = factory.getPolygon(3);
        System.out.println(polygon.getType());

    }
}
