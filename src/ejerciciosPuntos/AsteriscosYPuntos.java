package ejerciciosPuntos;

import java.util.Scanner;

public class AsteriscosYPuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int n = sc.nextInt();
		int i;
		
		for(i=0;i<n;i++) {
			if (i%2==0) System.out.print("*");			
			else System.out.print(".");
		}
		System.out.println("\n");
	}

}
