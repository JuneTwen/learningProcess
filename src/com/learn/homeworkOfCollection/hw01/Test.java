package com.learn.homeworkOfCollection.hw01;

import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        News newsOne = new News("News one--------------------");
        News newsTwo = new News("News two");
        newsOne.setContent("-----------------");
        newsTwo.setContent("+++++++++++++++++");
        ArrayList<News> list = new ArrayList<>();
        list.add(newsOne);
        list.add(newsTwo);
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
            News temp = list.get(i);
            if (temp.getTitle().length() > 15){
                String one = temp.getTitle().substring(0,15) + "...";
                temp.setTitle(one);
            }
            System.out.println(list.get(i));
        }
    }
}
