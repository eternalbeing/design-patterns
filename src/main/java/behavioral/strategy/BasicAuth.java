package behavioral.strategy;

public class BasicAuth implements Strategy {
    @Override
    public boolean authenticate() {
        System.out.println("Basic Auth");
        return true;
    }
}
