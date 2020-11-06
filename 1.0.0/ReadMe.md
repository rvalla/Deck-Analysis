# Deck-Analysis

In this software, the deck is represented by a string array. By default is set with 52
elements (as the poker deck without jokers), but the methods should run with any even number.

### About 'deckmethods'
- getCoprimeDeck(String[] auxdeck, int coprime): returns a new deck which order is obtained
by multiplying each card position by a desire coprime factor.
- getCard(String[] auxdeck, int position); returns the card of the deck in asked position.

### About 'faroshuffle'
- faroShuffleA (String[] auxdeck): returns the state of a deck after a perfect faro shuffle
leaving the top card on top.
- farosShuffleA (String[] auxdeck, int times): returns the state of a deck after an integer
number of perfect faro shuffles leaving the top card on top.
- faroShuffleB (String[] auxdeck): returns the state of a deck after a perfect faro shuffle
leaving the top card on second position.
- farosShuffleB (String[] auxdeck, int times): returns the state of a deck after an integer
number of perfect faro shuffles leaving the top card on second position.
- antiFaroA (String[] auxdeck): returns the deck state just before a perfect faro shuffle
with the top card on top.
- antiFarosA (String[] auxdeck, int times): returns the deck state just before an integer
number of perfect faro shuffles with the top card on top.
- antiFaroB (String[] auxdeck): returns the deck state just before a perfect faro shuffle
with the top card on second position.
- antiFarosB (String[] auxdeck, int times): returns the deck state just before an integer
number of perfect faro shuffles with the top card on second position.
- trackCardA (int initPos, int decksize): returns a certain card position after a perfect
faro shuffle leaving the top card on top.
- trackCardsA (int initPos, int times, int decksize): returns a certain card position after
an integer number of perfect faro shuffles leaving the top card on top.
- trackCardB (int initPos, int decksize): returns a certain card position after a perfect
faro shuffle leaving the top card on second position.
- trackCardsB (int initPos, int times, int decksize): returns a certain card position after
an integer number of perfect faro shuffles leaving the top card on second position.

Version 1.0.0 - January 2017

Feel free to contact me by [mail](mailto:rodrigovalla@protonmail.ch) or reach me in
[telegram](https://t.me/rvalla) or [mastodon](https://fosstodon.org/@rvalla).
