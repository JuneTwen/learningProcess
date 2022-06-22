package com.learn.array_.home01;

import java.util.Arrays;
import java.util.Comparator;

public class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        Book[] books = new Book[4];
        books[0] = new Book("红楼梦新版",100);
        books[1] = new Book("金瓶梅",90);
        books[2] = new Book("青年文摘七七七前期",5);
        books[3] = new Book("java从入门到放弃",300);


        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
