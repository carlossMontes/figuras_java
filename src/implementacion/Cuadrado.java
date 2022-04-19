package implementacion;

public class Cuadrado {

	public static void main(String[] args) {
		byte cant = 9;
		String caract = "* ";
		
		for (int i = 1; i <= cant; i++) {
			for (int j = 1; j <= cant ; j++) {
				System.out.print(caract);
			}
			System.out.println();
		}

	}

}
