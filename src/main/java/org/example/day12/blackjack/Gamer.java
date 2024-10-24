package org.example.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    private final List<Card> cards;
    private int point;

    public Gamer() {
        cards = new ArrayList<>();
    }

    public void receiveCard(Card card) {
        cards.add(card);
        int point = switch (card.getDenomination()) {
            case "A" -> 1;
            case "J", "k", "Q" -> 10;
            default -> Integer.parseInt(card.getDenomination());
        };
        this.point += point;
    }

    public void showYourCards() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public List<Card> openCards() {
        return cards;
    }

    public int getPoint() {
        return point;
    }
}
