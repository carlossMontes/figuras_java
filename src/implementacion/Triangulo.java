package implementacion;

public class Triangulo {
	
	public static void main(String[] args) {
		byte cant = 7;
		String caract = "* ";
		String espacio = " ";
		
//		// Triangulo rectangulo hacia abajo
//		for (int i = 1; i <= cant; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(caract);
//			}
//			System.out.println();
//		}
		
//		System.out.println();
		
		// al reves
		for (int i = 1; i <= cant; i++) {
			for (int j = 1; j <= i; j++) {
//				System.out.print(espacio + j);
				for (int k = cant; k >= j; k--) {
					System.out.print(caract);
				}
			}
			System.out.println();
		}
		
//		System.out.println();
//		
//		// Triangulo rectangulo hacia arriba
//		for (int i = cant; i >= 1; i--) {
//			for (int j = i; j >= 1; j--) {
//				System.out.print(caract);	
//			}
//			System.out.println();
//		}
//		
//		// Triangulo normal
//		for (int i = cant; i >= 0; i--) {
//			for (int j = i; j >= 0; j--) {
//				System.out.print(espacio);	
//			}
//			for (int j = i; j < cant; j++) {
//				System.out.print(caract);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		// Impresion de cabeza
//		for (int i = 1; i <= cant; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(espacio);
//			}
//			for (int j = i; j <= cant; j++) {
//				System.out.print(caract);
//			}
//			System.out.println();
//		}
	}
}
