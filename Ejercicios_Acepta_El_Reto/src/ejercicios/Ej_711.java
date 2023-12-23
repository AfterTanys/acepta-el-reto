package ejercicios;

import java.util.Scanner;

public class Ej_711 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for(int i = 0;i<casos;i++) {
			long codigo = 0;
			String numero = sc.next();
			String girado = "";
			for(int j = 0; j<numero.length();j++) {
				girado = numero.charAt(j) + girado;
			}
			char[] nums = girado.toCharArray();
			for(int j = nums.length-1; j>=0;j--) {
				int mayor=0;
				int menor=10;
				if(j%2 == 0) {
					int num = Character.getNumericValue(nums[j]);
					codigo = codigo + (num * 2);
					for(int z = (j+1); z<nums.length; z++) {
						int sum = Character.getNumericValue(nums[z]);
						if(sum>mayor) {
							mayor=sum;
						}
					}
					codigo = codigo + mayor;
				}else {
					int num = Character.getNumericValue(nums[j]);
					codigo = codigo + (num * 3);
					for(int z = (j-1); z>=0;z--) {
						int sum = Character.getNumericValue(nums[z]);
						if(sum<menor) {
							menor = sum;
						}
					}
					codigo = codigo + menor;
				}
			}
			System.out.println(codigo);
		}
		sc.close();

	}

}
