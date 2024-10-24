package org.example.day12.blackjack;

import java.util.List;

class CardTest3 {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        Dealer dealer = new Dealer();
        dealer.receiveCard(deck.draw());
        dealer.receiveCard(deck.draw());
        dealer.receiveCard(deck.draw());
        dealer.showYourCards();
        System.out.println(dealer.getPoint());
    }
}