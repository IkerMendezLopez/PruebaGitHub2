package ejercicios1;

import java.io.IOException;

public class DividePorCero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce 2 enteros");
		try {
			int num1 = Consola.leeInt();
			int num2 = Consola.leeInt();
			System.out.println(num1 / num2);
		}catch (ArithmeticException e) {
			System.err.println("Error, division por 0");
		}catch (NumberFormatException e) {
			System.err.println("Error numero malo");
		}catch (IOException e) {
			System.err.println("mal mal" + e.getMessage());
		}
		
		
		try {
			
		} catch (ArithmeticException e) {
			System.err.println("Error, division por 0");
		}
		
	}

}
