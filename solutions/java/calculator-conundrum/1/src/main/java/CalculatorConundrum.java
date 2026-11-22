class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int result;

        if ("+".equals(operation)) {
            result = operand1 + operand2;
        } else if ("*".equals(operation)) {
            result = operand1 * operand2;
        } else if ("/".equals(operation)) {
            try {
                result = operand1 / operand2;   
            } catch(ArithmeticException e) {
                throw new IllegalOperationException("Division by zero is not allowed", e);
            }
            
        } else if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if ("".equals(operation)){
            throw new IllegalArgumentException("Operation cannot be empty");
        } else {
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }
}
