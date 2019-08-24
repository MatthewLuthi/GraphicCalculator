package applicationlogic;

public class BasicCalculator implements Calculator {

    private int value;

    public BasicCalculator() {
        value = 0;
    }

    @Override
    public void add(int n) {
        value += n;
    }

    @Override
    public void subtract(int n) {
        value -= n;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void clear() {
        value = 0;
    }
}
