package implementacion;

public class Rectangulo {
	public static void main(String[] args) {
		byte ancho = 3;
		byte alto = 5;
		
		for (int i = 1; i <= ancho; i++) {
			for (int j = 1; j <= alto; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i <= alto; i++) {
			for (int j = 1; j <= ancho; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
