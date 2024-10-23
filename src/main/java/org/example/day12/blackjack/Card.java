package org.example.day12.blackjack;

public class Card {
    private final String pattern;
    private final String denomination;

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    @Override
    public String toString() {
        return pattern + "[" + denomination + "]";
    }
}
