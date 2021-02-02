import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora(0);
		Scanner sc = new Scanner(System.in);
		informacion();
		double num1 = sc.nextDouble();
		String[] a = "10 + 10".split(" ");
		if(a.length == 3) {
			Double.parseDouble(s)
		}
		else throw IllegalArgumentException();
	}

	public static void informacion() {
		System.out.println("Para realizar los calculos matemáticos utilice:");
		System.out.println("+ para sumar");
		System.out.println("- para resta");
		System.out.println("* para multiplicar");
		System.out.println("/ para dividir");
		System.out.println("sqrt para la raiz cuadrada");
		System.out.println("cos para el coseno");
		System.out.println("sin para el seno");
		System.out.println("inv para el inverso");
	}

	public static void detectarNumero(String cadena) {
		String numero = "";
		char operador = '';
		String num2;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) >= '0' && cadena.charAt(i) <= 9) {
				while (i < cadena.length() && cadena.charAt(i) >= '0' && cadena.charAt(i) <= '9') {
					numero = numero + cadena.charAt(i);
					i++;
				}
			}
			
			if (cadena.charAt(i) == '+' || cadena.charAt(i) == '-' || cadena.charAt(i) == '*' || cadena.charAt(i) == '/' ||) {
				operador = cadena.charAt(i);
				num2 = cadena.substring(i+1);
				break;
			}
		}
	}
}
