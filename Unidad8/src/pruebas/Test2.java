package pruebas;

public class Test2 {
	private static int method() {
		int value=0;
		try {
			value=value+1;
			value=value+Integer.parseInt("W");
			value=value+1;
			System.out.println("Value at the of try block: " + value);
			
		}catch (NumberFormatException e) {
			value=value+Integer.parseInt("42");
			System.out.println("Value at the end of catch blcok: " + value );
			
		}finally {
			value=value+1;
			System.out.println("Value at the en of finally block: " + value);
		}
		value=value +1;
		System.out.println("Value before return: " + value);
		return value;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(method());
		}catch (Exception e){
			System.err.println("Exception in method()");
			e.printStackTrace();
		}
	}
}

