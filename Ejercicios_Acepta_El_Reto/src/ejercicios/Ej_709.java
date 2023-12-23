package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ej_709 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int votos = 0;
		while((votos = sc.nextInt()) != 0) {
			HashMap <String, Integer> valores = new HashMap<String, Integer>();
			for(int i = 0; i<votos;i++) {
				String entrada = sc.next();
				if(valores.containsKey(entrada)) {
					int contador = valores.get(entrada);
					contador++;
					valores.put(entrada, contador);
				}else {
					valores.put(entrada, 1);
				}
			}
			int mayor=0;
			String pais_sol = "";
			for(String pais: valores.keySet()) {
				if(valores.get(pais)>mayor) {
					mayor = valores.get(pais);
					pais_sol = pais;
				}
			}
			for(String pais: valores.keySet()) {
				if(!pais_sol.equals(pais)) {
					if(valores.get(pais)==mayor) {
						pais_sol = "EMPATE";
					}
				}
			}
			System.out.println(pais_sol);
		}
		
		sc.close();

	}

}
