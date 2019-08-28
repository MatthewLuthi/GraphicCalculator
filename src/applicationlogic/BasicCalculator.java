package applicationlogic;

public class BasicCalculator implements Calculator {

    private double value;
    //private int result;

    public BasicCalculator() {
        value = 0;
    }

    @Override
    public void add(double n) {
        value += n;
    }

    @Override
    public void subtract(double n) {
        value -= n;
    }

    @Override
    public void multiply(double n) {
        value *= n;
    }

    @Override
    public void divide(double n) {
        value /= n;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public void clear() {
        value = 0;
    }
}
