package com.learn.collection_.list_;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class Book {
    private String name;
    private int price;
    private String author;

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void sort(List list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book book1 =(Book) list.get(j);
                Book book2 =(Book) list.get(j+1);
                if (book1.getPrice() > book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }

    public static void main(String[] args) {

        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 11; i < 15; i++) {
            list.add(i);
        }
        list.add(16);
        list.add(17);
//        list.add(new Book("one",15,"oneAuthor"));
//        list.add(new Book("two",10,"twoAuthor"));
//        list.add(new Book("three",11,"threeAuthor"));
//        System.out.println(list);
//        sort(list);
//        System.out.println(list);
    }
}
