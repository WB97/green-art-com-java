package org.example.day12.blackjack;

public class CardDeck {

    private final Card[] cards;
    String[] patterns = {"diamond", "space", "heart", "clover"};
    int selectedIdx = 0;

    public CardDeck() {
        cards = new Card[52];
        init();
        shuffle();
    }

    // 카드 생성
    public void init() {
        int size = 0;
        for(int i = 0; i < patterns.length; i++) {
            for(int i2 = 1; i2 < 14; i2++) {
                cards[size++] = new Card(patterns[i], getDenomination(i2));
            }
        }
    }

    public String getDenomination(int n) {
        String result;
        if(n == 1) {
            result = "A";
        } else if(2<=n && 10>=n) {
            result = String.valueOf(n);
        } else if(n == 11) {
            result = "J";
        } else if(n == 12) {
            result = "Q";
        } else if(n == 13) {
            result = "K";
        } else {
            result = "";
        }
        return result;
    }

    // 섞기
    private void shuffle() {
        for(int i=0; i<cards.length; i++) {
            int ran = (int)(Math.random()*52);
            Card temp = cards[i];
            cards[i] = cards[ran];
            cards[ran] = temp;
        }
    }

    public Card draw() {
        if(selectedIdx == cards.length) {
            System.out.println("카드 없음" + selectedIdx);
            return null;
        }
        Card card = cards[selectedIdx];
        cards[selectedIdx] = null;
        selectedIdx++;

        return card;
    }
}
