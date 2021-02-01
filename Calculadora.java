
public class Calculadora {
	private double op;
	private double num1;
	private double num2;
	
	
	
	public Calculadora(double i) {
		this.op = op;
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public double getOp() {
		return op;
	}
	
	public double getNum1() {
		return num1;
	}
	
	public double getNum2() {
		return num2;
	}
	
	public void setOp(double op) {
		this.op = op;
	}
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double operacion (String operacion) {
		
		switch(operacion) {
		
		case "+": op = num1+num2;
		case "-": op = num1-num2;
		case "*": op = num1*num2;
		case "/": op = num1/num2;
		case "sqrt": op = Math.sqrt(op);
		case "sin": op = Math.sin(op);
		case "cos": op = Math.cos(op);
		case "inv": op = 1/num1;
		
		}
		
		return op;
	}
	
	
}