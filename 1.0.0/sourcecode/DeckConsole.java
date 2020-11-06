//Deck-Analysis - Rodrigo Valla
//Java console program to evaluate possible orders of
//the cards at the deck and its behavior with de faro
//perfect shuffle.

import java.io.*;

class DeckConsole {

	static DeckMethods d;
	static FaroShuffle f;

	public static void main (String[] args) throws Exception {

		System.out.println();
		System.out.println("//////////////////////////////////////////////////////////");
		System.out.println("          Deck-Analysis little software");
		System.out.println("	  https://gitlab.com/rodrigovalla/deck-analysis");
		System.out.println("//////////////////////////////////////////////////////////");
		System.out.println();
		printHelp();
		System.out.println("Deck-Analysis will show you the order of your coprime deck +");
		System.out.println("its state after 1 and 2 perfect faro shuffles. You will see");
		System.out.println("the state of a previous deck with an 'anti-faro'.");
		System.out.println();
		System.out.println("You can code to adapt the program to your needs!");
		System.out.println();

		DeckConsole();

	}

	public static void DeckConsole() throws Exception {

		d = new DeckMethods();
		d.startDecks();
		f = new FaroShuffle();

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String factorAndType;
		factorAndType = br.readLine();
		System.out.println();

		if (factorAndType.equals("")){
			System.out.println("Hey! Please write something next time.");
			exit();
		} else {
			int[] input = new int[2];
			String[] inputdata = factorAndType.split(" ");
			try {
				input[0] = Integer.parseInt(inputdata[0]);
				input[1] = Integer.parseInt(inputdata[1]);
				runDecks(input);
			} catch (Exception e){
				System.out.println();
				System.out.println("Error: Input data can not be processed");
				System.out.println("Try again!");
				System.out.println();
				DeckConsole();
			}
		}

		exit();

	}

	static void runDecks (int[] input) throws Exception {
		String[] deck = new String[52];
		if (input[1]==1){
			System.out.println("You ask for a coprime factor of " + String.valueOf(input[0]));
			System.out.println("and a deck ordered by suits as starting point.");
			System.out.println();
			deck = d.getCoprimeDeck(d.deckbysuit, input[0]);
			runFarosA(deck);
		} else if (input[1]==2){
			System.out.println("You ask for a coprime factor of " + String.valueOf(input[0]));
			System.out.println("and a deck ordered by numbers as starting point.");
			System.out.println();
			deck = d.getCoprimeDeck(d.deckbyorder, input[0]);
			runFarosA(deck);
		} else if (input[1]==3){
			System.out.println("You ask for a coprime factor of " + String.valueOf(input[0]));
			System.out.println("and a deck with inverted order as starting point.");
			System.out.println();
			deck = d.getCoprimeDeck(d.deckbymirror, input[0]);
			runFarosA(deck);
		} else {
			System.out.println();
			System.out.println("REMEMBER:");
			printHelp();
			DeckConsole();
		}
	}

	static void runFarosA (String[] deck){
		System.out.println("-Previous deck: Anti Faro Shuffle");
		print(f.antiFaroA(deck));
		System.out.println();
		System.out.println("-Your coprime deck:");
		print(deck);
		System.out.println();
		System.out.println("-Your coprime deck after a faro shuffle:");
		print(f.faroShuffleA(deck));
		System.out.println();
		System.out.println("-Your coprime deck after 2 faro shuffles:");
		print(f.farosShuffleA(deck, 2));
		System.out.println();
	}

	static void runFarosB (String[] deck){
		System.out.println("-Previous deck: Anti Faro Shuffle");
		print(f.antiFaroB(deck));
		System.out.println();
		System.out.println("-Your coprime deck:");
		print(deck);
		System.out.println();
		System.out.println("-Your coprime deck after a faro shuffle:");
		print(f.faroShuffleB(deck));
		System.out.println();
		System.out.println("-Your coprime deck after 2 faro shuffles:");
		print(f.farosShuffleB(deck, 2));
		System.out.println();
	}

	static void print (String[] input){
		int decksize = input.length;
		int decksuits = decksize/4;
		for(int i = 0; i < 4; i++){
			for (int j = 0; j < decksuits; j++){
				System.out.print(input[decksuits*i + j]);
				System.out.print(", ");
			}
			System.out.println();
		}

	}

	static void printHelp (){
		System.out.println("Input 2 numbers separated by spaces.");
		System.out.println("First one should be a decksize coprime (52), e.g. 11.");
		System.out.println("The second one allows you to select the original deck:");
		System.out.println("1: deck ordered by suits (1-13 hearts, 1-13 diamonds, 1-13");
		System.out.println("spades, 1-13 clubs.");
		System.out.println("2: deck ordered by numbers (1 hearts, 1 diamonds, 1 spades");
		System.out.println("1 clubs, 2 hearts, 2 diamonds, etc)");
		System.out.println("3: deck ordered by suits with black cards in reverse order.");
		System.out.println();
	}

	static void exit () throws Exception{

		InputStreamReader isr2 = new InputStreamReader(System.in);
		BufferedReader br2 = new BufferedReader(isr2);

		System.out.println();
		System.out.println("To run the software again type 'new'");
		String ex;
		ex = br2.readLine();
		if (ex.equals("new")) {
			System.out.println();
			DeckConsole();
		} else {
			System.exit(0);
		}

	}
}
