package org.example.day12.blackjack;

public class Dealer extends Gamer {

    private final int requiredScore = 16;

    public void needMoreCard(CardDeck deck) {
        if(point <= requiredScore) {
            receiveCard(deck.draw());
        }
    }
}
