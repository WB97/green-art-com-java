package org.example.day12.blackjack;

import java.util.List;

class CardTest2 {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        Card card = deck.draw();
        Gamer gamer = new Gamer();
        gamer.receiveCard(card);
        gamer.receiveCard(deck.draw());
        gamer.receiveCard(deck.draw());
        gamer.showYourCards();

        List<Card> list = gamer.openCards();
        System.out.println(list);
    }
}