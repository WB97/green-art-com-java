package org.example.day13;

public class MyArrayList {
    private int[] arr;
    private int maxSize = 0;
    private int currentIdx = 0;

    public MyArrayList() {
        arr = new int[maxSize];
//        arr[0] = 2;
//        arr[1] = 3;
//        arr[2] = 4;
//        arr[3] = 4;
    }

//    public void add(int n) {
//        int[] arr2 = new int[arr.length+1];
//        arr2[arr.length] = n;
//        arr = arr2;
//    }

    public void add(int n) {
        int[] temp = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = n;
        arr = temp;
    }

    public int size() {
        return arr.length;
    }

    public void clear() {
        arr = new int[0];
        maxSize = 0;
        currentIdx = 0;
    }

    public int remove() {
        if(arr.length == 0) {
            return -1;
        }
        int result;
        int lastIdx = arr.length-1;
        result = arr[lastIdx];
        int[] tempArr = new int[lastIdx];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int lastIdx = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i != lastIdx) {
                sb.append(", ");
            }
        }
        return "[" + sb + "]";
    }
}
