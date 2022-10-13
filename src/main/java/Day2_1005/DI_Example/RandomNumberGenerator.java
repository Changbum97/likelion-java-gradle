package Day2_1005.DI_Example;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int makeNumber() {
        return (int) (Math.random() * 10);
    }
}
