package com.codigo5;

import java.util.Scanner;




public class Codigo5 {
	 public static void main(String[] args) {
		 			// se cambiaron los nombres de la variables por nombres mas descriptivos
		 			// se corrigirton los  System.out.print()
		 			// se agrego e importo Scanner
		 			// se corrigio el ciclo entre while y el if
		 			// se agrego el public static void main()
		 
				Scanner scanner = new Scanner(System.in);
				
			    System.out.print("Introduzca un número: ");
			    String input = scanner.nextLine();
			    
			    try {
			    	int number = Integer.parseInt(input);
			    	
			    	if (isLucky(number)) {
			    		System.out.println("El " + number + " es un número afortunado.");
			    	} else {
			    		System.out.println("El " + number + " no es un número afortunado.");
			    	}
			    } catch (NumberFormatException e) {
			    	System.out.println("Por favor, introduzca un número válido");
			    } finally {
			    	scanner.close();
			    }
			}
			
			public static boolean isLucky(int number) {
				int luckyCount = 0;
				int unluckyCount = 0;
				
				while (number > 0) {
					int digit = number % 10;
					
					if (digit == 3 || digit == 7 || digit == 8 || digit == 9) {
						luckyCount++;
					} else {
						unluckyCount++;
					}
					
					number /= 10;
				}
				
				return luckyCount > unluckyCount;
			}
}
