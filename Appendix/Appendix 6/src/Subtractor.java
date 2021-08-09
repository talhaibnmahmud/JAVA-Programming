public class Subtractor extends CalculateBase implements MathProcessable {
    @Override
    public void calculate() {
        double value = getLeftValue() - getRightValue();
        setResult(value);
    }

    @Override
    public String getKeyWord() {
        return "subtract";
    }

    @Override
    public char getSymbol() {
        return '-';
    }

    @Override
    public double doCalculation(double leftValue, double rightValue) {
        setLeftValue(leftValue);
        setRightValue(rightValue);
        calculate();

        return getResult();
    }
}