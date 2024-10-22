package org.example.day11.ch16;

public class MyFriends2 {

    public static void main(String[] args) {
        UnivFriend2[] arr1 = new UnivFriend2[2];
        CompFriend2[] arr2 = new CompFriend2[3];
        Friend[] arr3 = new Friend[10];
        UnivFriend2 obj1 = new UnivFriend2("wook", "Computer", "ㅈㅇㅁㄴㅇㅁㄴㅇ");

        arr3[0] = obj1;
        arr3[1] = new CompFriend2("asd", "010-1231-1231", "kljfoihg" );
        arr3[2] = new CompFriend2("YOON", "010-1241-1234", "R&D-2" );
        arr3[3] = new CompFriend2("PARK", "010-7231-7231", "R%D-2" );

        for (Friend f : arr3) {
            if(f != null) {
                f.showInfo();
            }
        }

        for(Friend f : arr3) {
            if(f != null) {
                f.showInfo();
                if(f instanceof CompFriend2) {
                    System.out.println("전공: " + ((CompFriend2) f).getDepartment());
                }
                if(f instanceof UnivFriend2) {
                    System.out.println("부서: " + ((UnivFriend2) f).getMajor());
                }
            }
        }

    }
}

class Friend {
    protected String name;
    protected String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("전화번호: " + phone);
    }
}

class UnivFriend2 extends Friend {

    private String major;

    public UnivFriend2(String name, String phone, String major) {
        super(name, phone);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}

class CompFriend2 extends Friend {

    private String department;

    public CompFriend2(String name, String phone, String department) {
        super(name, phone);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}