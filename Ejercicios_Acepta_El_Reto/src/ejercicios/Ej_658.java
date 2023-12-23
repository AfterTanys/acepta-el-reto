package ejercicios;

import java.util.Scanner;

public class Ej_658 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int bloques;
		do {
			int nivel = 1,total=0;
			boolean encontrado = false;
			bloques = sc.nextInt();
			if (bloques <= 2000000000 && bloques >= 1) {
				for (int cont = 1; !encontrado; cont += 2, nivel++) {
					total+=(cont*cont);
					if (total >= bloques) {
						encontrado = true;
						System.out.println(nivel);
					}
				}
			}
		} while (bloques != 0);
		sc.close();

	}

}
