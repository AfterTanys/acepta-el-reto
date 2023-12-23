package ejercicios;

import java.util.Scanner;

public class Ej_659 {

	public static void main(String[] args) {

		char[] c = { 'T', 'G', 'C', 'F', 'D', 'R', 'H' };
		Scanner sc = new Scanner(System.in);
		int a = 1;
		String b = "";
		int sol = 0;
		int cont = 0;
		while (a != 0) {
			a = sc.nextInt();
			if (a > 0 && a < 10000000 && a != 0) {
				int si = a;
				while (si != 0) {
					sol = si % 10;
					si = si / 10;
					for (int i = 0; i < sol; i++) {
						b = c[cont] + b;
					}
					cont++;
				}
				System.out.println(b);
				cont = 0;
				b = "";
			}
		}

		sc.close();

	}

}
