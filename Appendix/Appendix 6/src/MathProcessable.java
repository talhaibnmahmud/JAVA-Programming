public interface MathProcessable {
    String SEPARATOR = " ";
    String getKeyWord();
    char getSymbol();
    double doCalculation(double leftValue, double rightValue) throws UnableToPerformCalculationException;
}