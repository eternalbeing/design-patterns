package behavioral.strategy;

public class OAuth implements Strategy {
    @Override
    public boolean authenticate() {
        System.out.println("OAuth strategy");
        return false;
    }
}
