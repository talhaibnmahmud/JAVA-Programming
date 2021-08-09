public class PowerOf extends CalculateBase implements MathProcessable {
    @Override
    public void calculate() {
        double pow = Math.pow(getLeftValue(), getRightValue());
        setResult(pow);
    }

    @Override
    public String getKeyWord() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double leftValue, double rightValue) {
        setLeftValue(leftValue);
        setRightValue(rightValue);
        calculate();

        return getResult();
    }
}