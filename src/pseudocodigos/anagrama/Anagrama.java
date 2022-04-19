package pseudocodigos.anagrama;

public class Anagrama {

	public void verificaAnagrama(String cad1, String cad2) {

		if (cad1.length() != cad2.length()) {
			System.out.println("Ni siquiera tienen la misma longitud");
		} else {
			cad1 = cad1.toLowerCase();
			cad2 = cad2.toLowerCase();

			char[] ord1 = cad1.toCharArray();
			char[] ord2 = cad2.toCharArray();

			java.util.Arrays.sort(ord1);
			java.util.Arrays.sort(ord2);

			String fra1 = new String(ord1);
			String fra2 = new String(ord2);

			if (fra1.equals(fra2))
				System.out.println("Iguales");
			else
				System.out.println("Diferentes");
		}
	}

}
