package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {
	public static void main(String[] args) {
		System.out.print("Quanti elementi vuoi? ");
		Scanner scanner = new Scanner(System.in);
		int lunghezza = scanner.nextInt();
		
		
		int[] n = new int[lunghezza];
		
		int somma = 0;

		for(int i = 0; i < n.length; i++) {
			Random  randomGenerator = new Random();
			int numero = randomGenerator.nextInt(100);
			
			//System.out.print(result + " ");
			
			if( numero % 2 != 0) {
				System.out.print(numero + " ");
			
			}	
				//Bonus1
			if(( numero > 10) && (numero <50)) {
					somma += numero;
				
			}	
			
			
			
		}
		
		System.out.println("\nSomma numeri compresi tra 10 e 50 (estremi eslcusi) : " + somma );
		
		
		
		
		scanner.close();
	}
}
