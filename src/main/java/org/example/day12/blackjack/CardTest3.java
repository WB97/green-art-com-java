package org.example.day12.blackjack;

class CardTest3 {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        dealer.receiveCard(deck.draw());
        dealer.receiveCard(deck.draw());
        dealer.receiveCard(deck.draw());
        dealer.needMoreCard(deck);
        dealer.showYourCards();
        System.out.println("딜러 = " + dealer.getPoint());


        // 게이머
        gamer.receiveCard(deck.draw());
        gamer.receiveCard(deck.draw());
        gamer.receiveCard(deck.draw());
        gamer.receiveCard(deck.draw());
        gamer.showYourCards();
        System.out.println("게이머 = " + gamer.getPoint());


        // 결과
        Rule rule = new Rule();
        rule.getWinner(dealer, gamer);
    }
}