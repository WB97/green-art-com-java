package org.example.day11.ch16;

public class MyFriends {
    public static void main(String[] args) {
        CompFriend wook = new CompFriend("wook", "aaa", "112", "01012341234");
    }
}

class UnivFriend {
    private String name;
    private String major;
    private String phone;

    public UnivFriend(String name, String major, String phone) {
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getPhone() {
        return phone;
    }
}

class CompFriend extends UnivFriend {
    private String department;

    public CompFriend(String name, String major, String department, String phone) {
        super(name, major, phone);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}