package com.codigo5;

import java.util.Scanner;

public class Codigo6 {
	
	public static void main (String[] args) {
		
		// se cambiaron los nombres de la variables por nombres mas descriptivos
			// se corrigirton los  System.out.print()
			// se agrego e importo Scanner
			// se cambio el int opcion = Integer.parseInt(System.console().readLine(); por  int opcion = scanner.nextInt();
			// se agrego el public static void main()
			// se arreglo la forma en que se decalo el array
		
	     int [] number = new int [20];


	     for (int i = 0; i < 20; i++) {
	       number[i] = (int)(Math.random() * 381) + 20;
	       System.out.println(number[i] + " ");
	     }
	     
	     Scanner scanner = new Scanner (System.in);
	     System.out.println("\n¿Qué números quiere resaltar? ");
	     System.out.println("1) los múltiplos de 5\n2) los múltiplos de 7");
	     int opcion = scanner.nextInt();


	     int multiplo = (opcion == 1) ? 5 : 7;


	     System.out.println("\nNúmeros resaltados: ");
	     
	     for (int num : number) {
	       if (num % multiplo == 0) {
	         System.out.println("[" + num + "] ");
	       } else {
	         System.out.println(num + " ");
	       }
	     }
	   scanner.close();
	 };
}
