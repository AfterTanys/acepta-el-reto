package ejercicios;

public class Ej_340 {

	static java.util.Scanner sc;

	public static void main(String[] args) {
		sc = new java.util.Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			prueba();
		}
	}

	public static void prueba() {
		int total = 0;
		int numH = sc.nextInt();
		int numV = sc.nextInt();
		total = (numH * (numV + 1)) + (numV * (numH + 1));
		System.out.println(total);
	}

}
