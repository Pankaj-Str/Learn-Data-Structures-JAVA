package Day_06;
//www.codeswithpankaj.com
//www.p4n.in

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

// Operator precedence
class Precedence {
    public static final int LOWEST = 0;
    public static final int ADD_SUB = 1;
    public static final int MUL_DIV = 2;
    public static final int EXPONENT = 3;
}

// Expression Parser class
class ExpressionParser {
    private Stack<Character> operatorStack;
    private Queue<String> outputQueue;

    public ExpressionParser() {
        operatorStack = new Stack<>();
        outputQueue = new LinkedList<>();
    }

    public String parse(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                // If the character is a digit, enqueue it directly
                int j = i;
                while (j < expression.length() && (Character.isDigit(expression.charAt(j)) || expression.charAt(j) == '.')) {
                    j++;
                }
                outputQueue.offer(expression.substring(i, j));
                i = j - 1; // Move the index to the end of the number
            } else if (isOperator(c)) {
                // If the character is an operator, process it based on operator precedence
                while (!operatorStack.empty() && isOperator(operatorStack.peek()) && hasHigherPrecedence(operatorStack.peek(), c)) {
                    outputQueue.offer(operatorStack.pop().toString());
                }
                operatorStack.push(c);
            } else if (c == '(') {
                // If the character is an opening parenthesis, push it to the stack
                operatorStack.push(c);
            } else if (c == ')') {
                // If the character is a closing parenthesis, pop operators from the stack and enqueue them until an opening parenthesis is encountered
                while (!operatorStack.empty() && operatorStack.peek() != '(') {
                    outputQueue.offer(operatorStack.pop().toString());
                }
                if (!operatorStack.empty() && operatorStack.peek() == '(') {
                    operatorStack.pop(); // Discard the opening parenthesis
                } else {
                    throw new IllegalArgumentException("Mismatched parentheses");
                }
            }
        }

        // Pop any remaining operators from the stack and enqueue them
        while (!operatorStack.empty()) {
            if (operatorStack.peek() == '(' || operatorStack.peek() == ')') {
                throw new IllegalArgumentException("Mismatched parentheses");
            }
            outputQueue.offer(operatorStack.pop().toString());
        }

        // Build the final parsed expression by joining the elements in the output queue
        StringBuilder parsedExpression = new StringBuilder();
        while (!outputQueue.isEmpty()) {
            parsedExpression.append(outputQueue.poll()).append(" ");
        }
        return parsedExpression.toString().trim();
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    private boolean hasHigherPrecedence(char op1, char op2) {
        int precedence1 = getPrecedence(op1);
        int precedence2 = getPrecedence(op2);
        return precedence1 >= precedence2;
    }

    private int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return Precedence.ADD_SUB;
            case '*':
            case '/':
                return Precedence.MUL_DIV;
            case '^':
                return Precedence.EXPONENT;
            default:
                return Precedence.LOWEST;
        }
    }
}

// Example usage
public class Parsing_Expressions_Example  {
    public static void main(String[] args) {
        String expression = "3 + 4 * 2 / ( 1 - 5 ) ^ 2 ^ 3";
        ExpressionParser parser = new ExpressionParser();
        String parsedExpression = parser.parse(expression);
        System.out.println("Parsed Expression: " + parsedExpression);
    }
}
