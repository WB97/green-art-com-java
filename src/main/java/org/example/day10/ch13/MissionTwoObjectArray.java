package org.example.day10.ch13;

public class MissionTwoObjectArray {
    public static void main(String[] args) {

        Student[] arr = new Student[3];

        arr[0] = new Student("영수", new Subject(100, 90, 80));
        arr[1] = new Student("상철", new Subject(90, 90, 80));
        arr[2] = new Student("광수", new Subject(80, 70, 60));

        double totalSubjectSum = 0;
        for (Student s : arr) {
            totalSubjectSum += s.getTotalSum();
        }
//        printStudentAll(arr);
//        printTotalKorScore(arr);
        printTotalSubjectScore(arr);

    }

    static void printStudentAll(Student[] arr) {
        for(Student std : arr) {
            System.out.println(std);
        }
    }

    static void printTotalKorScore(Student[] arr) {
        int sum = 0;
        for(Student std : arr) {
            sum += std.getSubject().getKor();
        }
        System.out.println(sum);
    }

    static void printTotalSubjectScore(Student[] arr) {
        int sum = 0;
        double avg = 0;
        for (Student std : arr) {
            sum += std.getTotalSum();
        }

        avg = (double)sum/(arr.length*Subject.SUBJECT_COUNT);

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
