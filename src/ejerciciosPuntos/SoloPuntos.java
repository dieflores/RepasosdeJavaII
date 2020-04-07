package ejerciciosPuntos;

import java.util.Scanner;

public class SoloPuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* "Solución" 1:
El primer intento para resolverlo podría ser utilizando instrucciones if: 


		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int n = scan.nextInt();
	//	System.out.println(n);
		if (n==1) {
			System.out.println("*");
		}
		else if (n==2) {
			System.out.println("**");
		}
		
		Sin embargo, la solución es bastante limitada. Qué sucedería si el usuario ingresa el valor 6?, o 7? o
				100?. Vamos a programar todas las opciones hasta 100?. Este tipo de problemas se resuelve mucho
				mejor con ciclos. 
				
				SOLUCION II
				*
				*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int n = scan.nextInt();
		int i;
		for(i=0;i<n;i++) {
			System.out.print("*");
		}System.out.println();
		
	}

}
