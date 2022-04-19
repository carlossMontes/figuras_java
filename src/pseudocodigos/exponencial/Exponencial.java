package pseudocodigos.exponencial;

public class Exponencial {
	
	String result;

	public void calcula(int num) {
		int residuo, exp = 0;
		for (int i = 2; i <= num; i++) {
			residuo = num % i;
			if (residuo != 0) {
				System.out.println("NINGUNO");
				System.exit(0);
			}
			num = num / i;
			exp = i;
		}
		System.out.println(exp + "!");
	}

}
