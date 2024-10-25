package org.example.day12.blackjack;

import java.util.Scanner;

public class BlackJackMain {
    public static void main(String[] args) {
        System.out.println("================ Blackjack ===================");

        CardDeck deck = new CardDeck();
        Rule rule = new Rule();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(deck.draw());
            dealer.receiveCard(deck.draw());
        }
        dealer.needMoreCard(deck);

        while(true) {
            System.out.println("===============");
            gamer.showYourCards();
            System.out.println("카드를 추가하시겠습니까? (취소:n)");
            String input = scan.nextLine();

            if(input.equals("n")) break;

            gamer.receiveCard(deck.draw());
        }
        System.out.println("게임 끝!");
        System.out.println("===============");

        System.out.println("게이머 카드 : ");
        gamer.showYourCards();
        System.out.println("gamerPoint : " + gamer.getPoint());
        System.out.println("===============================");
        System.out.println("딜러 카드 : ");
        dealer.showYourCards();
        System.out.println("dealerPoint : " + dealer.getPoint());

        rule.getWinner(dealer,gamer);
    }
}
