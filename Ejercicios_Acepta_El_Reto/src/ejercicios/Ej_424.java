package ejercicios;

import java.util.Scanner;

public class Ej_424 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int repeticiones = sc.nextInt();
		while (repeticiones != 0) {
			int total = 0;
			int maximo = 0;
			for (int i = 0; i < repeticiones; i++) {
				total = total + sc.nextInt();
				if (total > maximo) {
					maximo = total;
				}
			}
			System.out.println(total + " " + maximo);
			repeticiones = sc.nextInt();
		}

		sc.close();

	}

}
