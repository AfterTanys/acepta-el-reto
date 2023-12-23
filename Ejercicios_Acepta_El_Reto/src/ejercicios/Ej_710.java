package ejercicios;

import java.util.Scanner;

public class Ej_710 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for(int i = 0; i<casos;i++) {
			int plazas = sc.nextInt();
			for(int j =0; j<6;j++) {
				plazas = plazas -sc.nextInt();
			}
			System.out.println(plazas);
		}
		sc.close();
		
	}

}
