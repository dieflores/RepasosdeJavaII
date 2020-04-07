package ejerciciosPuntos;

import java.util.Scanner;

public class TabladeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese numero");
		int n = scan.nextInt();
		
		
		int i;
		for(i=0;i<10;i++) {
			System.out.printf(n + " * %d = %d\n", i,n*i);			
		}

	}

}
