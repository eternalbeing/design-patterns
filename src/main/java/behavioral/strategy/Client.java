package behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new BasicAuth());
        context.executeStrategy();
    }
}
