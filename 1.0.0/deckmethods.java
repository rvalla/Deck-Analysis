//Methods to order and evaluate a deck of cards

import java.io.*;

class deckmethods {

	static String[] deckbysuit;
	static String[] deckbyorder;
	static String[] deckbymirror;
	static String[] deck = new String[52];
	static String[] suits = {" Cor", " Dia", " Pic", " Tre"};
	
	public static void deckmethods() {
		
		deckbysuit = bySuit();
		deckbyorder = byOrder();
		deckbymirror = byMirror();
	
	}
	
	/*static void ordenarBaraja(String[] baraja, int[] datos){
	
		if (datos[1] == 1){
			for (int i = 0; i < 52; i++){
				int aux = datos[0]*(i+1)%52 - 1;
				if (aux < 0) {
					aux = 51;
				}
				baraja[aux] = deckbyorder[i];
			}
		} else if (datos[1] == 2){
			for (int i = 0; i < 52; i++){
				int aux = datos[0]*(i+1)%52 - 1;
				if (aux < 0) {
					aux = 51;
				}
				baraja[aux] = deckbysuit[i];
			}
		} else if (datos[1] == 3){
			for (int i = 0; i < 52; i++){
				int aux = datos[0]*(i+1)%52 - 1;
				if (aux < 0) {
					aux = 51;
				}
				baraja[aux] = deckbymirror[i];
			}
		}
	
	}*/
	
	static String[] bySuit (){
		String[] auxdeck = new String[52];
		for (int i = 0; i < 4; i++){	
			for (int j = 0; j < 13; j++){
				auxdeck[13*i + j] = String.valueOf(j+1) + suits[i];
			}	
		}
		return auxdeck;	
	}
	
	static String[] byOrder (){
		String[] auxdeck = new String[52];
		for (int i = 0; i < 13; i++){	
			for (int j = 0; j < 4; j++){
				auxdeck[4*i + j] = String.valueOf(i+1) + suits[j];
			}	
		}
		return auxdeck;	
	}
	
	static String[] byMirror (){
		String[] auxdeck = new String[52];
		for (int i = 0; i < 4; i++){	
			if (i < 2){
				for (int j = 0; j < 13; j++){
					auxdeck[13*i + j] = String.valueOf(j+1) + suits[i];
				}
			} else {
				for (int j = 0; j < 13; j++){
					auxdeck[13*i + j] = String.valueOf(13 - j) + suits[i];
				}
			}
		}
		return auxdeck;	
	}
	
	static void startDecks (){
		
	
	}
	
}