package org.example.day10.ch13;

public class Student {

    String name;
    Subject subject;

    public Student(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public Subject getSubject() {
        return subject;
    }

    private int totalSum() {
        return subject.getKor() + subject.getEn() + subject.getMath();
    }

    public int getTotalSum() {
        return totalSum();
    }

    public double totalAvg() {
        return (double)totalSum()/Subject.SUBJECT_COUNT;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject=" + subject +
                '}';
    }
}
