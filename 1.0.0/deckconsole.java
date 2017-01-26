//Deck-Analysis - Rodrigo Valla
//Java console program to evaluate possible orders of
//the cards at the deck and its behavior with de faro
//perfect shuffle.

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
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String factorytipo;
		factorytipo = br.readLine();
		System.out.println();
		
		int[] datos = new int[2];
		String[] conjuntodatos = factorytipo.split(" ");
		datos[0] = Integer.parseInt(conjuntodatos[0]);
		datos[1] = Integer.parseInt(conjuntodatos[1]);
		
		if (evaluarDatos(datos) == true){
		//	ordenarBaraja(barajarv, datos);
		} else {
			System.out.println();
			System.out.println("Los parámetros no pueden procesarse");
			System.out.println();
			deckconsole();
		}
		
		//print(barajarv);
		
		exit();
	
	}
	
	static boolean evaluarDatos(int[] input){
		
		if (esCoprimo(input[0], 52) == false){
			return false;
		} else {
			if (input[1] > 0 && input[1] < 4){
				return true;
			} else {
				return false;
			}
		}
		
	}
	
	static boolean esCoprimo(int u, int v) {
   		// If both numbers are even, then they are not coprime.
    	if (((u | v) & 1) == 0) return false;

	    // Now at least one number is odd. Eliminate all the factors of 2 from u.
    	while ((u & 1) == 0) u >>= 1;

		// One is coprime with everything else by definition.
		if (u == 1) return true;

    	do {
        	// Eliminate all the factors of 2 from v, because we know that u and v do not have any 2's in common.
        	while ((v & 1) == 0) v >>= 1;

        	// One is coprime with everything else by definition.
        	if (v == 1) return true;

        	// Swap if necessary to ensure that v >= u.
        	if (u > v) {
            	int t = v;
            	v = u;
            	u = t;
        	}

        	// We know that GCD(u, v) = GCD(u, v - u).
        	v -= u;
    	} while (v != 0);

    	// When we reach here, we have v = 0 and GCD(u, v) = current value of u, which is greater than 1.
    	return false;
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