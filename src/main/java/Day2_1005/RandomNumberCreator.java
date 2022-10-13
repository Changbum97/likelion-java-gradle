package Day2_1005;

public class RandomNumberCreator implements NumberCreator {
    @Override
    public int makeNumber() {
        return (int) (Math.random() * 10);
    }
}