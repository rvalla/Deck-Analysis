//Methods to order, reorder or evaluate a deck of cards

class deckmethods {

	static String[] deckbysuit;
	static String[] deckbyorder;
	static String[] deckbymirror;
	static String[] deck = new String[52];
	static String[] suits = {" Hea", " Dia", " Spa", " Clu"};
	
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
	
	static String getCard(String[] auxdeck, int position){
		return auxdeck[position];
	}
	
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
	
	static void startDecks() {
		
		deckbysuit = bySuit();
		deckbyorder = byOrder();
		deckbymirror = byMirror();
	
	}
	
}