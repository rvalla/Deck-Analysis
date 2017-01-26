/*/////////////////////////////////////////////////////////////////////////////////////
				Test barajas mnemotécnicas con ciclos de coprimos
/////////////////////////////////////////////////////////////////////////////////////*/

import java.io.*;

class rvbaraja {

	static String[] barajaxpalos = new String[52];
	static String[] barajaxnumeros = new String[52];
	static String[] barajainvertida = new String[52];
	static String[] barajarv = new String[52];
	static String[] palos = {" Cor", " Dia", " Pic", " Tre"};
	
	static void ordenarBaraja(String[] baraja, int[] datos){
	
		if (datos[1] == 1){
			for (int i = 0; i < 52; i++){
				int aux = datos[0]*(i+1)%52 - 1;
				if (aux < 0) {
					aux = 51;
				}
				baraja[aux] = barajaxnumeros[i];
			}
		} else if (datos[1] == 2){
			for (int i = 0; i < 52; i++){
				int aux = datos[0]*(i+1)%52 - 1;
				if (aux < 0) {
					aux = 51;
				}
				baraja[aux] = barajaxpalos[i];
			}
		} else if (datos[1] == 3){
			for (int i = 0; i < 52; i++){
				int aux = datos[0]*(i+1)%52 - 1;
				if (aux < 0) {
					aux = 51;
				}
				baraja[aux] = barajainvertida[i];
			}
		}
	
	}
	
	static void xpalo (String[] input){
		for (int i = 0; i < 4; i++){	
			for (int j = 0; j < 13; j++){
				input[13*i + j] = String.valueOf(j+1) + palos[i];
			}	
		}
	}
	
	static void xnumero (String[] input){
		for (int i = 0; i < 13; i++){	
			for (int j = 0; j < 4; j++){
				input[4*i + j] = String.valueOf(i+1) + palos[j];
			}	
		}
	}
	
	static void invertida (String[] input){
		for (int i = 0; i < 4; i++){	
			if (i < 2){
				for (int j = 0; j < 13; j++){
					input[13*i + j] = String.valueOf(j+1) + palos[i];
				}
			} else {
				for (int j = 0; j < 13; j++){
					input[13*i + j] = String.valueOf(13 - j) + palos[i];
				}
			}
		}
	}
	
}