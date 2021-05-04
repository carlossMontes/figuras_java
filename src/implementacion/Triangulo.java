package implementacion;

public class Triangulo {
	
	public static void main(String[] args) {
		byte cant = 4;
		
		for (int i = 1; i <= cant; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
