//Methods to represent the behavior of the deck
//with de 'Faro shuffle'

class faroshuffle {

	static String[] deck = new String[52];
	static String[] deckbis = new String[52];
	
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
		deckbis = copyDeck(deckbis, auxdeck);
		for(int i = 0; i < times; i++){
			deck = faroShuffleA(deckbis);
			deckbis = copyDeck(deckbis, deck);
		}	
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
		deckbis = copyDeck(deckbis, auxdeck);
		for(int i = 0; i < times; i++){
			deck = faroShuffleB(deckbis);
			deckbis = copyDeck(deckbis, deck);
		}	
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
	
	static String[] copyDeck(String[] deck, String[] deckbis){
		if (deck.length == deckbis.length){
			for (int i = 0; i < deck.length; i++){
				deck[i] = deckbis[i];
			}
		} else {
			for (int i = 0; i < deck.length; i++){
				deck[i] = "Error";
			}
		}
		return deck;
	}
	
}