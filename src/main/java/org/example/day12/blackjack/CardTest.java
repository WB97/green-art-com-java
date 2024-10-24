package org.example.day12.blackjack;

import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        Card c = deck.draw();
        while(true) {
            Card card = deck.draw();
            System.out.println(card);
            if(card == null) break;
        }
        deck.draw();
//        System.out.println(deck.getDenomination(1));
    }
}




