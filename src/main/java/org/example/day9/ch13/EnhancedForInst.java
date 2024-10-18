package org.example.day9.ch13;

public class EnhancedForInst {
    public static void main(String[] args) {
        Product[] arr = new Product[4];
        arr[0] = new Product("Coffee", 5_000);
        arr[1] = new Product("Computer", 1_000_000);
        arr[2] = new Product("Apple", 7_000);
        arr[3] = new Product("Dress", 400_000);

//        int sum = 0;
//
//        for(Product item : arr) {
//            System.out.println(item);
//            sum += item.getPrice();
//        }
//        System.out.printf("최종 가격: %,d", sum);

        for (Product item : arr) {
            if(item.getName().equals("Apple")) {
                System.out.println(item);
                break;
            }
        }
    }
}

class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "제품명: " + name + ", 가격: " + price;
    }
}