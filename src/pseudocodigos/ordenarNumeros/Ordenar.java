package pseudocodigos.ordenarNumeros;

public class Ordenar {
	
	public void ordenar(int num) {
		String sNum = Integer.toString(num);
		char[] aNum = sNum.toCharArray();
		java.util.Arrays.sort(aNum);
		sNum = String.valueOf(aNum);
		int ordenado = Integer.parseInt(sNum);
		System.out.println(ordenado);
	}

}
