package ejercicios;

import java.util.Scanner;
import java.util.TreeSet;

public class Ej_139 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		while ((input = sc.nextInt()) != 0) {
			if (chequearCubifinito(new TreeSet<Integer>(), input)) {
				System.out.println("> cubifinito.");
			} else
				System.out.println("> no cubifinito.");
		}
		sc.close();
	}
	
	static boolean chequearCubifinito(TreeSet<Integer> numAnt, int num) {
		if (numAnt.isEmpty())
			System.out.print(num + " -");
		else
			System.out.print(" " + num + " -");
		if (num == 1)
			return true;
		else if (numAnt.contains(num))
			return false;
		else {
			numAnt.add(num);
			int suma = 0;
			int aux = num;
			while(aux!=0) {
				suma += Math.pow(aux%10, 3);
				aux = aux/10;
			}
			return chequearCubifinito(numAnt, suma);
		}
	}

}
