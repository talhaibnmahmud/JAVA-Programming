public abstract class CalculateBase {
    private double leftValue;
    private double rightValue;
    private double result;

    double getLeftValue() { return leftValue; }
    void setLeftValue(double leftValue) { this.leftValue = leftValue; }

    double getRightValue() { return rightValue; }
    void setRightValue(double rightValue) { this.rightValue = rightValue; }

    double getResult() { return result; }
    void setResult(double result) { this.result = result; }

    public abstract void calculate();
}