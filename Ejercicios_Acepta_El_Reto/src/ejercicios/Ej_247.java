package ejercicios;

import java.util.Scanner;

public class Ej_247 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int repeticiones;
		
		while((repeticiones = sc.nextInt())!=0) {
			
			int valor_eco;
			boolean correcto = true;
			int valor_eco_old=0;
			
			for(int i = 0; i<repeticiones; i++) {
				valor_eco=sc.nextInt();
				if(valor_eco<=valor_eco_old) {
					correcto=false;
				}
				valor_eco_old=valor_eco;
			}
			
			if(correcto) {
				System.out.println("SI");
			}else{
				System.out.println("NO");
			}
		}
		
		sc.close();

	}

}
