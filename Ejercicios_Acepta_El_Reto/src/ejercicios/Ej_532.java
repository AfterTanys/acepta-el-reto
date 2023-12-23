package ejercicios;

import java.util.Scanner;

public class Ej_532 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int reps = sc.nextInt();
		for(int i = 0; i < reps; i++) {
			int num1= sc.nextInt();
			int num2= sc.nextInt();
			System.out.println(Math.abs(num1-num2));
		}
		sc.close();

	}

}
