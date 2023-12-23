package ejercicios;

import java.util.Scanner;

public class Ej_668 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String lectura = "";

		while (!lectura.equals("0 0 0")) {
			lectura = sc.nextLine();
			if (!lectura.equals("0 0 0")) {

				String[] sol = lectura.split(" ");
				System.out.println(
						resultado(Integer.parseInt(sol[0]), Integer.parseInt(sol[1]), Integer.parseInt(sol[2])));

			}

		}

		sc.close();
	}
	
	public static int resultado(int a, int b, int n) {
		int res=0;
			switch(n%6) {
			case 0:
				res = a;
				break;
			case 1:
				res = b;
				break;
			case 2:
				res = b-a;
				break;
			case 3:
				res = -a;
				break;
			case 4:
				res = -b;
				break;
			case 5:
				res = a-b;
				break;
				
			}
		return res;
		
	}

}
