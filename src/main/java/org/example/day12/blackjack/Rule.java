package org.example.day12.blackjack;

import java.util.ArrayList;

public class Rule {

    public void score(Card[] cards) {
        int score = 0;
        for (Card card : cards) {
            String denomination = card.getDenomination();
            if (denomination.equals("A")) {
                score += 1;
            } else if (denomination.equals("J") || denomination.equals("K") || denomination.equals("Q")) {
                score += 10;
            } else {
                score += Integer.parseInt(denomination);
            }
        }
    }
}
