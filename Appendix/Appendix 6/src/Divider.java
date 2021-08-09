public class Divider extends CalculateBase implements MathProcessable {
    @Override
    public void calculate() {
        double value = getLeftValue() / getRightValue();
        setResult(value);
    }

    @Override
    public String getKeyWord() {
        return "divide";
    }

    @Override
    public char getSymbol() {
        return '/';
    }

    @Override
    public double doCalculation(double leftValue, double rightValue) throws UnableToPerformCalculationException {
        if(rightValue == 0) {
            throw new UnableToPerformCalculationException("Argument 'Divisor' is 0");
        }

        setLeftValue(leftValue);
        setRightValue(rightValue);
        calculate();

        return getResult();
    }
}