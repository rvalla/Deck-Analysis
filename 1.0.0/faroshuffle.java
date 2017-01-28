//Methods to represent the behavior of the deck
//with de 'Faro shuffle'

class faroshuffle {

	//String arrays for deck representation
	static String[] deck = new String[52];
	static String[] deckbis = new String[52];
	
	//Method that returns the deck state after a perfect
	//faro shuffle with the top card on top.
	static String[] faroShuffleA (String[] auxdeck){
		int aux;
		int deckhalf = auxdeck.length/2;
		for (int i = 0; i < deckhalf; i++){
			aux = 2*i;
			deck[aux] = auxdeck[i];
			deck[aux + 1] = auxdeck[deckhalf + i];
		}
		return deck;
	}

	//Method that returns the deck state after an integer number
	//of perfect faro shuffles with the top card on top.
	static String[] farosShuffleA (String[] auxdeck, int times){
		deckbis = copyDeck(deckbis, auxdeck);
		for(int i = 0; i < times; i++){
			deck = faroShuffleA(deckbis);
			deckbis = copyDeck(deckbis, deck);
		}	
		return deck;
	}
	
	//Method that returns the deck state after a perfect
	//faro shuffle with the top card at second position.
	static String[] faroShuffleB (String[] auxdeck){
		int aux;
		int deckhalf = auxdeck.length/2;
		for (int i = 0; i < deckhalf; i++){
			aux = 2*i;
			deck[aux + 1] = auxdeck[i];
			deck[aux] = auxdeck[deckhalf + i];
		}
		return deck;
	}

	//Method that returns the deck state after an integer number
	//of perfect faro shuffles with the top card at second position.
	static String[] farosShuffleB (String[] auxdeck, int times){
		deckbis = copyDeck(deckbis, auxdeck);
		for(int i = 0; i < times; i++){
			deck = faroShuffleB(deckbis);
			deckbis = copyDeck(deckbis, deck);
		}	
		return deck;
	}
	
	//Method that returns the deck state just before a perfect
	//faro shuffle with the top card on top.
	static String[] antiFaroA (String[] auxdeck){
		int aux;
		int deckhalf = auxdeck.length/2;
		for (int i = 0; i < deckhalf; i++){
			aux = 2*i;
			deckbis[i] = auxdeck[aux];
			deckbis[i + deckhalf] = auxdeck[aux + 1];
		}
		return deckbis;
	}

	//Method that returns the deck state before an integer number
	//of perfect faro shuffles with the top card on top.
	static String[] antiFarosA (String[] auxdeck, int times){
		deck = copyDeck(deck, auxdeck);
		for(int i = 0; i < times; i++){
			deckbis = antiFaroA(deck);
			deck = copyDeck(deck, deckbis);
		}	
		return deckbis;
	}
	
	//Method that returns the deck state just before a perfect
	//faro shuffle with the top card at second position.
	static String[] antiFaroB (String[] auxdeck){
		int aux;
		int deckhalf = auxdeck.length/2;
		for (int i = 0; i < deckhalf; i++){
			aux = 2*i;
			deckbis[i + deckhalf] = auxdeck[aux];
			deckbis[i] = auxdeck[aux + 1];
		}
		return deckbis;
	}

	//Method that returns the deck state before an integer number
	//of perfect faro shuffles with the top card at second position.
	static String[] antiFarosB (String[] auxdeck, int times){
		deck = copyDeck(deck, auxdeck);
		for(int i = 0; i < times; i++){
			deckbis = antiFaroB(deck);
			deck = copyDeck(deck, deckbis);
		}	
		return deck;
	}
	
	//Method that track a card and returns its position in the deck (0-51)
	//after a perfect faro shuffle with the top card on top.
	static int trackCardA (int initPos, int decksize){
		int endPos = -1;
		int deckhalf = decksize/2;
		if (initPos < deckhalf){
			endPos = 2*initPos;
		} else {
			endPos = 2*initPos - decksize + 1;
		}
		return endPos;
	}
	
	//Method that track a card and returns its position in the deck (0-51)
	//after an integer number of perfect faro shuffles with the top card
	//on top.
	static int trackCardsA (int initPos, int times, int decksize){
		int endPos = -1;
		int aux = initPos;
		for (int i = 0; i < times; i++){
			endPos = trackCardA(aux, decksize);
			aux = endPos;
		}
		return endPos;
	}
	
	//Method that track a card and returns its position in the deck (0-decksize)
	//after a perfect faro shuffle with the top card on second position.
	static int trackCardB (int initPos, int decksize){
		int endPos = -1;
		int deckhalf = decksize/2;
		if (initPos < deckhalf){
			endPos = 2*initPos + 1;
		} else {
			endPos = 2*initPos - decksize;
		}
		return endPos;
	}
	
	//Method that track a card and returns its position in the deck (0-51)
	//after an integer number of perfect faro shuffles with the top card
	//on second position.
	static int trackCardsB (int initPos, int times, int decksize){
		int endPos = -1;
		int aux = initPos;
		for (int i = 0; i < times; i++){
			endPos = trackCardB(aux, decksize);
			aux = endPos;
		}
		return endPos;
	}
	
	//Method to copy the state of the second deck (deckbis) in
	//the first one (deck).
	static String[] copyDeck (String[] deck, String[] deckbis){
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