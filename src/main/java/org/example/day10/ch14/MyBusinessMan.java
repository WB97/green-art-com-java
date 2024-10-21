package org.example.day10.ch14;

public class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man1 = new BusinessMan("Yoon", "Hybrid ELD", "Staff Eng");
        man1.tellYourSelf();
        man1.jump();
        man1.whatIsDoing();
    }
}

class Man {
    private String name;

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void tellYourSelf() {
        System.out.printf("제 이름은 %s 입니다.\n", name);
    }

    public void jump() {
        System.out.printf("%s가 점프!\n", name);
    }
}

class BusinessMan extends Man {
    private String company;
    private String position;

    public BusinessMan(String name, String company, String position) {
        super(name);
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public void jump() {
        System.out.printf("%s에 다니는 %s가 점프!\n",getCompany(), getName());
    }

    public void whatIsDoing() {
        super.jump();
    }

}