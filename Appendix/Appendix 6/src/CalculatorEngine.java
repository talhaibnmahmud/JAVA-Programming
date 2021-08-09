class CalculatorEngine {
    private MathProcessable[] handlers;

    CalculatorEngine(MathProcessable[] handlers) {
        this.handlers = handlers;
    }

    String process(String statement) throws InvalidStatementException {
        String[] parts = statement.split(MathProcessable.SEPARATOR);
        if(parts.length != 3) {
            throw new InvalidStatementException(
                    "Incorrect number of fields", statement);
        }

        String keyword = parts[0];

        MathProcessable theHandler = null;
        for(MathProcessable handler : handlers) {
            if(keyword.equalsIgnoreCase(handler.getKeyWord())) {
                theHandler = handler;
                break;
            }
        }

        if(theHandler == null) {
            return "Command Not Found!";
        }

        double leftValue = Double.parseDouble(parts[1]);
        double rightValue = Double.parseDouble(parts[2]);
        Double result = null;

        try {
            result = theHandler.doCalculation(leftValue, rightValue);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return String.valueOf(leftValue) + ' '
                + theHandler.getSymbol() + ' '
                + rightValue + " = " + result;
    }
}
