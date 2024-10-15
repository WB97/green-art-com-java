package org.example.day6.ch9;

public class GetterSetterExam {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("asd");
        System.out.println(student1.getName());
    }
}

class Student {
    private String name;
    private int age;
    private float height;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}