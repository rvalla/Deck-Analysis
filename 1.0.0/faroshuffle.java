//Methods to represent the behavior of the deck
//with de 'Faro shuffle'

class faroshuffle {

	static String[] deck = new String[52];
	
	static String[] faroShuffleA (String[] auxdeck){
		int aux;
		for (int i = 0; i < 26; i++){
			aux = 2*i;
			deck[aux] = auxdeck[i];
			deck[aux + 1] = auxdeck[26 + i];
		}
		return deck;
	}

	static String[] farosShuffleA (String[] auxdeck, int times){
	
		return deck;
	}
	
	static String[] faroShuffleB (String[] auxdeck){
		int aux;
		for (int i = 0; i < 26; i++){
			aux = 2*i;
			deck[aux + 1] = auxdeck[i];
			deck[aux] = auxdeck[26 + i];
		}
		return deck;
	}

	static String[] farosShuffleB (String[] auxdeck, int times){
	
		return deck;
	}
	
	static String[] antiFaroA (String[] auxdeck){
	
		return deck;
	}

	static String[] antiFarosA (String[] auxdeck, int times){
	
		return deck;
	}
	
	static String[] antiFaroB (String[] auxdeck){
	
		return deck;
	}

	static String[] antiFarosB (String[] auxdeck, int times){
	
		return deck;
	}
	
}