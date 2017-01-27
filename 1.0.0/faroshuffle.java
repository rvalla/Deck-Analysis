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
		for (int i = 0; i < auxdeck.length/2; i++){
			aux = 2*i;
			deck[aux] = auxdeck[i];
			deck[aux + 1] = auxdeck[26 + i];
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
		for (int i = 0; i < auxdeck.length/2; i++){
			aux = 2*i;
			deck[aux + 1] = auxdeck[i];
			deck[aux] = auxdeck[26 + i];
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
		for (int i = 0; i < deck.length/2; i++){
			aux = 2*i;
			deckbis[i] = auxdeck[aux];
			deckbis[i + 26] = auxdeck[aux + 1];
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
		for (int i = 0; i < deck.length/2; i++){
			aux = 2*i;
			deckbis[i + 26] = auxdeck[aux];
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
	
	//Method to copy the state of the second deck (deckbis) in
	//the first one (deck).
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