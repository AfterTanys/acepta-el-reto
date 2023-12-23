package ejercicios;

import java.util.Scanner;

public class Ej_672 {

	public static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (casoDePrueba())
			;

	}
	
	public static boolean casoDePrueba() {
		if (!sc.hasNext())
			return false;
		else {
			int cantidad = sc.nextInt();
			long max = -1;
			long suma = 0;
			for (int i = 0; i < cantidad; i++) {
				long temp = sc.nextLong();
				suma += temp;
				if (temp > max)
					max = temp;
			}
			if (max*2 > suma)
				System.out.println(max * 2);
			else
				System.out.println(suma);
			return true;
		}
	}

}
