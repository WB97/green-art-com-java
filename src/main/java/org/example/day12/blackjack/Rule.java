package org.example.day12.blackjack;

import java.util.ArrayList;

public class Rule {

    private int MAX_SCORE = 21;

    public void getWinner(Dealer dealer, Gamer gamer) {

        int dealerScore = dealer.getPoint();
        int gamerScore = gamer.getPoint();

        if(dealerScore == gamerScore || (dealerScore > MAX_SCORE && gamerScore > MAX_SCORE)) {
            System.out.println("비겼습니다.");
        } else if (gamerScore <= MAX_SCORE && dealerScore < gamerScore || dealerScore > MAX_SCORE ) {
            System.out.println("게이머 승리");
        } else {
            System.out.println("딜러 승리");
        }
    }

//    public void score(Card[] cards) {
//        int score = 0;
//        for (Card card : cards) {
//            String denomination = card.getDenomination();
//            if (denomination.equals("A")) {
//                score += 1;
//            } else if (denomination.equals("J") || denomination.equals("K") || denomination.equals("Q")) {
//                score += 10;
//            } else {
//                score += Integer.parseInt(denomination);
//            }
//        }
//    }
}
