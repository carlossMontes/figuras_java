package implementacion;

public class Diamante {
	public static void main(String[] args) {
		byte cant = 9;
		String caract = "c ";
		String espacio = " ";

		// Impresion de pico a base
		for (int i = cant; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print(espacio);	
			}
			for (int j = i; j < cant; j++) {
				System.out.print(caract);
			}
			System.out.println();
		}
		
		// Impresion de base a pico
		for (int i = 2; i <= cant; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(espacio);
			}
			for (int j = i; j <= cant; j++) {
				System.out.print(caract);
			}
			System.out.println();
		}
	}

}
