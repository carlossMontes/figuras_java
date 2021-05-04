package implementacion;

public class Triangulo {
	
	public static void main(String[] args) {
		byte cant = 7;
		String caract = "* ";
		
		for (int i = 1; i <= cant; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(caract);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = cant; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(caract);	
			}
			System.out.println();
		}
	}
}
