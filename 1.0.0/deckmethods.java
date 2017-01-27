//Methods to order, reorder or evaluate a deck of cards

class deckmethods {

	//String arrays for especial orders of the deck representation
	static String[] deckbysuit;
	static String[] deckbyorder;
	static String[] deckbymirror;
	//String array for an empty deck
	static String[] deck = new String[52];
	//String array for suits representation
	static String[] suits = {" Hea", " Dia", " Spa", " Clu"};
	
	//Method to obtain a pseudoaleatory order from a deck using a
	//52 coprime. Note that if you give as parameter an int which
	//is not a 52 coprime the returned String array will not be a
	//deck (it will have repeated or null cards)
	static String[] getCoprimeDeck(String[] auxdeck, int coprime){
		int auxindex;
		for (int i = 0; i < 52; i++){
				auxindex = coprime*(i+1)%52 - 1;
				if (auxindex < 0) {
					auxindex = 51;
				}
				deck[auxindex] = auxdeck[i];
		}
		return deck;
	}
	
	//Method that returns the card in from the ask position.
	static String getCard(String[] auxdeck, int position){
		return auxdeck[position];
	}
	
	//Method that  make a deck ordered by suits
	static String[] bySuit (){
		String[] auxdeck = new String[52];
		for (int i = 0; i < 4; i++){	
			for (int j = 0; j < 13; j++){
				auxdeck[13*i + j] = String.valueOf(j+1) + suits[i];
			}	
		}
		return auxdeck;	
	}
	
	//Method that  make a deck ordered by numbers
	static String[] byOrder (){
		String[] auxdeck = new String[52];
		for (int i = 0; i < 13; i++){	
			for (int j = 0; j < 4; j++){
				auxdeck[4*i + j] = String.valueOf(i+1) + suits[j];
			}	
		}
		return auxdeck;	
	}
	
	//Method that make a deck ordered by suits but with the
	//last 2 suits inverted
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
	
	//Method to start the especial decks
	static void startDecks() {
		
		deckbysuit = bySuit();
		deckbyorder = byOrder();
		deckbymirror = byMirror();
	
	}
	
}