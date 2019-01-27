package codeRefactoring;

public class Practice {
	
	public static void main(String[] args) {
		NumberPrac num = new NumberPrac(10);
		NumberPrac result = num.calculate("+", new NumberPrac(14));
		System.out.println(result.getNo());
	}

}

class NumberPrac {
	private int no;
	public NumberPrac(int no){
		this.no = no;
	}
	public int getNo(){
		return this.no;
	}
	
	public NumberPrac calculate(String expression, NumberPrac number){
		return Calculation.find(expression).calculate(this, number);
	}
	
	private enum Calculation{
		ADDITION("+", new Calculator(){
			@Override
			public int calculate(int number1, int number2){
				return number1+number2;
			}
		});
		
		private String expression;
		private Calculator calculator;
		
		Calculation(String expression, Calculator calculator){
			this.expression=expression;
			this.calculator=calculator;
		}
		
		public NumberPrac calculate(NumberPrac number1, NumberPrac number2){
			return new NumberPrac(this.calculator.calculate(number1.no, number2.no));
		}
		
		public static Calculation find(String expression){
			for(Calculation calc : Calculation.values()){
				if(calc.expression.equals(expression))
					return calc;
			}
			throw new IllegalArgumentException();
		}
		
		
		private interface Calculator{
			public int calculate(int number1, int number2);
		}
	}
	

}
