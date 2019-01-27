package codeRefactoring;

//https://www.slipp.net/questions/566

public class ReduceIfElse {
	public static void main(String[] args) {
		Number num = new Number(10);
	    Number result = num.calculate("+", new Number(20));
	    System.out.println(result.getNo());
	    
	}
}


class Number {
    private int no;

    public Number(int no) {
        this.no = no;
    }
    
    public int getNo () {
    	return this.no;
    }

    public Number calculate(String expression, Number number) {
        //return Calculation.findCalculation(expression).calculate(this, number);
    	Calculation cal = Calculation.findCalculation(expression);
    	return cal.calculate(this, number);
    	
    }

    private enum Calculation {
        ADDITION("+", new Calculator() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 + number2;
            }
        }),
        SUBTRACTION("-", new Calculator() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 - number2;
            }
        }),
        MULTIPLICATION("*", new Calculator() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 * number2;
            }
        }),
        DIVISION("/", new Calculator() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 / number2;
            }
        });
        
        private String expression;
        private Calculator calculator;

        Calculation(String expression, Calculator calculator) {
            this.expression = expression;
            this.calculator = calculator;
        }
        
        private Number calculate(Number number1, Number number2) {
            return new Number(this.calculator.calculate(number1.no, number2.no));
        }
        
        private boolean isMatchedExpression(String expression) {
            return this.expression.equals(expression);
        }
        
        
        // ADDITION ~ DIVISION
        private static Calculation findCalculation(String expression) {
            for(Calculation calculation : Calculation.values()) {
                if(calculation.isMatchedExpression(expression)) {
                    return calculation;
                }
            }
            throw new IllegalArgumentException();
        }

        // INTERFACE
        private interface Calculator {
            int calculate(int number1, int number2);
        }
    }
}
