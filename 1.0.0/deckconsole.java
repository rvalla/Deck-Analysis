//Deck-Analysis - Rodrigo Valla
//Java console program to evaluate possible orders of
//the cards at the deck and its behavior with de faro
//perfect shuffle.

//THIS CODE IS NOT COMPLETE

import java.io.*;

class deckconsole {
	
	static deckmethods d;
	static faroshuffle f;
	
	public static void main (String[] args) throws Exception {
	
		System.out.println();
		System.out.println("////////////////////////////////////////////////");
		System.out.println("          Deck-Analysis little software");
		System.out.println("////////////////////////////////////////////////");		
		System.out.println();
		System.out.println("Ingrese un coprimo de 52 'espacio' 1 = xnumeros o 2 = xpalos");
		System.out.println("o 3 = xpalos invertidos por color");
		System.out.println("por ejemplo: '7 1' para partir de la baraja ordenada por");
		System.out.println("números (As de corazones, As de diamate, As de picas, As de");
		System.out.println("trébol, 2 de corazones, etc) utilizando el 7 como factor.");
		System.out.println();
	
		deckconsole();
			
	}
	
	public static void deckconsole() throws Exception {
	
		d = new deckmethods();
		d.startDecks();
		f = new faroshuffle();
		
		print(d.deckbysuit);
		System.out.println();
		print(f.faroShuffleA(d.deckbysuit));
		System.out.println();
		System.out.println("0 - " + f.trackCardA(0));
		System.out.println();
		System.out.println("10 - " + f.trackCardA(10));
		System.out.println();
		System.out.println("26 - " + f.trackCardA(26));
		System.out.println();
		System.out.println("51 - " + f.trackCardA(51));
	
		System.out.println();
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String factorytipo;
		factorytipo = br.readLine();
		System.out.println();
		
		int[] datos = new int[2];
		String[] conjuntodatos = factorytipo.split(" ");
		datos[0] = Integer.parseInt(conjuntodatos[0]);
		datos[1] = Integer.parseInt(conjuntodatos[1]);
		
		
	
		exit();
	
	}
	
	static void print (String[] input){
	
		for(int i = 0; i < 4; i++){
			for (int j = 0; j < 13; j++){
				System.out.print(input[13*i + j]);
				System.out.print(", ");
			}
			System.out.println();
		}
	
	}
	
	public static void exit () throws Exception{
		
		InputStreamReader isr2 = new InputStreamReader(System.in);
		BufferedReader br2 = new BufferedReader(isr2);

		System.out.println();
		System.out.println("Para correr el programa de nuevo tipear 'n'");
		String ex;
		ex = br2.readLine();
		if (ex.equals("n")) {
			System.out.println(); 
			System.out.println(); 			
			deckconsole();
		} else {
			System.exit(0);
		}

	}
}