package codeRefactoring;

public class Practice {
	public static void main(String[] args) {
		Num num = new Num(10);
		Num result = num.calculate("+", new Num(20));
		System.out.println(result.getNo());
	}

}

class Num {
	private int no;
	public Num(int no){
		this.no=no;
	}
	public int getNo(){
		return this.no;
	}
	public Num calculate(String expr, Num num){
		Calculation calc = Calculation.findExpr(expr);
		return calc.calculate(this, num);
	}
	
	private enum Calculation{
		ADDITION("+", new Calculator(){
			@Override
			public int calculate(int num1, int num2){
				return num1+num2;
			}
		});
		
		private String expr;
		private Calculator calc;
		
		private Calculation(String expr, Calculator calc){
			this.expr=expr;
			this.calc = calc;
		}
		public Num calculate(Num num1, Num num2){
			return new Num(this.calc.calculate(num1.no, num2.no));
		}
		public boolean isMatched(String expr){
			return expr.equals(this.expr);
		}
		public static Calculation findExpr(String expr){
			for(Calculation calc:Calculation.values()){
				if(calc.isMatched(expr)){
					return calc;
				}
			}
			throw new IllegalArgumentException();
		}
		private interface Calculator{
			public int calculate(int num1, int num2);
		}
	}
}
