package org.example.day10.ch13;

public class Subject {

    int korScore;
    int enScore;
    int mathScore;
    static final int SUBJECT_COUNT = 3;

    public Subject(int korScore, int enScore, int mathScore) {
        this.korScore = korScore;
        this.enScore = enScore;
        this.mathScore = mathScore;
    }

    public int getKor() {
        return korScore;
    }

    public int getEn() {
        return enScore;
    }

    public int getMath() {
        return mathScore;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "korScore=" + korScore +
                ", enScore=" + enScore +
                ", mathScore=" + mathScore +
                '}';
    }
}
